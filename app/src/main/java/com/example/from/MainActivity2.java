package com.example.from;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name,surname;
    Button byee;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.text_name);
        surname = findViewById(R.id.text_surname);

        String username = getIntent().getStringExtra("keyname");
        String usersurname = getIntent().getStringExtra("keysurname");

        name.setText(username);
        surname.setText(usersurname);
        byee=findViewById(R.id.btnBack);
        byee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("byee","Good Byee");
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}