package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class EliteGuardWithBow extends Enemy {
    public EliteGuardWithBow(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Элитный лучник","Один из приближённых стражников к королю. В отличие от городских " +
                "лучников владение луком на много выше. Так же имеют необычный окрас брони. ",
                "Наземный/бой на дистанции","Королевство", level, healPoint, armorPoint, damagePoint);
    }
}
