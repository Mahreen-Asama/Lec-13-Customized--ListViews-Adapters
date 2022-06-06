package com.example.lec13_customizedlistviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView name,id,section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img=findViewById(R.id.imageView);
        name=findViewById(R.id.textView);
        id=findViewById(R.id.textView2);
        section=findViewById(R.id.textView3);

        Intent intent=getIntent();
        img.setImageResource(intent.getIntExtra("image",0));
        name.setText(intent.getStringExtra("name"));
        id.setText(intent.getStringExtra("id"));
        section.setText(intent.getStringExtra("section"));

    }
}