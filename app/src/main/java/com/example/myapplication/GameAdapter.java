package com.example.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    private Context context;
    private ArrayList<GameModel> gameModels;

    public ArrayList<GameModel> getGameModels() {
        return gameModels;
    }

    public void setGameModels(ArrayList<GameModel> gameModels) {

        this.gameModels = gameModels;
    }

    public GameAdapter(Context context) {
        this.context = context;
    }

    public GameAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_game, viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(GameAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getGameModels().get(i).getLogoGame()).into(viewHolder.ivimage);
        viewHolder.tvnama.setText(getGameModels().get(i).getNamaGame());
    }

    @Override
    public int getItemCount() {
        return getGameModels().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivimage;
        private TextView tvnama;
        public ViewHolder(View itemView) {
            super(itemView);
            ivimage = itemView.findViewById(R.id.img);
            tvnama = itemView.findViewById(R.id.teks);
        }
    }
}
