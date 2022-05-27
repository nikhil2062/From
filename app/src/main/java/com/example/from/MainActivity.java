package com.example.from;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText, surnameEditText;
    private Button submitButton;

    public static String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.etName);
        surnameEditText =findViewById(R.id.etSurname);
        submitButton = findViewById(R.id.btnSubmit);


        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String username = nameEditText.getText().toString();
                String usersurname = surnameEditText.getText().toString();
                Log.i(TAG,"firstname="+username+"--surname="+usersurname);
               Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keyname",username);
                intent.putExtra("keysurname",usersurname);
                startActivityForResult(intent,1);

            }

            });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
                Toast.makeText(getApplicationContext(), data.getStringExtra("byee"),Toast.LENGTH_SHORT).show();

            }
        }
    }
}