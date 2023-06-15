package com.quateam.game.faith.model.item.weapon.bow;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public abstract class Bow extends Weapon {

    public Bow(String itemName, String description, ItemRarity itemRarity, float price, float baseDamage, WeaponType weaponType, DamageType damageType) {
        super(itemName, description, itemRarity, price, baseDamage, weaponType.LONG_RANGE, damageType.PHYSIC);
    }
}
