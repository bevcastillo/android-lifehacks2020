package com.example.lifehacks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lifehacks.Model.Category;

import org.json.JSONObject;

public class ViewHackActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvCategoryTitle, tvHackContent;
    String strCategory;
    ImageView ivBackArrow, ivPreviousArrow, ivNextArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_hack);

        tvCategoryTitle = findViewById(R.id.tv_category_title);
        ivBackArrow = findViewById(R.id.iv_back_arrow);
        ivPreviousArrow = findViewById(R.id.imgbtn_back);
        ivNextArrow = findViewById(R.id.imgbtn_next);
        tvHackContent = findViewById(R.id.tv_hack_content);

        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            strCategory = bundle.getString("category_name");

            tvCategoryTitle.setText(strCategory);
        }

        ivBackArrow.setOnClickListener(this);
        ivPreviousArrow.setOnClickListener(this);
        ivNextArrow.setOnClickListener(this);

    }

    public void backToCategory() {
        Intent intent = new Intent(ViewHackActivity.this, CategoriesActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.iv_back_arrow:
                backToCategory();
                break;
            case R.id.imgbtn_back:
                break;
            case R.id.imgbtn_next:
                break;
        }
    }

    public void lifeHacks() {
        JSONObject lifeHacks = new JSONObject();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
