package com.quateam.game.faith.model.item.weapon.sword;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class IronSword extends Sword{
    public IronSword() {
        super("Железный меч", "Такие мечи пользуются популярностью в королевстве. Таким уже можно посражатся.", ItemRarity.RELICT, price, baseDamage, WeaponType.HAND, DamageType.PHYSIC);
}
