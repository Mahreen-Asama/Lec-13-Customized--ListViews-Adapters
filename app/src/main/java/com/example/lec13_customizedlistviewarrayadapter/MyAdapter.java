package com.example.lec13_customizedlistviewarrayadapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Student> {


    //right click , 2nd last option
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
    }

    //right click, generate, getItem(,,) method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student stu=getItem(position);

        //(view jisy inflate krna, (name,sectionid,img) ka view = customized_list_view,
        // by default to attatch hoti class aur xml(setContentView() k method sy), yahan is treeky sy bind krna pry ga
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.student_view,parent,false);

        TextView tv_name=convertView.findViewById(R.id.name);
        TextView tv_id=convertView.findViewById(R.id.id);
        TextView tv_section=convertView.findViewById(R.id.section);
        ImageView img=convertView.findViewById(R.id.imageView);

        tv_name.setText(stu.getName());     //write name of student in relevent field
        tv_id.setText(stu.getId());
        tv_section.setText(stu.getSection());
        img.setImageResource(stu.getImage());

        //just to check which item is clicking
        tv_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("id: ",stu.getId());
                //when click go to a new activity, to see details of this item
                // aslo we can go to text activity, --> Qaida
                Intent intent=new Intent(getContext(),MainActivity.class);
            }
        });

        return  convertView;
    }
}
