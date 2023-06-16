package com.quateam.game.faith;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;
import com.quateam.game.faith.model.item.weapon.bow.Bow;

public class Main {
    public static void main(String[] args) {

        Weapon bow = new Bow("Потрёпанный лук",
                "Явно видно, что этому луку не повезло в жизни, однако он ещё годится для использования.",
                ItemRarity.HRENASITOVIY, 10, 10);


    }
}