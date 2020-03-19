package com.icmm.kulinertasik.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.icmm.kulinertasik.DetailActivity;
import com.icmm.kulinertasik.R;
import com.icmm.kulinertasik.model.Kuliner;

import java.util.ArrayList;

public class ListKulinerAdapter extends RecyclerView.Adapter<ListKulinerAdapter.ListViewHolder> {

    private ArrayList<Kuliner> listKuliner;

    public ListKulinerAdapter(ArrayList<Kuliner> listKuliner) {
        this.listKuliner = listKuliner;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final ImageView imgPhoto, randomImage;
        final TextView tvName, tvDetail, tvHarga;
        final Kuliner kuliner = listKuliner.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kuliner.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(kuliner.getName());
        holder.tvDetail.setText(kuliner.getDetail());
        holder.tvKategori.setText(kuliner.getKategori());
        holder.tvHarga.setText(kuliner.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listKuliner.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                Intent intent = i.putExtra("title", holder.getAdapterPosition());
                intent.putExtra("photo", kuliner.getPhoto());
                intent.putExtra("name", kuliner.getName());
                intent.putExtra("detail", kuliner.getDetail());
                intent.putExtra("kategori", kuliner.getKategori());
                intent.putExtra("harga", kuliner.getHarga());

                v.getContext().startActivity(i);
            }
        });
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_kuliner, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail, tvKategori, tvHarga;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvKategori = itemView.findViewById(R.id.tv_kategori);
            tvHarga = itemView.findViewById(R.id.tv_harga);
        }
    }
}