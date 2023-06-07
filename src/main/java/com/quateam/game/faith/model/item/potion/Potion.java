package com.quateam.game.faith.model.item.potion;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.ItemRarity;

public abstract class Potion extends Item {
    public Potion(String itemName, String description, ItemRarity itemRarity, float price) {
        super(itemName, description, itemRarity, price);
    }
}
