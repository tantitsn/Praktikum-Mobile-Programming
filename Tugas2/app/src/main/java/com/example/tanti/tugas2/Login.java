package com.example.tanti.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button btnLogin ;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_login);

        user = (EditText)findViewById(R.id.edUsername);
        pass = (EditText)findViewById(R.id.edPassword);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        assert btnLogin != null;
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    if (user.getText().toString().equals("") || pass.getText().toString().equals(""))
    {
        Toast.makeText(getApplicationContext(),"Mohon isi data anda dengan lengkap",Toast.LENGTH_LONG).show();
    }
    else
    {
        if (user.getText().toString().equals("admin") || pass.getText().toString().equals("admin"))
        {
            Toast.makeText(getApplicationContext(),"Selamat anda berhasil login",Toast.LENGTH_SHORT).show();
            user.setText("");
            pass.setText("");

            Intent go = new Intent(this,Krs.class);
            startActivity(go);
        }else
        {
            Toast.makeText(getApplicationContext(),"Mohon maaf anda gagal login",Toast.LENGTH_LONG).show();
            user.setText("");
            pass.setText("");
        }
    }



    }
}
