package com.quateam.game.faith.model.enemy;


import com.quateam.game.faith.model.Enemy;

public class Lupizdrik extends Enemy {
    public Lupizdrik(int level, float healPoint, float armorPoint, float damagePoint) {
        super("Лупиздрик", "Лупиздрик - маленький противный щегол, который много базарит." +
                        " Гуляет по дворам королевства и заговаривает с обычными жителями," +
                        " притворяясь дружелюбным, но на самом деле желая забрать у них деньги " +
                        "Считает себя умным и интересным человеком.",
                "Наземный", "Королевство", level, healPoint, armorPoint, damagePoint);
    }
}
