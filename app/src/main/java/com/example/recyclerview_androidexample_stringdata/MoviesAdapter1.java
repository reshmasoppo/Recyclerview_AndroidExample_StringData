package com.example.recyclerview_androidexample_stringdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesAdapter1 extends RecyclerView.Adapter<MoviesAdapter1.ViewHolder>{

    String[] SubjectValues;
    Context context;

    public MoviesAdapter1(Context context1, String[] SubjectValues1){

        SubjectValues = SubjectValues1;
         context = context1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textview = (TextView)itemView.findViewById(R.id.subject_textview);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView  = LayoutInflater.from(context).inflate(R.layout.subject_items,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textview.setText(SubjectValues[position]);

    }


    @Override
    public int getItemCount() {
        return SubjectValues.length;
    }

//https://www.android-examples.com/android-simple-recyclerview-example-tutorial/
}
