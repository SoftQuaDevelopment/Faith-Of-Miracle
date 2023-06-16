package com.quateam.game.faith.model.item.weapon.spear;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class Spear extends Weapon {
    public Spear(String itemName, String description, ItemRarity itemRarity,
                 float price, float baseDamage) {
        super(itemName, description, itemRarity, price, baseDamage, WeaponType.SHORT_RANGE, DamageType.PHYSIC);
    }
}
