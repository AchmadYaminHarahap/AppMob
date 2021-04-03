package org.nsh.yaminappsintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRumahSakit(View view) {
        //gambar rumah sakit di klik
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
    public void clickPolisi(View view) {
        //gambar rumah sakit di klik
        Intent i = new Intent(this, Polisi.class);
        startActivity(i);

    }
    public void clickPasar(View view) {
        //gambar rumah sakit di klik
        Intent i = new Intent(this, Pasar.class);
        startActivity(i);

    }
    public void clickSekolah(View view) {
        //gambar rumah sakit di klik
        Intent i = new Intent(this, Sekolah.class);
        startActivity(i);

    }
}