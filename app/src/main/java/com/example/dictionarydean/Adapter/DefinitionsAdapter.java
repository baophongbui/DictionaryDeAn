package com.example.dictionarydean.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionarydean.Models.Definitions;
import com.example.dictionarydean.R;
import com.example.dictionarydean.ViewHolders.DefinitionViewHolder;

import java.util.List;

public class DefinitionsAdapter extends RecyclerView.Adapter<DefinitionViewHolder>{
    private Context context;
    private List<Definitions> definitionsList;

    public DefinitionsAdapter(Context context, List<Definitions> definitionsList) {
        this.context = context;
        this.definitionsList = definitionsList;
    }

    @NonNull
    @Override
    public DefinitionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DefinitionViewHolder(LayoutInflater.from(context).inflate(R.layout.definition_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DefinitionViewHolder holder, int position) {
        holder.txtDefinition.setText("Definition: " + definitionsList.get(position).getDefinition());
        holder.txtExample.setText("Example: " + definitionsList.get(position).getExample());
        StringBuilder synonyms = new StringBuilder();
        StringBuilder antonyms = new StringBuilder();

        synonyms.append(definitionsList.get(position).getSynonym());
        antonyms.append(definitionsList.get(position).getAntonym());
        holder.txtSynonym.setText(synonyms);
        holder.txtAntonym.setText(antonyms);
        holder.txtSynonym.setSelected(true);
        holder.txtAntonym.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return definitionsList.size();
    }
}
