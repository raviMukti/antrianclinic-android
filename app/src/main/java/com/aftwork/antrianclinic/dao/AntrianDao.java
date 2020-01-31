package com.aftwork.antrianclinic.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import com.aftwork.antrianclinic.domain.Pasien;

public class AntrianDao {
    private Context context;
    EditText editIdentitas, editNama;
    String layanan;
    public AntrianDao(Context context) {
        this.context = context;
    }

    public void kosongkan(){
        AntrianClinicDbHelper antrianClinicDbHelper = new AntrianClinicDbHelper(context);
        SQLiteDatabase db = antrianClinicDbHelper.getWritableDatabase();
        db.delete( AntrianClinicDbHelper.TabelAntrian.TABLE_NAME, null, null );
    }

    public void insertAntrian(){
        AntrianClinicDbHelper antrianClinicDbHelper = new AntrianClinicDbHelper( context );

        SQLiteDatabase db = antrianClinicDbHelper.getWritableDatabase();

        ContentValues cv = new ContentValues( );
        cv.put( AntrianClinicDbHelper.TabelAntrian.COLUMN_NAME_IDENTITAS, editIdentitas.toString());
        cv.put( AntrianClinicDbHelper.TabelAntrian.COLUMN_NAME_NAMA_PASIEN, editNama.toString() );
        cv.put( AntrianClinicDbHelper.TabelAntrian.COLUMN_NAME_JENIS_LAYANAN, layanan);
        db.insert( AntrianClinicDbHelper.TabelAntrian.TABLE_NAME, null, cv );
        db.close();
    }
}
