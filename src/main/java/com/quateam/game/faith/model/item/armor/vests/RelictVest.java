package com.quateam.game.faith.model.item.armor.vests;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class RelictVest extends Armor {
    private static final String ruRarityText = "Реликтовый";
    private static final ArmorTypes armorType = ArmorTypes.VEST;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.RELICT;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 100;
    private static float damageReduction = (float) 20;
    private static String description = ruRarityText + " жилет снижает урон в туловище на " + damageReduction + "%";

    public RelictVest(float price) {
        super(ruRarityText + " жилет", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }
}