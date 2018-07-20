package com.example.user.obscuralayout.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.obscuralayout.Chat.ChatAdapter;
import com.example.user.obscuralayout.Chat.Chats;
import com.example.user.obscuralayout.IObscura;
import com.example.user.obscuralayout.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.07.2018.
 */

public class ChatFragment extends Fragment {
    private IObscura obscura;

    Context mContext;
    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;
    private List<Chats> chats;


    public ChatFragment(){

    }

    @SuppressLint("ValidFragment")
    public ChatFragment (IObscura obscura){
        this.obscura=obscura;
    }

    public static ChatFragment newInstance(IObscura obscura) {
        ChatFragment fragment = new ChatFragment(obscura);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chat, container, false);
        rv = (RecyclerView)view.findViewById(R.id.rv_chat);
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        rv.setLayoutManager(llm);
//        mAdapter = new ChatAdapter(chats);
//        rv.setAdapter(mAdapter);
        initializeData();
        initializeAdapter();
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
    private void initializeData(){
        chats = new ArrayList<>();
        chats.add(new Chats("Name", "ZZZZ","Time","https://www.wallpaperbackgrounds.org/wp-content/uploads/Picture.jpg","Time" ));

    }
    private void initializeAdapter(){
        mAdapter = new ChatAdapter(chats);
        rv.setAdapter(mAdapter);
    }

}