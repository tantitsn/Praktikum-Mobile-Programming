package com.example.tanti.utspraktikummopro;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by tanti on 23/10/16.
 */
public class BookingFragment extends AppCompatActivity {

    Button btnMeja1, btnMeja2, btnMeja3, btnMeja4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_booking);

        btnMeja1 = (Button) findViewById(R.id.meja1);
        btnMeja2 = (Button) findViewById(R.id.meja2);
        btnMeja3 = (Button) findViewById(R.id.meja3);
        btnMeja4 = (Button) findViewById(R.id.meja4);

        btnMeja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int status1 = 0;
                if (status1 == 0) {
                    status1 = 1;

                    btnMeja1.setText(" MEJA 1 " + "\n" + " BOOKED");
                    Toast.makeText(BookingFragment.this, "Booked", Toast.LENGTH_SHORT).show();
                } else {
                    btnMeja1.setText(" MEJA 1");
                    status1 = 0;
                    Toast.makeText(BookingFragment.this, "Cancel", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnMeja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int status2 = 0;
                if (status2 == 0) {
                    status2 = 1;
                    btnMeja2.setText(" MEJA 2 " + "\n" + " BOOKED");
                    Toast.makeText(BookingFragment.this, "Booked", Toast.LENGTH_SHORT).show();
                } else {
                    btnMeja2.setText(" MEJA 2 ");
                    Toast.makeText(BookingFragment.this, "Cancel", Toast.LENGTH_SHORT).show();
                    status2 = 0;
                }
            }
        });
        btnMeja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int status3 = 0;
                if (status3 == 0) {
                    status3 = 1;
                    btnMeja3.setText(" MEJA 3 " + "\n" + " BOOKED");
                    Toast.makeText(BookingFragment.this, "Booked", Toast.LENGTH_SHORT).show();
                } else {
                    btnMeja1.setText(" MEJA 3");
                    Toast.makeText(BookingFragment.this, "Cancel", Toast.LENGTH_SHORT).show();
                    status3 = 0;
                }
            }
        });
        btnMeja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int status4 = 0;
                if (status4 == 0) {
                    status4 = 1;
                    btnMeja4.setText(" MEJA 4 " + "\n" + " BOOKED");
                    Toast.makeText(BookingFragment.this, "Booked", Toast.LENGTH_SHORT).show();
                } else {
                    btnMeja4.setText(" MEJA 4 ");
                    Toast.makeText(BookingFragment.this, "Cancel", Toast.LENGTH_SHORT).show();
                    status4 = 0;
                }
            }
        });


    }
}
