package com.aftwork.antrianclinic.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.aftwork.antrianclinic.domain.Pasien;

import java.util.List;

public class AntrianAdapter extends ArrayAdapter<Pasien> {

    public AntrianAdapter(@NonNull Context context, int resource, @NonNull List<Pasien> objects) {
        super( context, resource, objects );
    }


}
