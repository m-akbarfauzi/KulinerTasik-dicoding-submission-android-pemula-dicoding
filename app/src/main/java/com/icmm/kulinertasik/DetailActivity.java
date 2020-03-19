package com.icmm.kulinertasik;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.icmm.kulinertasik.adapter.ListKulinerAdapter;
import com.icmm.kulinertasik.model.Kuliner;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    ImageView photo;
    TextView name, detail, kategori, harga;

    private RecyclerView rvRows, rvKuliners;
    private ArrayList<Kuliner> list = new ArrayList<>();

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();

        final String nama = i.getStringExtra("name");
        final String ditel = i.getStringExtra("detail");
        final String category = i.getStringExtra("kategori");
        final String prices = i.getStringExtra("harga");
        final Integer gambar = i.getIntExtra("photo", 0);

        photo = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.tv_item_name);
        kategori = findViewById(R.id.tv_kategori);
        detail = findViewById(R.id.tv_item_detail);
        harga = findViewById(R.id.tv_harga);

        Glide.with(this).load(gambar).into(photo);
        name.setText(nama);
        detail.setText(ditel);
        kategori.setText(category);
        harga.setText(prices);
    }

    private void showRecyclerList() {
        rvKuliners.setLayoutManager(new LinearLayoutManager(this));
        ListKulinerAdapter listKulinerAdapter = new ListKulinerAdapter(list);
        rvKuliners.setAdapter(listKulinerAdapter);
    }

    public void buttonStar(View view) {
        Toast.makeText(this, "Wishlist masih dalam pengembangan!", Toast.LENGTH_SHORT).show();
    }

    public void buttonShare(View view) {
        Toast.makeText(this, "Berbagi masih dalam pengembangan!", Toast.LENGTH_SHORT).show();
    }

    public void buttonBuy(View view) {
        Toast.makeText(this, "Fitur ini masih dalam pengembangan!", Toast.LENGTH_SHORT).show();
    }
}
