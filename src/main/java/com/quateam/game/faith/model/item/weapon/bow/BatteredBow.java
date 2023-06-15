package com.quateam.game.faith.model.item.weapon.bow;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class BatteredBow extends Bow{
    public BatteredBow() {
        super("Потрёпанный лук", "Явно видно, что этому луку не повезло в жизни, однако он ещё годится для использования.", ItemRarity.ELEMENTARY, price, baseDamage, WeaponType.LONG_RANGE, DamageType.PHYSIC);
    }
}
