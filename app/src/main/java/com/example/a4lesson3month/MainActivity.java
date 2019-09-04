package com.example.a4lesson3month;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    static final int KEY = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView recyclerView = findViewById(R.id.task_list);

        TaskAdapter adapter = new TaskAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        openDetails(new Task("Some title 1" , "Some description 1 " , new Date() ,new Date() , true));
        openDetails(new Task("Some title 2" , "Some description 2 " , new Date() ,new Date() , false));
        openDetails(new Task("Some title 3" , "Some description 3 " , new Date() ,new Date() , false));

    }

    private void openDetails(Task task){
        Intent intent = new Intent(MainActivity.this , TaskDetailsActivity.class);
        intent.putExtra(TaskDetailsActivity.DETAILS_KEY,task);
        startActivity(intent);
    }
    protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == KEY) {
            if (resultCode == RESULT_OK) {
                String text = data.getStringExtra(DescriptionActivity.RESULT_KEY);
                adapter.addText(text);

}
