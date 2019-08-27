package com.fitriyani.kelilingkubus;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuBangunRuang extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] bangundatar = new String[] { "Kubus", "Balok",
                "Exit" };
        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, bangunruang));
    }

protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
}

protected void tampilkanPilihan(String pilihan) {
        try {
            Intent i = null;
            if (pilihan.equals("Kubus")) {
                i = new Intent(this, Hitungkelilingkubus.class);
            } else if (pilihan.equals("Balok")) {
                i = new Intent(this, Hitungkelilingbalok.class);
            } else if (pilihan.equals("Exit")) {
                finish();
            } else {
                Toast.makeText(this,"Anda Memilih: " + pilihan + " , Actionnya belum dibuat", Toast.LENGTH_LONG).show();
            }
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

