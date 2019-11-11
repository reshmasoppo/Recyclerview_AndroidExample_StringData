package com.example.recyclerview_androidexample_stringdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycleview;
   MoviesAdapter1  recyclerViewAdapter;
    LinearLayoutManager lm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] subjects = {"ANDROID", "PHP", "BLOGGER", "WORDPRESS", "JOOMLA", "ASP.NET", "JAVA", "C++", "MATHS", "HINDI", "ENGLISH"};

         recycleview=(RecyclerView)findViewById(R.id.recyclerview);

        //lm=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

         lm= new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
         recycleview.setLayoutManager(lm);
         recycleview.setHasFixedSize(true);
         recyclerViewAdapter= new MoviesAdapter1(getApplicationContext(), subjects);
         recycleview.setAdapter(recyclerViewAdapter);

    }
}
