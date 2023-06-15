package com.quateam.game.faith.model.item.weapon.stick;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class HrenasionStick extends Stick{
    public HrenasionStick() {
        super("Посох хренасийцев", "Подобными посохами часто пользуются хренасийцы. Этот посох имеет металическую основу на которой произрастают кристалы хренаса.", ItemRarity.HRENASITOVIY, price, baseDamage, WeaponType.LONG_RANGE, DamageType.MAGIC);
    }
}
