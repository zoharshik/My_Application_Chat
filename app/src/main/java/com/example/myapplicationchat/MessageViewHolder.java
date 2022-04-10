package com.example.myapplicationchat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageViewHolder extends RecyclerView.ViewHolder {

    public ImageView Image;
    public TextView name;
    public TextView message;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);

        Image = itemView.findViewById(R.id.chat_img);
        name = itemView.findViewById(R.id.chatName);
        message = itemView.findViewById(R.id.chatMessage);
    }
}
