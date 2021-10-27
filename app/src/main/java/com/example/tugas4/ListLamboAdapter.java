package com.example.tugas4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLamboAdapter extends RecyclerView.Adapter<ListLamboAdapter.ListViewHolder>{
    private ArrayList<Lambo> listLambo;

    public ListLamboAdapter(ArrayList<Lambo> list){
        this.listLambo = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_lambo,parent,false);
        return new ListViewHolder( view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        Lambo lambo = listLambo.get(position);
        Glide.with(holder.itemView.getContext())
                .load(lambo.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(lambo.getName());
        holder.tvHarga.setText(lambo.getHarga());

    }

    @Override
    public int getItemCount() {
        return listLambo.size();
    }



    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHarga;

        public ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_lambo);
            tvName = itemview.findViewById(R.id.tv_item_name);
            tvHarga = itemview.findViewById(R.id.tv_harga);
        }
    }
}
