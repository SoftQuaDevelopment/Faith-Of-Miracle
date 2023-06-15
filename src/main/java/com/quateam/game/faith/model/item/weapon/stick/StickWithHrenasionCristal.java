package com.quateam.game.faith.model.item.weapon.stick;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public class StickWithHrenasionCristal extends Stick{
    public StickWithHrenasionCristal() {
        super("Посох с хренасовым кристалом", "Обычная палка на конце которой находится хренасовый кристал. С его помощью сила магии усиливается.", ItemRarity.RELICT, price, baseDamage, WeaponType.LONG_RANGE, DamageType.MAGIC);
    }

}
