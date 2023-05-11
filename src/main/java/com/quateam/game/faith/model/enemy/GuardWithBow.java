package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class GuardWithBow extends Enemy {

    public GuardWithBow(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Стражник","Один из представителей городской стражи. Имеет при себе двуручный лу, " +
                "который даёт приемущество в дали","Наземный/бой на дистанции",
                "Королевство", level, healPoint, armorPoint, damagePoint);
    }
}
