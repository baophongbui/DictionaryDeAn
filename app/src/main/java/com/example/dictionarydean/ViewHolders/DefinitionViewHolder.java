package com.example.dictionarydean.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionarydean.R;

public class DefinitionViewHolder extends RecyclerView.ViewHolder{
    public TextView txtDefinition, txtSynonym, txtAntonym, txtExample;
    public DefinitionViewHolder(@NonNull View itemView) {
        super(itemView);
        txtDefinition = itemView.findViewById(R.id.txtDefinition);
        txtSynonym = itemView.findViewById(R.id.txtSynonym);
        txtAntonym = itemView.findViewById(R.id.txtAntonym);
        txtExample = itemView.findViewById(R.id.txtExample);
    }
}
