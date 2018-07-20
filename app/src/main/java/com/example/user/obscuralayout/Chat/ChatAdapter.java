package com.example.user.obscuralayout.Chat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.obscuralayout.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10.07.2018.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatHolder> {
    Context mContext;

    List<Chats> chats = new ArrayList<Chats>();


    public ChatAdapter(List<Chats> chats){
        this.chats = chats;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    @Override
    public ChatHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat, viewGroup, false);
        ChatHolder ch = new ChatHolder(v);
        return ch;
    }

    @Override
    public void onBindViewHolder(ChatHolder holder, int position) {
        holder.tvName.setText(chats.get(position).name);
        holder.tvLastMessageTime.setText(chats.get(position).lastMessageTime);
        holder.tvLastMessage.setText(chats.get(position).lastMessage);

        Picasso.with(mContext)
                .load(chats.get(position).getPhotoUrl().toString())
                .placeholder(R.drawable.ic_profile_photo_dummy)
                .into(holder.ivProfilePhoto);
    }



    @Override
    public int getItemCount() {
        return chats.size();
    }




}