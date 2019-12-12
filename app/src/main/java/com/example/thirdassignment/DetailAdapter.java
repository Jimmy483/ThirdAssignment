package com.example.thirdassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder>{

    Context mContext;
    List<Detail> detailList;

    public DetailAdapter(Context mContext, List<Detail> detailList)
    {
        this.mContext=mContext;
        this.detailList=detailList;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detailview,parent,false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, final int position) {

        final Detail detail=detailList.get(position);
        holder.timgProfile.setImageResource(detail.getImageid());

        holder.tdeleted.setImageResource(detail.getDeletedet());
        holder.tdeleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailList.remove(position);
                notifyItemRemoved(position);
            }
        });
        holder.tname.setText(detail.getName());
        holder.tgender.setText(detail.getGender());
        holder.tage.setText(detail.getAge());
        holder.tlocation.setText(detail.getLocation());
    }

    @Override
    public int getItemCount() {
        return detailList.size();
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder{
        ImageView timgProfile,tdeleted;
        TextView tname,tlocation,tage,tgender;

        public DetailViewHolder(View itemView)
        {
            super(itemView);
            timgProfile=itemView.findViewById(R.id.imgProfile);
            tdeleted=itemView.findViewById(R.id.imgDelete);
            tname=itemView.findViewById(R.id.txtName);
            tlocation=itemView.findViewById(R.id.txtLocation);
            tage=itemView.findViewById(R.id.txtAge);
            tgender=itemView.findViewById(R.id.txtGender);
        }

            }
}
