package com.quateam.game.faith.model.player;


import com.quateam.game.faith.model.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Player {

    List<Item> items = new ArrayList<>();

    public Warrior(int level, float healPoint, float armorPoint) {
        super(level, healPoint, armorPoint);
    }




}
