package com.example.lifehacks.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifehacks.Model.Category;
import com.example.lifehacks.R;
import com.example.lifehacks.ViewHackActivity;

import java.util.List;

public class CategoryRVAdapter extends RecyclerView.Adapter<CategoryRVAdapter.ViewHolder>{

    Context context;
    List<Category> list;

    public CategoryRVAdapter(Context context, List<Category> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_category_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);

        viewHolder.cardCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String categoryName = list.get(viewHolder.getAdapterPosition()).getCategoryName();

                Intent intent = new Intent(view.getContext(), ViewHackActivity.class);
                intent.putExtra("category_name", categoryName);
                v.getContext().startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Category data = list.get(position);

        holder.tvCategoryTitle.setText(data.getCategoryName());
        holder.ivCategoryBanner.setImageResource(data.getCategoryBanner());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvCategoryTitle;
        ImageView ivCategoryBanner;
        CardView cardCategory;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCategoryTitle = itemView.findViewById(R.id.tv_category_title);
            ivCategoryBanner = itemView.findViewById(R.id.iv_category);
            cardCategory = itemView.findViewById(R.id.card_category);
        }
    }
}
