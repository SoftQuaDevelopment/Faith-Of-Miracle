package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class Octopus extends Enemy {
    public Octopus(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Осьминог", "Осьминоги - недружелюбные создания, плавающее у берегов" +
                " королевства Фэйтмир. Любого недоброжелателя осьминог контузит и отбрасывает своими " +
                "мощными щупальцами.", "Подводный/ближний бой", "Пляж/Океан",
                level, healPoint, armorPoint, damagePoint);
    }
}