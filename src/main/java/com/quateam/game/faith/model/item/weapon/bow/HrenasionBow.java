package com.quateam.game.faith.model.item.weapon.bow;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class HrenasionBow extends Bow{
    public HrenasionBow() {
        super("Лук хренамийцев", "Такими луками часто пользуются хренамийцы. Если вложить ману в него перед выстрелом, то стрела может лишить врага способности использовать магию.", ItemRarity.HRENASITOVIY, price, baseDamage, WeaponType.LONG_RANGE, DamageType.PHYSIC);
    }
}
