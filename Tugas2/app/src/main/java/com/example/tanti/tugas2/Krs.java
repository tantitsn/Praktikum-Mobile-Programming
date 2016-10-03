package com.example.tanti.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tanti on 02/10/16.
 */
public class Krs extends AppCompatActivity {

    @BindView(R.id.edNim)
    EditText _nim ;
    @BindView(R.id.edUsername) EditText _nama ;
    @BindView(R.id.cbMobile)
    CheckBox _cbMobile ;
    @BindView(R.id.cbPPL) CheckBox _cbPPL ;
    @BindView(R.id.cbPMobile) CheckBox _cbPMobile ;
    @BindView(R.id.btnSubmit)
    Button _btnSubmit ;

    String nama , nim , mt1 , mt2, mt3, cb1,cb2,cb3 ;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_krs);
        ButterKnife.bind(this);


        mt1 = _cbMobile.getText().toString();
        mt2 = _cbPMobile.getText().toString();
        mt3 = _cbPPL.getText().toString();
        cb2= "";
        cb1= "";
        cb3= "";
        _cbPMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_cbPMobile.isChecked())
                {
                    cb2 = mt2;
                }else
                {
                    cb2= "";
                }
            }
        });
        _cbMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_cbMobile.isChecked())
                {
                    cb1 = mt1;
                }else
                {
                    cb1= "";
                }
            }
        });

        _cbPPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_cbPPL.isChecked())
                {
                    cb3 = mt3;
                }else
                {
                    cb3= "";
                }
            }
        });
        _btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = _nama.getText().toString();
                nim = _nim.getText().toString();


                Bundle b = new Bundle();
                b.putString("kirimNama",nama);
                b.putString("kirimNim",nim);
                b.putString("kirimMT1",cb1);
                b.putString("kirimMT2",cb2);
                b.putString("kirimMT3",cb3);

                Intent i = new Intent(Krs.this, Hasil.class);
                i.putExtras(b);
                startActivity(i);





            }











        });




    }
}
