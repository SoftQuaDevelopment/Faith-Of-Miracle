package com.quateam.game.faith.model.item.armor.shields;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class HrenasitoviyShield extends Armor {
    private static final String ruRarityText = "Хренаситовый";
    private static final ArmorTypes armorType = ArmorTypes.SHIELD;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.HRENASITOVIY;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 200;
    private static float damageReduction = (float) 40;
    private static String description = ruRarityText + " щит снижает урон в грудь и живот на " + damageReduction + "%";

    public HrenasitoviyShield(float price) {
        super(ruRarityText + " щит", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }
}
