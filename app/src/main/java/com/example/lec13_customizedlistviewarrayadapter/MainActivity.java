package com.example.lec13_customizedlistviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //same code as in prev. class
        lv=findViewById(R.id.lv1);

        ArrayList<Student> arrayList=new ArrayList<Student>();

        arrayList.add(new Student("ali","1","alpha",R.drawable.ananas));
        arrayList.add(new Student("arham","2","alpha",R.drawable.angoor1));
        arrayList.add(new Student("ashara","3","beta",R.drawable.batakh));
        arrayList.add(new Student("ashara","4","beta",R.drawable.barish));
        arrayList.add(new Student("ashara","5","beta",R.drawable.batakh));
        arrayList.add(new Student("ashara","6","beta",R.drawable.batakh));

        MyAdapter myAdapter=new MyAdapter(this,0,arrayList);

        lv.setAdapter(myAdapter);

    }

}