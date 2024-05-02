package com.example.dictionarydean.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionarydean.R;

public class MeaningsViewHolder extends RecyclerView.ViewHolder{
    public TextView txtPartOfSpeech;
    public RecyclerView recycler_definitions;
    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);
        txtPartOfSpeech = itemView.findViewById(R.id.txtPartOfSpeech);
        recycler_definitions = itemView.findViewById(R.id.recycler_definitions);
    }
}
