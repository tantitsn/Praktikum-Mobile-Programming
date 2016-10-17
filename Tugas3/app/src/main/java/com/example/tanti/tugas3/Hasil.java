package com.example.tanti.tugas3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by tanti on 14/10/16.
 */
public class Hasil extends AppCompatActivity {

    Session2 session2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        session2 = new Session2(getApplicationContext());

        TextView  txtNim = (TextView) findViewById(R.id.txtNim);
        TextView  txtNama = (TextView) findViewById(R.id.txtNama);

        HashMap<String, String> user = session2.getUserDetails();

        // name
        String nim = user.get(Session2.KEY_NIM);

        // email
        String nama = user.get(Session2.KEY_NAMA);

        // displaying user data
        txtNim.setText(Html.fromHtml( nim + "</b>"));
        txtNama.setText(Html.fromHtml( nama + "</b>"));

    }
}
