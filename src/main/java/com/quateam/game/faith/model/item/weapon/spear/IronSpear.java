package com.quateam.game.faith.model.item.weapon.spear;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class IronSpear extends Spear{
    public IronSpear() {
        super("Железное копьё", "Копьё сделанное из железа. Достаточно длинное чтобы держать врага на растоянии.", ItemRarity.RELICT, price, baseDamage, WeaponType.SHORT_RANGE, DamageType.PHYSIC);
    }
}
