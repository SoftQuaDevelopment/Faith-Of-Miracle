package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class Ignotum extends Enemy {
    public Ignotum(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Игнотум", "Это нечто наполняет вашу душу страхом.",
                "Нежить", "location", level, healPoint, armorPoint, damagePoint);

    }

}
