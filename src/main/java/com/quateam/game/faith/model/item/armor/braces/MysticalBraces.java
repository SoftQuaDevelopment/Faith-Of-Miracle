package com.quateam.game.faith.model.item.armor.braces;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.Armor;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class MysticalBraces extends Armor {
    private static final String ruRarityText = "Мистические";
    private static final ArmorTypes armorType = ArmorTypes.BRACES;
    private static ArmorFeatureTypes armorFeatureType = ArmorFeatureTypes.NONE;
    private static final ItemRarity itemRarity = ItemRarity.MYSTICAL;
    private static float reductionTimeSeconds = (float) 0;
    private static float armorHealPoints = (float) 400;
    private static float damageReduction = (float) 80;
    private static String description = ruRarityText + " наручи снижают урон в руки на " + damageReduction + "%";

    public MysticalBraces(float price) {
        super(ruRarityText + " наручи", description, armorType, armorFeatureType, itemRarity, price, reductionTimeSeconds, armorHealPoints, damageReduction);
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(armorHealPoints);
    }
}
