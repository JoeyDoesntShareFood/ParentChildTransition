package com.example.jyothisp.parentchildtransition;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.CardView;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends android.support.v4.app.Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.activity_main, container, false);


        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }

        };
//        handler.postDelayed(runnable, 3000);


        final View cardView = view.findViewById(R.id.card);
        final TextView textView = view.findViewById(R.id.text);
        final View rootView = view.findViewById(R.id.box);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = getString(R.string.transition_string);

                getFragmentManager()
                        .beginTransaction()
                        .addSharedElement(cardView, ViewCompat.getTransitionName(cardView))
                        .addSharedElement(textView, ViewCompat.getTransitionName(textView))
                        .addToBackStack("tag")
                        .setCustomAnimations(android.R.animator.fade_in, R.animator.nothing)
                        .replace(R.id.container, new SecondFragment())
                        .commit();

            }
        });
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
