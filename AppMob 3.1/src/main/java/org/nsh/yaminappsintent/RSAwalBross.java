package org.nsh.yaminappsintent;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class RSAwalBross extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "SMS Center", "Driving Direction", "Website", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")) {
                String nomortel = "tel:+62 761 21000";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center")) {
                String smsText = "Achmad Yamin H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:085361718731"));
                a.putExtra("sms_body", smsText);

            } else if (pilihan.equals("Driving Direction")) {
                String lokasirs = "https://www.google.com/search?safe=strict&client=firefox-b-d&tbs=lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&tbm=lcl&q=rs%20awal%20bross&rflfq=1&num=10&ved=2ahUKEwiGkZahmODvAhVVb30KHQmcB5YQtgN6BAgLEAc&rlst=f#rlfi=hd:;si:;mv:[[0.5243869,101.4606926],[0.4598035999999999,101.386347]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equals("Website")) {
                String website = "http://awalbros.com/branch/ayani/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Awal Bross");
            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}