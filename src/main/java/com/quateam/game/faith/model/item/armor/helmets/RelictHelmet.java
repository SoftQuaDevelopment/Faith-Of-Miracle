package com.quateam.game.faith.model.item.armor.helmets;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;
import com.quateam.game.faith.model.item.armor.types.DamageReductionTypes;

public class RelictHelmet extends Armor {
    private static final String ruRarityText = "Реликтовый";
    private static final ArmorTypes armorType = ArmorTypes.HELMET;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.RELICT;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 100;
    private static float damageReduction = (float) 20;
    private static String description = ruRarityText + " шлем снижает урон в голову на " + damageReduction + "%";

    public RelictHelmet(float price) {
        super(ruRarityText + " шлем", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }

}
