package com.quateam.game.faith.game_system.inventory;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.decorations.Decoration;
import com.quateam.game.faith.model.item.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements InventorySystem {

    public int money;
    public int maxInventory,maxArmor, maxWeapon, maxDecoration,maxPotion;
    public List<Item> inventory = new ArrayList<>();


    @Override
    public void addItem(Item item) {

        int inventorySize = inventory.size();
        if(inventorySize >= maxInventory) {
            System.out.print("Твой интевнарь полон");
            return;
        }

        inventory.add(item);
    }

    @Override
    public Item getItem(Item item) {
        return null;
    }

    @Override
    public Item getItem(int index) {
        return inventory.get(index);
    }

    @Override
    public void removeItem(int index) {

    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public List<Item> getInventory() {
        return null;
    }

    @Override
    public void setMaxArmor(int maxArmor) {
        this.maxArmor = maxArmor;
    }

    @Override
    public void setMaxWeapon(int maxWeapon) {
        this.maxWeapon = maxWeapon;
    }

    @Override
    public void setMaxDecoration(int maxDecoration) {
        this.maxDecoration = maxDecoration;
    }

    @Override
    public void setMaxPotion(int maxPotion) {
        this.maxPotion = maxPotion;
    }

    @Override
    public void setMaxInventory() {
        this.maxInventory = maxArmor + maxWeapon + maxDecoration + maxPotion;
    }

    @Override
    public void setArmor(Armor armor) {

    }

    @Override
    public void setWeapon(Weapon weapon) {

    }

    @Override
    public void setDecoration(Decoration decoration) {

    }


}
