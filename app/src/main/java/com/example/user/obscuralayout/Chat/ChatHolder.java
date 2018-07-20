package com.example.user.obscuralayout.Chat;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.obscuralayout.R;

/**
 * Created by User on 10.07.2018.
 */

public class ChatHolder extends RecyclerView.ViewHolder {
    CardView cardView;
    TextView tvName;
    TextView tvLastMessage;
    TextView tvLastMessageTime;
    ImageView ivProfilePhoto;

    public ChatHolder(View itemView) {

        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.cv);
        tvName = (TextView) itemView.findViewById(R.id.tv_item_chat_user_name);
        tvLastMessage = (TextView) itemView.findViewById(R.id.tv_item_chat_last_message);
        tvLastMessageTime = (TextView) itemView.findViewById(R.id.tv_item_chat_date_last_msg);
        ivProfilePhoto = (ImageView) itemView.findViewById(R.id.iv_item_chat_profile);
    }
}
