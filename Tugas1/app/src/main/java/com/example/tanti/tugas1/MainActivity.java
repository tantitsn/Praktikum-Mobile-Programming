package com.example.tanti.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView nama,nim,email,angkatan;
    EditText Enama, Enim,Eemail,Eangkatan;
    Button BtnTampil;
    String Snama,Snim,Semail,Sangkatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (TextView)findViewById(R.id.TxtNama);
        email = (TextView)findViewById(R.id.TxtEmail);
        nim = (TextView)findViewById(R.id.TxtNIM);
        angkatan = (TextView)findViewById(R.id.TxtAngkatan);

        Enama = (EditText)findViewById(R.id.EdtNama);
        Eemail = (EditText)findViewById(R.id.EdtEmail);
        Enim = (EditText)findViewById(R.id.EdtNIM);
        Eangkatan = (EditText)findViewById(R.id.EdtAngkatan);
        BtnTampil = (Button)findViewById(R.id.BtnTampil);

        assert BtnTampil != null;
        BtnTampil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Snama = Enama.getText().toString();
        Semail = Eemail.getText().toString();
        Snim = Enim.getText().toString();
        Sangkatan= Eangkatan.getText().toString();

        nama.setText("Nama             : "+Snama);
        email.setText("Email              : "+Semail);
        nim.setText("NIM                 : "+Snim);
        angkatan.setText("Angkatan       : "+Sangkatan);

        Enama.setVisibility(View.INVISIBLE);
        Eemail.setVisibility(View.INVISIBLE);
        Enim.setVisibility(View.INVISIBLE);
        Eangkatan.setVisibility(View.INVISIBLE);


    }
}
