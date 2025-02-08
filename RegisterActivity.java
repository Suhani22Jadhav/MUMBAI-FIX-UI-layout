package com.example.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.appproject.databinding.ActivityRegisterBinding;
//import androidx.core.graphics.Insets;


public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;
    DatabaseHelper databaseHelper;

    EditText Username;
    EditText password;
    Button registerButton;
    EditText confirm_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.rgemail.getText().toString();
                String password = binding.rgpassword.getText().toString();
                String confirmpw = binding.confirmpassword.getText().toString();


                if (email.equals("") || password.equals("") || confirmpw.equals(""))
                    Toast.makeText(RegisterActivity.this,"All fields are mandatory",Toast.LENGTH_SHORT).show();
                else {
                    if(password.equals(confirmpw)) {
                        Boolean checkUserEmail = databaseHelper.checkEmail(email);

                        if(checkUserEmail == false) {
                            Boolean insert = databaseHelper.insertData(email, password);

                            if(insert == true) {
                                Toast.makeText(RegisterActivity.this,"Registration Successful!",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(intent);
                            } else{
                                Toast.makeText(RegisterActivity.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(RegisterActivity.this,"User already exists, Please Login",Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(RegisterActivity.this,"Invalid password",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


//        Username = findViewById(R.id.rgemail);
//        password = findViewById(R.id.rgpassword);
//        confirm_pw = findViewById(R.id.confirmpassword);
//        registerButton = findViewById(R.id.regButton);
//
//
//        registerButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (Username.getText().toString().equals("user@mumbaikar") && password.getText().toString().equals("mumbai")) {
//                    Toast.makeText(RegisterActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(RegisterActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
//                }
//            }
//        TextView login = findViewById(R.id.baklogin);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            }
//                public void onClick(View view) {
//                    startActivity( new Intent(RegisterActivity.this,MainActivity.class));
//                    finish();
//                }

        binding.BackLoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
//    setContentView(R.layout.activity_register);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;