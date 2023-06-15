package com.quateam.game.faith.model.item.weapon.bow;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class IronBow extends Bow{
    public IronBow() {
        super("Железный лук", "Довольно крепкий лук, сделанный из железа.", ItemRarity.RELICT, price, baseDamage, WeaponType.LONG_RANGE, DamageType.PHYSIC);
    }

}
