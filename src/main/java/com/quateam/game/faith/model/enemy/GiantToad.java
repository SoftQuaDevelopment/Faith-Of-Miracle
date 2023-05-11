package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.model.Enemy;

public class GiantToad extends Enemy {
    public GiantToad(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Гигантская жаба", "Этот вид издревле населял болота, а жидкость выделяемая на их" +
                " кожу служила источником пищи для месных племён. Люди населяющие местные болота считают этих животных " +
                "священными и не позволяет приезжим уничтожать их.", "Гигантские животные", "location",
                level, healPoint, armorPoint, damagePoint);

    }
}
