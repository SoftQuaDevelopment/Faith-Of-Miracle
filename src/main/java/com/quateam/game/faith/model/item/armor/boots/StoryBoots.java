package com.quateam.game.faith.model.item.armor.boots;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class StoryBoots extends Armor {
    private static final String ruRarityText = "Исторические";
    private static final ArmorTypes armorType = ArmorTypes.BOOTS;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.STORY;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 800;
    private static float damageReduction = (float) 100;
    private static String description = ruRarityText + " бутсы снижают урон в ступни на " + damageReduction + "%";

    public StoryBoots(float price) {
        super(ruRarityText + " бутсы", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }
}
