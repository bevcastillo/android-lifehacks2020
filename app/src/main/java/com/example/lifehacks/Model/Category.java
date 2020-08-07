package com.example.lifehacks.Model;

public class Category {

    int categoryBanner;
    String categoryName;

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(int categoryBanner, String categoryName) {
        this.categoryBanner = categoryBanner;
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryBanner() {
        return categoryBanner;
    }

    public void setCategoryBanner(int categoryBanner) {
        this.categoryBanner = categoryBanner;
    }
}
