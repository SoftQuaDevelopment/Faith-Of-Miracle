package com.quateam.game.faith.model.item.weapon;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.ItemRarity;

public abstract class Weapon extends Item {

    public float baseDamage;
    public WeaponType weaponType;

    public Weapon(String itemName, String description, ItemRarity itemRarity, float price, float baseDamage, WeaponType weaponType) {
        super(itemName, description, itemRarity, price);
        this.baseDamage = baseDamage;
        this.weaponType = weaponType;
    }
}
