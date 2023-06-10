package com.quateam.game.faith.model.item.armor.cloaks;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class ElementaryCloak extends Armor {
    private static final String ruRarityText = "Элементарный";
    private static final ArmorTypes armorType = ArmorTypes.CLOAK;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.ELEMENTARY;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 25;
    private static float damageReduction = (float) 100;
    private static String description = ruRarityText + " плащ снижает урон в спину на " + damageReduction + "%";

    public ElementaryCloak(float price) {
        super(ruRarityText + " плащ", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }
}
