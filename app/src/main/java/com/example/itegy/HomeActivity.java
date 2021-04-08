package com.example.itegy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.itegy.Fragments.AccountFragment;
import com.example.itegy.Fragments.CartFragment;
import com.example.itegy.Fragments.CategoriesFragment;
import com.example.itegy.Fragments.FavoriteFragment;
import com.example.itegy.Fragments.HomeFragment;
import com.example.itegy.R.id;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import static com.google.android.material.bottomnavigation.BottomNavigationView.*;

public class HomeActivity extends AppCompatActivity {

   // SearchView searchView;



    private Object OnNavigationItemSelectedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView btNavigation = (BottomNavigationView) findViewById(R.id.bottomnavigation);
        btNavigation.setOnNavigationItemSelectedListener(navigationlis);



    }


        ////////////////////////////////////////////////////////// bottom navigation///////////////////////////////

    public BottomNavigationView.OnNavigationItemSelectedListener navigationlis =
            new OnNavigationItemSelectedListener() {


                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    androidx.fragment.app.Fragment SelectFragment = null;
                    switch (item.getItemId()) {
///*                    getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,HomeFragment).commit();
                        case id.home:
                            selectFragment = new HomeFragment();
                            break;

                        case id.categories:
                            selectFragment = new CategoriesFragment();
                            break;
                        case id.account:
                            selectFragment = new AccountFragment();
                            break;

                        case id.favorite:
                            selectFragment = new FavoriteFragment();
                            break;

                        case id.cart:
                            selectFragment = new CartFragment();
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + item.getItemId());
                    }
                    ///////////////////////////////replacing fragments from home activity//////////////////////////////
                  //  FragmentTransaction trans =getSupportFragmentManager().beginTransaction();
                  //  trans.replace(R.id.framelayout, SelectFragment);
                   // trans.commit();

                  // getSupportFragmentManager().beginTransaction().replace(id.framelayout, SelectFragment).commit();
                    return true;
                }


            };


    //////////////////////menue/////////////


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflat = getMenuInflater();
        inflat.inflate(R.menu.homemnue,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
