package com.example.lifehacks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.lifehacks.Adapter.CategoryRVAdapter;
import com.example.lifehacks.Model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    private ImageView ivSettings;
    private RecyclerView rvCategories;
    List<Category> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ivSettings = findViewById(R.id.imageView2);
        rvCategories = findViewById(R.id.rv_categories);
    }

    @Override
    protected void onStart() {
        super.onStart();

        list = new ArrayList<>();

        list.add(new Category(R.drawable.ic_coronavirus, "Coronavirus"));
        list.add(new Category(R.drawable.ic_life, "Life"));
        list.add(new Category(R.drawable.ic_health, "Fitness & Health"));
        list.add(new Category(R.drawable.ic_kitchen, "Kitchen"));
        list.add(new Category(R.drawable.ic_relationship, "Relationship"));
        list.add(new Category(R.drawable.ic_study, "Study"));
        list.add(new Category(R.drawable.ic_pets, "Pet"));
        list.add(new Category(R.drawable.ic_tech, "Technology"));

        CategoryRVAdapter adapter = new CategoryRVAdapter(getApplicationContext(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvCategories.setLayoutManager(layoutManager);
        rvCategories.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        rvCategories.setItemAnimator(new DefaultItemAnimator());

        rvCategories.setAdapter(adapter);
    }
}
