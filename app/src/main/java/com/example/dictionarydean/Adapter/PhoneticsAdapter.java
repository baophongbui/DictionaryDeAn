package com.example.dictionarydean.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionarydean.Models.Phonetics;
import com.example.dictionarydean.R;
import com.example.dictionarydean.ViewHolders.PhoneticViewHolder;

import java.util.List;

public class PhoneticsAdapter extends RecyclerView.Adapter<PhoneticViewHolder>{
    private Context context;
    private List<Phonetics> phoneticsList;

    public PhoneticsAdapter(Context context, List<Phonetics> phoneticsList) {
        this.context = context;
        this.phoneticsList = phoneticsList;
    }

    @NonNull
    @Override
    public PhoneticViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneticViewHolder(LayoutInflater.from(context).inflate(R.layout.phonetics_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneticViewHolder holder,  int position) {
        holder.txtPhonetic.setText(phoneticsList.get(position).getText());
        holder.btnAudio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer player = new MediaPlayer();
                    try {
                        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
                        player.setDataSource(phoneticsList.get(position).getAudio());
                        player.prepare();
                        player.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(context, "Can't play audio", Toast.LENGTH_SHORT).show();
                    }
                }
        });

    }

    @Override
    public int getItemCount() {
        return phoneticsList.size();
    }
}