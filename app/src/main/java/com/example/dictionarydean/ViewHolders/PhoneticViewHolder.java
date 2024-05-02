package com.example.dictionarydean.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionarydean.R;

public class PhoneticViewHolder extends RecyclerView.ViewHolder{
    public TextView txtPhonetic;
    public ImageButton btnAudio;
    public PhoneticViewHolder(@NonNull View itemView) {
        super(itemView);
        txtPhonetic = itemView.findViewById(R.id.txtPhonetic);
        btnAudio = itemView.findViewById(R.id.btnAudio);
    }
}
