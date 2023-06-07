package com.quateam.game.faith.model.item.decorations;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.ItemRarity;

public abstract class Decoration extends Item {
    public Decoration(String itemName, String description, ItemRarity itemRarity, float price) {
        super(itemName, description, itemRarity, price);
    }
}
