package com.aftwork.antrianclinic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aftwork.antrianclinic.fragment.AkunFragment;
import com.aftwork.antrianclinic.fragment.AntriFragment;
import com.aftwork.antrianclinic.fragment.ChatFragment;
import com.aftwork.antrianclinic.fragment.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
            implements BottomNavigationView.OnNavigationItemSelectedListener {

//    ListView listView;
//
//    String[] artikel = {
//            "Berita Kesehatan 1","Berita Kesehatan 2","Berita Kesehatan 3","Berita Kesehatan 4"
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

//        listView = findViewById( R.id.lv_artikel );
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>( this, R.layout.fr_home, artikel );
//        listView.setAdapter( arrayAdapter );

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
