package com.quateam.game.faith.model.item.armor.boots;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class MysticalBoots extends Armor {
    private static final String ruRarityText = "Мистические";
    private static final ArmorTypes armorType = ArmorTypes.BOOTS;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.MYSTICAL;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 400;
    private static float damageReduction = (float) 80;
    private static String description = ruRarityText + " бутсы снижают урон в ступни на " + damageReduction + "%";

    public MysticalBoots(float price) {
        super(ruRarityText + " бутсы", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }
}
