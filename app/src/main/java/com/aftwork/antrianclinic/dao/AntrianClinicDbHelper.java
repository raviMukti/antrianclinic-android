package com.aftwork.antrianclinic.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import androidx.annotation.Nullable;

public class AntrianClinicDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Antrian.db";
    public static final Integer DATABASE_VERSION = 1;
    SQLiteDatabase db;

    // create tabel antrian
    private static final String SQL_CREATE_ANTRIAN
            = "create table "+ TabelAntrian.TABLE_NAME +" (" +
            TabelAntrian._ID + "integer primary key, " +
            TabelAntrian.COLUMN_NAME_IDENTITAS + " TEXT, " +
            TabelAntrian.COLUMN_NAME_NAMA_PASIEN + " TEXT, " +
            TabelAntrian.COLUMN_NAME_NOMOR_ANTRIAN + " INTEGER, " +
            TabelAntrian.COLUMN_NAME_JENIS_LAYANAN + " TEXT)";

    public AntrianClinicDbHelper(Context context) {
        super(context,
                DATABASE_NAME,
                null, DATABASE_VERSION);
    }

    public AntrianClinicDbHelper open() throws SQLException {
        db = getWritableDatabase();
        return this;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ANTRIAN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_CREATE_ANTRIAN);
        onCreate(db);
    }

    // Skema tabel antrian
    public abstract class TabelAntrian implements BaseColumns {
        public static final String TABLE_NAME = "antrian";
        public static final String COLUMN_NAME_IDENTITAS = "identitas";
        public static final String COLUMN_NAME_NAMA_PASIEN = "nama_pasien";
        public static final String COLUMN_NAME_NOMOR_ANTRIAN = "nomor_antrian";
        public static final String COLUMN_NAME_JENIS_LAYANAN = "layanan";

    }
}
