package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class Cobald extends Enemy {
    public Cobald(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Кобальд", "Кобальд - хранитель богатств темных и сырых пещер, таких же темных, " +
                "как и его намерения. Кобальд атакует незванных гостей своей тяжелой каменной киркой", "Подземный/ближний бой",
                "Пещеры", level, healPoint, armorPoint, damagePoint);
    }
}