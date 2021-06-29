package com.example.itegy;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.itegy.Fragments.AccountFragment;
import com.example.itegy.Fragments.CartFragment;
import com.example.itegy.Fragments.FavoriteFragment;
import com.example.itegy.Fragments.HomeFragment;
import com.example.itegy.R.id;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    // SearchView searchView;


    BottomNavigationView btNavigation;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //  getWindow().getDecorView().setSystemUiVisibility(onCreatePanelView().SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        frameLayout=(FrameLayout) findViewById(id.framelayout);
        btNavigation = (BottomNavigationView) findViewById(R.id.bottomnavigation);
        btNavigation.setOnNavigationItemSelectedListener(navigationlis);

        ////////////replacing fragments
        getSupportFragmentManager().beginTransaction().replace(id.framelayout,new HomeFragment()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationlis= new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment selectFragment = null;
            switch (menuItem.getItemId()) {
                case id.home:
                    selectFragment = new HomeFragment();
                    break;

                case id.account:
                    selectFragment = new AccountFragment();
                    break;


                case id.cart:
                    selectFragment = new CartFragment();
                    break;

                case id.favorite:
                    selectFragment = new FavoriteFragment();
                    break;



            }
            getSupportFragmentManager().beginTransaction().replace(id.framelayout, selectFragment).commit();


            return false;
        }
    };}


