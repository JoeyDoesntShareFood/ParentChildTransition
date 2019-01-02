package com.example.jyothisp.parentchildtransition;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.collapsing);
        toolbarLayout.setTitle("Event Name");
//        toolbarLayout.setCollapsedTitleTextColor(getColor(R.color.titleTextColor));


        final LinearLayout registration = findViewById(R.id.event_registration_layout);
        final LinearLayout description = findViewById(R.id.event_description_layout);

        TabLayout tabLayout = findViewById(R.id.tab);
        final TabLayout.Tab regTab = tabLayout.newTab().setIcon(R.drawable.reg_icon);
        final TabLayout.Tab detailsTab = tabLayout.newTab().setIcon(R.drawable.details_icon);
        tabLayout.addTab(regTab);
        tabLayout.addTab(detailsTab);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.equals(regTab)){
                    registration.setVisibility(View.VISIBLE);
                    description.setVisibility(View.GONE);
                } else if (tab.equals(detailsTab)){
                    registration.setVisibility(View.GONE);
                    description.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


//        setContentView(R.layout.fragment_first);

//        getSupportFragmentManager().beginTransaction().replace(R.id.container,  new FirstFragment()).commit();


    }

//    private void startWithTransition(){
//        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//
//        String transName = getString(R.string.transition_string);
//        String transName2 = getString(R.string.transition_string_text);
//
//        Pair<View, String> p1 = Pair.create((View) cardView, transName);
//        Pair<View, String> p2 = Pair.create((View) textView, transName2);
//
//        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, p1,p2);
//
//        ActivityCompat.startActivity(cardView.getContext(), intent, optionsCompat.toBundle());
//
//    }
}
