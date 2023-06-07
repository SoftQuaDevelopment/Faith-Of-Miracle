package com.quateam.game.faith.game_system.inventory;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.decorations.Decoration;
import com.quateam.game.faith.model.item.weapon.Weapon;

import java.util.List;

public interface InventorySystem {

    void addItem(Item item);
    Item getItem(Item item);
    Item getItem(int index);
    void removeItem(int index);
    void removeItem(Item item);
    List<Item> getInventory();


    void setMaxArmor(int max);
    void setMaxWeapon(int max);
    void setMaxDecoration(int max);
    void setMaxPotion(int max);
    void setMaxInventory();


    void setArmor(Armor armor);
    void setWeapon(Weapon weapon);
    void setDecoration(Decoration decoration);

}
