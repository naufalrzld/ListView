package com.naufalrzld.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvItem = findViewById(R.id.lv_item);

        Mahasiswa m1 = new Mahasiswa("1234567890", "Januar", "Informatika", 2016);
        Mahasiswa m2 = new Mahasiswa("1234567891", "Rizki", "Informatika", 2017);
        Mahasiswa m3 = new Mahasiswa("1234567892", "Bob", "Sistem Informasi", 2016);
        Mahasiswa m4 = new Mahasiswa("1234567893", "Robin", "Informatika", 2018);
        Mahasiswa m5 = new Mahasiswa("1234567894", "Samuel", "Management", 2016);

        listMahasiswa.add(0, m1);
        listMahasiswa.add(1, m2);
        listMahasiswa.add(2, m3);
        listMahasiswa.add(3, m4);
        listMahasiswa.add(4, m5);

        Adapter adapter = new Adapter(this, listMahasiswa);

        lvItem.setAdapter(adapter);
    }
}
