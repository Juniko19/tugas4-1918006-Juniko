package com.example.tugasr4recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WpAdapter extends RecyclerView.Adapter<WpAdapter.WpViewHolder>{
    private ArrayList<Wp> dataList;
    public WpAdapter(ArrayList<Wp> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public WpAdapter.WpViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_wp, parent, false);
        return new WpViewHolder(view);
    }
    public void onBindViewHolder(WpViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtSt1.setText(dataList.get(position).getSt1());
        holder.txtSt2.setText(dataList.get(position).getSt2());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class WpViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtSt1, txtSt2;
        private ImageView Foto;
        public WpViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
            txtSt1 = (TextView) itemView.findViewById(R.id.txt_st1);
            txtSt2 = (TextView) itemView.findViewById(R.id.txt_st2);
        }
    }
}
