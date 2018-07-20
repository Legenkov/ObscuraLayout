package com.example.user.obscuralayout.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.obscuralayout.IObscura;
import com.example.user.obscuralayout.R;

/**
 * Created by User on 22.03.2018.
 */

public class PeopleFragment extends Fragment {
    private IObscura obscura;
    public PeopleFragment(){

    }
    @SuppressLint("ValidFragment")
    public PeopleFragment (IObscura obscura){
        this.obscura=obscura;
    }

    public static PeopleFragment newInstance(IObscura obscura) {
        PeopleFragment fragment = new PeopleFragment(obscura);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.people, container, false);
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
