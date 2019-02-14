package com.naufalrzld.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<Mahasiswa> listMahasiswa;

    public Adapter(Context context, ArrayList<Mahasiswa> listMahasiswa) {
        this.context = context;
        this.listMahasiswa = listMahasiswa;
    }

    @Override
    public int getCount() {
        return listMahasiswa.size();
    }

    @Override
    public Mahasiswa getItem(int i) {
        return listMahasiswa.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_list, viewGroup, false);
        }

        Mahasiswa mahasiswa = getItem(i);

        TextView tvNIM = view.findViewById(R.id.tv_nim);
        TextView tvNama = view.findViewById(R.id.tv_nama);

        tvNIM.setText(mahasiswa.getNim());
        tvNama.setText(mahasiswa.getNama());

        return view;
    }
}
