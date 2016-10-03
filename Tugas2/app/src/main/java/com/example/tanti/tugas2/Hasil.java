package com.example.tanti.tugas2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tanti on 02/10/16.
 */
public class Hasil extends AppCompatActivity {
    String nim, nama, mt1, mt2, mt3;
    ArrayList<String> matkul = new ArrayList<String>();
    ListView listView;
    ArrayAdapter adapter;
    @BindView(R.id.TvNIM)
    TextView _tampilNIM ;
    @BindView(R.id.TvNama) TextView _tampilNama ;
    @BindView(R.id.LsMatkul) ListView _tampilList ;



    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_hasil);
        ButterKnife.bind(this);
        StringBuilder s = new StringBuilder(3);


        Bundle b = getIntent().getExtras();
        nama = b.getString("kirimNama");
        nim = b.getString("kirimNim");
        mt1 = b.getString("kirimMT1");
        mt2 = b.getString("kirimMT2");
        mt3 = b.getString("kirimMT3");

      /*  nim = getIntent().getStringExtra("kirimNim");
        nama = getIntent().getStringExtra("kirimNama");
        mt1 = getIntent().getStringExtra("kirimMT1");
        mt2 = getIntent().getStringExtra("kirimMT2");
        mt3 = getIntent().getStringExtra("kirimMT3");*/

        adapter = new ArrayAdapter<String>(this,R.layout.item_list,R.id.Item,matkul);
        _tampilList.setAdapter(adapter);

        _tampilNIM.setText(": "+nim);
        _tampilNama.setText(": "+nama);




        if (!nama.equals("")) {


        }
        if (!nim.equals("")) {

        }
        if (!mt1.equals("")) {
            matkul.add(mt1);


            if (!mt2.equals("")) {
                matkul.add(mt2);
            }
            if (!mt3.equals("")) {
                matkul.add(mt3);
            }


            Toast.makeText(Hasil.this, s, Toast.LENGTH_LONG).show();
        }

    }

}
