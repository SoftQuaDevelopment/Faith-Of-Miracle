package com.quateam.game.faith.model.item.armor;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.ItemRarity;

public abstract class Armor extends Item {
    public Armor(String itemName, String description, ItemRarity itemRarity, float price) {
        super(itemName, description, itemRarity, price);
    }
}
