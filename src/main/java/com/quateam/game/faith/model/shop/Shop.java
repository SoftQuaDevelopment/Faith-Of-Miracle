package com.quateam.game.faith.model.shop;

import com.quateam.game.faith.model.item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

    public List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item cellItem(Item item) {
        float price = item.getPrice();
        //todo: add check for price
        itemList.remove(item);
        return item;
    }

}
