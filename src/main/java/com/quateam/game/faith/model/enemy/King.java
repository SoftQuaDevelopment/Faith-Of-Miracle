package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class King extends Enemy {

    public King(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Тод Исидит","В настоящее время занимает престол, который получил от " +
                "отца. Ведёт бой с помощью необычного меча, который возможно передаётся от первого короля ",
                "наземный", "Замок", level, healPoint, armorPoint, damagePoint);
    }
}
