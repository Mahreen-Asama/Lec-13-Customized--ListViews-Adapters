package com.example.lec13_customizedlistviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView name,id,section;
    SeekBar seekBar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img=findViewById(R.id.imageView);
        name=findViewById(R.id.textView);
        id=findViewById(R.id.textView2);
        section=findViewById(R.id.textView3);
        listView=findViewById(R.id.list1);

        Intent intent=getIntent();
        //img.setImageResource((int) Long.parseLong(intent.getStringExtra("image")));
        name.setText(intent.getStringExtra("name"));
        id.setText(intent.getStringExtra("id"));
        section.setText(intent.getStringExtra("section"));

        seekBar=findViewById(R.id.seekBar2);
        seekBar.setMax(50);
        seekBar.setProgress(30);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min=1;
                int tableNumber;
                if(i<min){
                    tableNumber=min;
                    seekBar.setProgress(min);
                }
                else{
                    tableNumber=i;
                }
                Toast.makeText(getApplicationContext(),Integer.toString(i),Toast.LENGTH_SHORT).show();
                final ArrayList<String> tableContent=new ArrayList<String>();
                for(int x=1; x<=10; x++){
                    tableContent.add(Integer.toString(x*tableNumber));
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,tableContent);
                listView.setAdapter(adapter);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}