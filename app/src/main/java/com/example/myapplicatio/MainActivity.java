package com.example.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.se.omapi.Session;

import com.google.ar.core.AugmentedImageDatabase;
import com.google.ar.core.Config;

public class MainActivity extends AppCompatActivity {

    private customarFragment arfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arfragment= (customarFragment) getSupportFragmentManager().findFragmentById(R.id.fragment)


    }

    public void setupdatabase(Config config, Session session)
    {
        Bitmap foxbitmap= BitmapFactory.decodeResource(getResources(),R.drawable.arcticfox_diffuse);
        AugmentedImageDatabase aid=new AugmentedImageDatabase(session);
        aid.addImage("arcticfox_diffuse",foxbitmap);
        config.setAugmentedImageDatabase(aid);

    }


}
