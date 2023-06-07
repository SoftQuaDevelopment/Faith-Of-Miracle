package com.quateam.game.faith.model.player;

import com.quateam.game.faith.game_system.battle.Entity;
import com.quateam.game.faith.game_system.damage.Damage;
import com.quateam.game.faith.game_system.inventory.Inventory;
import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.item.Item;

import java.util.List;

public class Player implements Entity {

    private int level;
    private float healPoint;
    private float armorPoint;
    private int x;
    private int y;

    private final Inventory inventory;

    public Player(int level, float healPoint, float armorPoint) {
        this.level = level;
        this.healPoint = healPoint;
        this.armorPoint = armorPoint;
        inventory = new Inventory();
    }

    public List<Item> getInventory() {
        return inventory.getInventory();
    }

    public void addItem(Item item) {
        inventory.addItem(item);
    }

    public void attackOnEnemy(Enemy enemy, Damage damage) {
        enemy.getDamage(damage);
    }

    public void getDamage(Damage damage) {
        float baseDamage = damage.getBaseDamage();

        if(armorPoint == 0.0f) {
            System.out.println("Нанесен " + baseDamage + " по жизни игрока");
            healPoint = healPoint - baseDamage;
        } else {
            System.out.println("Нанесен " + baseDamage + " по броне игрока");
            armorPoint = armorPoint - baseDamage;
        }

        System.out.println("hp: " + healPoint);
        System.out.println("ap: " + armorPoint);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
}
