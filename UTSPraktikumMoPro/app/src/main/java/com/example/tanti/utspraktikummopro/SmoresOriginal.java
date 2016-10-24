package com.example.tanti.utspraktikummopro;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tanti.utspraktikummopro.R;

/**
 * Created by tanti on 24/10/16.
 */
public class SmoresOriginal extends AppCompatActivity {

    Intent tangkap;
    TextView judul , konten;
    ImageView gambar;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_s1);

        judul= (TextView)findViewById(R.id.txtJudul);
        konten= (TextView)findViewById(R.id.txtKonten);
        gambar= (ImageView)findViewById(R.id.imgGambar);
        tangkap = getIntent();


String alamat;

        String paramHasil = tangkap.getStringExtra("param");

        if (paramHasil.equals("0"))
        {
            judul.setText("Smores Original");
            gambar.setImageResource(R.drawable.satu);
            konten.setText("S'mores Original adalah s&apos;mores yang tidak menggunakan topping tambahan apapun. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("1"))

        {

            gambar.setImageResource(R.drawable.dua);
            judul.setText("Smores Strawberry");
            konten.setText("S'mores Strawberry adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("2"))
        {
            judul.setText("Smores Banana");
            gambar.setImageResource(R.drawable.tiga);
            konten.setText("S'mores Banana adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("3"))
        {
            judul.setText("Smores Chococran");
            gambar.setImageResource(R.drawable.empat);
            konten.setText("S'mores Chococran adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("4"))
        {
            judul.setText("Smores Cracker");
            gambar.setImageResource(R.drawable.lima);
            konten.setText("S'mores Cracker adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("5"))
        {
            judul.setText("Smores Oreo");
            gambar.setImageResource(R.drawable.enam);
            konten.setText("S'mores Oreo adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("6"))
        {
            judul.setText("Smores Kismis");
            gambar.setImageResource(R.drawable.tujuh);
            konten.setText("S'mores Kismis adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("7"))
        {
            judul.setText("Smores Chocolate");
            gambar.setImageResource(R.drawable.tiga);
            konten.setText("S'mores Chocolate adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("8"))
        {
            judul.setText("Smores Vanilla");
            gambar.setImageResource(R.drawable.lima);
            konten.setText("S'mores Vanilla adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }else  if (paramHasil.equals("9"))
        {
            judul.setText("Smores Milk");
            gambar.setImageResource(R.drawable.dua);
            konten.setText("S'mores Milk adalah s'mores yang tidak menggunakan topping tambahan strawberry. S'mores ini menggunakan bahan dasar marssmallow dan dicampur dengan biskuit dan coklat pasta");

        }

    }
}
