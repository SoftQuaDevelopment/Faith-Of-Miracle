package com.quateam.game.faith.model.item.weapon.book;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class Book extends Weapon {


    public Book(String itemName, String description, ItemRarity itemRarity,
                float price, float baseDamage) {
        super(itemName, description, itemRarity, price, baseDamage,
                WeaponType.SHORT_RANGE, DamageType.MAGIC);
    }
}
