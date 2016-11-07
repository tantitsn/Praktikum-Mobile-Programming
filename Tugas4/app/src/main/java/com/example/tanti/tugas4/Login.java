package com.example.tanti.tugas4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by tanti on 06/11/16.
 */
public class Login extends AppCompatActivity {
    Button btnLogin;
    DataHelper dbHelper;

    EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.halaman_login);
        dbHelper = new DataHelper(getApplicationContext());
        btnLogin= (Button)findViewById(R.id.btnLogin);
        edtUsername=(EditText)findViewById(R.id.edtUsername);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username , password;

                username = edtUsername.getText().toString();
                password = edtPassword.getText().toString();

                int row = dbHelper.cekLogin(username,password);
                if (row != 0)
                {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(Login.this, "aaaa", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
