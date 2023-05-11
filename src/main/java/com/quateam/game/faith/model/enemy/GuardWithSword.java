package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class GuardWithSword extends Enemy {

    public GuardWithSword(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Мечник","Один из представителей городской стражи. Имеет при себе меч," +
                " обладает лёгким снаряжением, которое позволяет двигатся быстрее.",
                "Наземный/ближний бой","Королевство", level, healPoint, armorPoint, damagePoint);
    }
}
