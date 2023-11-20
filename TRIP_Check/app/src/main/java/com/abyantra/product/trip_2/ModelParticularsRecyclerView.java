package com.abyantra.product.trip_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.abyantra.product.trip_2.Model.dao.Pojo.ModelParticulars;
import com.abyantra.product.trip_check.R;

import java.util.ArrayList;

public class ModelParticularsRecyclerView extends androidx.recyclerview.widget.RecyclerView.Adapter<ModelParticularsRecyclerView.ViewHolder> {

    Context context;
    ArrayList<ModelParticulars> arrayList = new ArrayList<>();

    public ModelParticularsRecyclerView(Context context, ArrayList<ModelParticulars> arrayList){

        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.particulars_card_2,parent,false);
      ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.time.setText(arrayList.get(position).getTime());
        holder.location.setText(arrayList.get(position).getLocation());
        holder.remark.setText(arrayList.get(position).getRemarks());
        holder.latLong.setText(arrayList.get(position).getLatLong());

    }



    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder  extends androidx.recyclerview.widget.RecyclerView.ViewHolder{

        TextView time,location,remark,latLong;
        CardView paticularsCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            time = itemView.findViewById(R.id.taskTime);
            location = itemView.findViewById(R.id.taskLocation);
            remark = itemView.findViewById(R.id.taskRemark);
            latLong = itemView.findViewById(R.id.taskPosition);

        }
    }
}
