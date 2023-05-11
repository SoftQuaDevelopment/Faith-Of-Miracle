package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class ArmoredGuard extends Enemy {

    public ArmoredGuard(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Бронированный Стражник","Один из представителей городской стражи. " +
                "Имеет при себе двуручный меч, который способен нанести колоссальный ущерб его противнику," +
                " а так же наделён более стойким снарежением","Наземный/ближний бой","Королевство",
                level, healPoint, armorPoint, damagePoint);
    }
}
