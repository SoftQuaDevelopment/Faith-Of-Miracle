package com.quateam.game.faith.model.item.weapon.book;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public abstract class Book extends Weapon {
    public Book(String itemName, String description, ItemRarity itemRarity, float price, float baseDamage, WeaponType weaponType,DamageType damageType) {
        super(itemName, description, itemRarity, price, baseDamage, weaponType.SHORT_RANGE, damageType.MAGIC);
    }
}
