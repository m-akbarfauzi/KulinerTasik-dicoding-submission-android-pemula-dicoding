package com.icmm.kulinertasik;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.icmm.kulinertasik.adapter.ListKulinerAdapter;
import com.icmm.kulinertasik.model.Kuliner;
import com.icmm.kulinertasik.model.KulinersData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKuliners;
    private ArrayList<Kuliner> list = new ArrayList<>();
    private Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKuliners = findViewById(R.id.rv_kuliner);
        rvKuliners.setHasFixedSize(true);

        list.addAll(KulinersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKuliners.setLayoutManager(new LinearLayoutManager(this));
        ListKulinerAdapter listKulinerAdapter = new ListKulinerAdapter(list);
        rvKuliners.setAdapter(listKulinerAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.profile) {
            Intent moveProfile = new Intent(MainActivity.this, AboutProfile.class);
            startActivity(moveProfile);
            return true;
        }
        return false;
    }
}
