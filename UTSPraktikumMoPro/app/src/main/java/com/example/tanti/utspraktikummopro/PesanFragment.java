package com.example.tanti.utspraktikummopro;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tanti.utspraktikummopro.adapter.Product;
import com.example.tanti.utspraktikummopro.adapter.ProductListAdapter;
import com.example.tanti.utspraktikummopro.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MUL 01 on 10/18/2016.
 */

public class PesanFragment extends AppCompatActivity implements AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener {

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    public PesanFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);
        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);
        productListView.setOnItemClickListener(this);
        productListView.setOnItemLongClickListener(this);

        Button btSimpan = (Button) findViewById(R.id.simpan);
        assert btSimpan != null;
        btSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPemesanan = new Intent(getApplicationContext(), KeranjangPesanan.class);
                startActivity(iPemesanan);
                finish();

            }
        });

    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Product product = (Product) parent.getItemAtPosition(position);
        String apa = Integer.toString(position);

            Intent iOri= new Intent(PesanFragment.this, SmoresOriginal.class);
            iOri.putExtra("param",apa);
            startActivity(iOri);



        Toast.makeText(getApplicationContext(), product.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> arg0, View view, int position, long arg3) {
        ImageView button = (ImageView) view.findViewById(R.id.imgbtn_favorite);

        String tag = button.getTag().toString();
        if (tag.equalsIgnoreCase("grey")) {
            sharedPreference.addFavorite(getApplicationContext(), products.get(position));
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.add_favr),
                    Toast.LENGTH_SHORT).show();

            button.setTag("green");
            button.setImageResource(R.drawable.add);
        } else {
            sharedPreference.removeFavorite(getApplicationContext(), products.get(position));
            button.setTag("grey");
            button.setImageResource(R.drawable.addnon);
            Toast.makeText(getApplicationContext(),
                    getResources().getString(R.string.remove_favr),
                    Toast.LENGTH_SHORT).show();
        }

        return true;
    }

    private void setProducts() {

        Product product1 = new Product(1, "S'mores Original","S'mores dengan varian marsmallow dan cracker", 60000);
        Product product2 = new Product(2, "S'mores Strawberry",
                "S'mores dengan varian marsmallow dan cracker ditambah dengan buah strawberry", 50000);
        Product product3 = new Product(3, "S'mores Banana",
                "S'mores dengan varian marsmallow dan cracker ditambah dengan buah pisang", 45000);
        Product product4 = new Product(4, "S'mores Cococran",
                "S'mores dengan varian marsmallow dan cracker ditambah cococran", 46000);
        Product product5 = new Product(5, "S'mores Cracker",
                "S'mores dengan varian marsmallow dan cracker ", 48000);
        Product product6 = new Product(6, "S'mores Oreo","S'mores dengan varian marsmallow dan biskuit oreo", 50000);
        Product product7 = new Product(7, "S'mores Kismis",
                "S'mores dengan varian marsmallow dan taburan kismis", 40000);
        Product product8 = new Product(8, "S'mores Chocolate",
                "S'mores dengan varian marsmallow dan taburan chocolate", 38000);
        Product product9 = new Product(9, "S'mores Vanila",
                "S'mores dengan varian marsmallow dan tabutan vanila", 39000);
        Product product10 = new Product(10, "S'mores Milk",
                "S'mores dengan varian marsmallow dan fla susu murni asli dari sapi", 50000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
    }


}
