package com.quateam.game.faith.model.item.weapon.bow;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class Bow extends Weapon {

    public Bow(String itemName, String description, ItemRarity itemRarity,
               float price, float baseDamage) {

        super(itemName, description, itemRarity, price, baseDamage, WeaponType.LONG_RANGE, DamageType.PHYSIC);

    }
}
