package com.quateam.game.faith.model.item.weapon.spear;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class SharpenedStick extends Spear{
    public SharpenedStick() {
        super("Заточеная палка", "Палка с острым концом. Ею можно больно ударить в даль.", ItemRarity.ELEMENTARY, price, baseDamage, WeaponType.SHORT_RANGE, DamageType.PHYSIC);
    }
}
