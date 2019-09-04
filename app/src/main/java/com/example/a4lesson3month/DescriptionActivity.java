package com.example.a4lesson3month;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

public class DescriptionActivity extends AppCompatActivity {

    Button saveButton;
    EditText title;
    EditText title2;
    DatePicker datePicker;
    DatePicker datePicker2;
    CheckBox done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        saveButton = findViewById(R.id.save);
        title = findViewById(R.id.title1);
        title2 = findViewById(R.id.title2);
        datePicker = findViewById(R.id.start1);
        datePicker2 = findViewById(R.id.end2);
        done = findViewById(R.id.done);

        public void save (View view){
            Intent intent = new Intent();
            intent.putExtra(RESULT_KEY, EditText.getText());
            setResult(RESULT_OK, intent);
            finish();


                }
            }
        }

