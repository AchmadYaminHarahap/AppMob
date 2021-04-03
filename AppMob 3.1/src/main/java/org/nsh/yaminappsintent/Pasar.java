package org.nsh.yaminappsintent;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pasar extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listPasar = new String[] {"Pesona Swalayan","Moelmart Swalayan","Paus Swalayan"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listPasar));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan){
        try {
            Intent a = null;
            if (pilihan.equals("Pesona Swalayan")) {
                a = new Intent(this,PesonaSwalayan.class);

            } else if (pilihan.equals("Moelmart Swalayan")) {
                a = new Intent(this,MoelmartSwalayan.class);

            }else if (pilihan.equals("Paus Swalayan")) {
                a = new Intent(this, PausSwalayan.class);
            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
