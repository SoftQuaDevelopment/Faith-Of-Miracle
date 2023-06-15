package com.quateam.game.faith.model.item.weapon.stick;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public abstract class Stick extends Weapon {
    public Stick(String itemName, String description, ItemRarity itemRarity, float price, float baseDamage, WeaponType weaponType, DamageType damageType) {
        super(itemName, description, itemRarity, price, baseDamage, weaponType.LONG_RANGE, damageType.MAGIC);
    }

}
