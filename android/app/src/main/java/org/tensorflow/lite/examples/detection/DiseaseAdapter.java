package org.tensorflow.lite.examples.detection;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.tensorflow.lite.examples.detection.model.DiseaseModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/***********************************
 * Created by Babar on 9/26/2020.  *
 ***********************************/
public class DiseaseAdapter extends RecyclerView.Adapter<DiseaseAdapter.SubItemViewHolder> {

    private List<DiseaseModel> subItemList;
    private Context context;

    DiseaseAdapter(Context context,List<DiseaseModel> subItemList) {
        this.subItemList = subItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public SubItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.disease_item, viewGroup, false);
        return new SubItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubItemViewHolder subItemViewHolder, int i) {
        DiseaseModel subItem = subItemList.get(i);
        subItemViewHolder.tvSubItemTitle.setText(subItem.getDiseaseName());
        subItemViewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DiseaseDetailScreen.class);
                intent.putExtra("disease",subItem.getDiseaseName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }

    class SubItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvSubItemTitle;
        View view;
        SubItemViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            tvSubItemTitle = itemView.findViewById(R.id.tv_sub_item_title);
        }
    }
}