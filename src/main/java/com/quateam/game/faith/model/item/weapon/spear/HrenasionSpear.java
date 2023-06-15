package com.quateam.game.faith.model.item.weapon.spear;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class HrenasionSpear extends Spear{
    public HrenasionSpear() {
        super("Копьё хренамийцев", "Копьё обожаемое хренамийцами. Если в него направить ману, то можно будет ударить в даль.", ItemRarity.HRENASITOVIY, price, baseDamage, WeaponType.SHORT_RANGE, DamageType.PHYSIC);
    }
}
