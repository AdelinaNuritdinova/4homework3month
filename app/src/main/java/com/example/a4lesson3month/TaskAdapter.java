package com.example.a4lesson3month;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    ArrayList<Task> tasks;

    public TaskAdapter(){
        tasks = new ArrayList<>();
        tasks.add(new Task("Some title" , "Some description" , new Date() ,new Date() , false));
        tasks.add(new Task("Some title 2" , "Some description 2" , new Date() ,new Date() , true));
        tasks.add(new Task("Some title 3" , "Some description 3" , new Date() ,new Date() , true));
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_task,parent,false);
        return new TaskViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.onBind(tasks.get(position));
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
