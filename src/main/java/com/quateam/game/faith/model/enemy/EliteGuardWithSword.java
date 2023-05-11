package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class EliteGuardWithSword extends Enemy {
    public EliteGuardWithSword(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Элитный мечник","Один из приблежённых к королю войнов. В отличие от городской стражи " +
                "дерётся более осмысленно нанося больше повреждений.","Наземный/ближний бой",
                "Королевство", level, healPoint, armorPoint, damagePoint);
    }
}
