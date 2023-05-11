package com.quateam.game.faith.model;

public abstract class Enemy {
    private String name;
    private String description;
    private String type;
    private Object location; // Указываем строку, где будет название вашей локации
    private int level;
    private float healPoint;
    private float armorPoint;
    private float damagePoint;

    public Enemy(String name, String description, String type, Object location, int level, float healPoint,
                 float armorPoint, float damagePoint) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
        this.level = level;
        this.healPoint = healPoint;
        this.armorPoint = armorPoint;
        this.damagePoint = damagePoint;
    }
}
