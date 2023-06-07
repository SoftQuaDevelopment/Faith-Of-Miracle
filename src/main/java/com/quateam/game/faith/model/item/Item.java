package com.quateam.game.faith.model.item;

public abstract class Item {

    public String itemName;
    public String description;
    public ItemRarity itemRarity;
    public float price;
    public Item(String itemName, String description, ItemRarity itemRarity, float price) {
        this.itemName = itemName;
        this.description = description;
        this.itemRarity = itemRarity;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
}
