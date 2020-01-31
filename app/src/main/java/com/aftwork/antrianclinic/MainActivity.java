package com.aftwork.antrianclinic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.aftwork.antrianclinic.dao.AntrianClinicDbHelper;
import com.aftwork.antrianclinic.dao.AntrianDao;
import com.aftwork.antrianclinic.fragment.AkunFragment;
import com.aftwork.antrianclinic.fragment.AntriFragment;
import com.aftwork.antrianclinic.fragment.ChatFragment;
import com.aftwork.antrianclinic.fragment.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
            implements BottomNavigationView.OnNavigationItemSelectedListener {

    AntrianDao db;
    EditText editIdentitas, editNama;
    RadioGroup radiolayanan;
    String layanan;
    Button btnInsertAntrian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        editIdentitas = (EditText)findViewById( R.id.editTextIdentitas );
        editNama = (EditText)findViewById( R.id.editTextNama );
        radiolayanan = (RadioGroup)findViewById( R.id.layananRadio );
        btnInsertAntrian = (Button)findViewById( R.id.btnAntri );


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
            ChatFragment fragment=new ChatFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
        }


    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id=menuItem.getItemId();

        Fragment fragment= null;

        switch (id){

            case R.id.nav_chat:
                fragment=new ChatFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,fragment)
                        .commit();
                break;
            case R.id.nav_antri:
                fragment=new AntriFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,fragment)
                        .commit();
                break;
            case R.id.nav_home:
                fragment=new HomeFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,fragment)
                        .commit();
                break;
            case R.id.nav_user:
                fragment=new AkunFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,fragment)
                        .commit();
                break;
        }
        return true;
    }
}
