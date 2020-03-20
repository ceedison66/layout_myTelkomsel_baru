package com.example.ui_belanja;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<Model> Models;

    public Adapter(ArrayList<Model> Models){
        this.Models = Models;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.imageViewRecycle.setImageResource(Models.get(position).getLogo());
        holder.textView8.setText(Models.get(position).getSatu());
        holder.textView9.setText(Models.get(position).getDua());
        holder.textView10.setText(Models.get(position).getTiga());
        holder.textView11.setText(Models.get(position).getEmpat());
        holder.textView13.setText(Models.get(position).getLima());
    }

    @Override
    public int getItemCount() {
        return Models.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewRecycle;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView13;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewRecycle = itemView.findViewById(R.id.imageViewRecycle);
            textView8 = itemView.findViewById(R.id.textRecycle);
            textView9 = itemView.findViewById(R.id.textRecycle2);
            textView10 = itemView.findViewById(R.id.textRecycle3);
            textView11 = itemView.findViewById(R.id.textRecycle4);
            textView13 = itemView.findViewById(R.id.textRecycle5);
            textView13.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        }

    }

}
