package com.example.lifehacks.Model;

public class Hack {
    Category category;
    String hack_desc;
    Boolean isFavorite;

    public Hack() {
    }

    public Hack(Category category, String hack_desc, Boolean isFavorite) {
        this.category = category;
        this.hack_desc = hack_desc;
        this.isFavorite = isFavorite;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getHack_desc() {
        return hack_desc;
    }

    public void setHack_desc(String hack_desc) {
        this.hack_desc = hack_desc;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }
}
