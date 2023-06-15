package com.quateam.game.faith.model.item.weapon.sword;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class HrenasionSword extends Sword{
    public HrenasionSword() {
        super("Меч хренамийцев", "Такими мечами часто пользуются хренамийцы. Если в него вложить немного маны, то его урон увеличится.", ItemRarity.HRENASITOVIY, price, baseDamage, WeaponType.HAND, DamageType.PHYSIC);
}
