package com.icmm.kulinertasik;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutProfile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void buttonFacebook(View view){
        String url = "https://facebook.com/m.akbarfz";
        Intent openBrowser = new Intent(Intent.ACTION_VIEW);
        openBrowser.setData(Uri.parse(url));
        startActivity(openBrowser);
    }

    public void buttonYoutube(View view){
        String url = "https://youtube.com/MuhammadAkbarFauzii";
        Intent openBrowser = new Intent(Intent.ACTION_VIEW);
        openBrowser.setData(Uri.parse(url));
        startActivity(openBrowser);
    }

    public void buttonInstagram(View view){
        String url = "https://instagram.com/m_akbarfauzi";
        Intent openBrowser = new Intent(Intent.ACTION_VIEW);
        openBrowser.setData(Uri.parse(url));
        startActivity(openBrowser);
    }

    public void buttonWhatsApp(View view){
        String url = "https://wa.me/6282214023200";
        Intent openBrowser = new Intent(Intent.ACTION_VIEW);
        openBrowser.setData(Uri.parse(url));
        startActivity(openBrowser);
    }
}
