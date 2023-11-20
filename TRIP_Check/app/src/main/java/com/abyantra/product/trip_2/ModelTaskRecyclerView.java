package com.abyantra.product.trip_2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;


import com.abyantra.product.trip_2.Model.dao.Pojo.ModelTasks;
import com.abyantra.product.trip_check.R;

import java.util.ArrayList;

public class ModelTaskRecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<ModelTaskRecyclerView.ViewHolder> {

    Context context;
    ArrayList<ModelTasks> arrayList = new ArrayList<>();

    public ModelTaskRecyclerView(Context context, ArrayList<ModelTasks> arrayList){

        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

//        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.taskName.setText(arrayList.get(position).getTaskName());
        holder.taskType.setText(arrayList.get(position).getTaskType());
        holder.taskDate.setText(arrayList.get(position).getTaskDate());

        holder.taskCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Task"+position,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context,MainActivity2.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

        ImageView imageView;
        TextView taskName,taskType,taskDate;
        CardView taskCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//            imageView = itemView.findViewById(R.id.imageView);
            taskName = itemView.findViewById(R.id.taskName);
            taskType = itemView.findViewById(R.id.taskType);
            taskDate = itemView.findViewById(R.id.taskDate);
            taskCard = itemView.findViewById(R.id.taskCard);

        }
    }
}
