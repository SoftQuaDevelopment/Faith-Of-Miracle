package com.quateam.game.faith.model.item.weapon;

import com.quateam.game.faith.model.item.ItemRarity;

public class Bow extends Weapon{

    public Bow(String itemName, String description, ItemRarity itemRarity, float price, float baseDamage, WeaponType weaponType) {
        super(itemName, description, itemRarity, price, baseDamage, weaponType);
    }
}
