package com.quateam.game.faith;

import com.quateam.game.faith.map.GameMap;
import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.bow.Bow;
import com.quateam.game.faith.model.item.weapon.sword.Sword;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;
import com.quateam.game.faith.model.map.region.Desert;
import com.quateam.game.faith.model.map.region.Region;
import com.quateam.game.faith.model.map.zone.DarkDesert;
import com.quateam.game.faith.model.map.zone.Zone;
import com.quateam.game.faith.model.shop.Shop;
import com.quateam.game.faith.model.shop.WeaponShop;

public class Main {
    public static void main(String[] args) {

        GameMap gameMap = new GameMap();
        Region desert= new Desert();
        Zone darkDesert = new DarkDesert();

        Shop weaponShop = new WeaponShop();
        weaponShop.addItem(bow);
        weaponShop.addItem(sword);

        darkDesert.addShop(weaponShop);
        desert.addZone(darkDesert);
        gameMap.addRegion(desert);



    }
}