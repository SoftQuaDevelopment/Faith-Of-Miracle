package com.quateam.game.faith.model.item.weapon.sword;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class WoodenSword extends Sword{
    public WoodenSword() {
        super("Деревянный меч", "Такими мечами пользуются на тренировачных площадках. Им особо не подерешся.", ItemRarity.ELEMENTARY, price, baseDamage, WeaponType.HAND, DamageType.PHYSIC);
}
