package com.quateam.game.faith.model.item.weapon.stick;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class LongStick extends Stick{
    public LongStick() {
        super("Длинная палка", "Подобные палки можно найти в любом лесу. Сгодится для направления маны.", ItemRarity.ELEMENTARY, price, baseDamage, WeaponType.LONG_RANGE, DamageType.MAGIC);
    }

}
