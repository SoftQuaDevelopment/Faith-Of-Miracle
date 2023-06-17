package com.quateam.game.faith.model.item.armor;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

public class Vest extends Armor {

    private static final ArmorTypes armorType = ArmorTypes.VEST;
    public Vest(ItemRarity itemRarity, float price) {
        super(syncArmorName(itemRarity, armorType), syncArmorDescription(itemRarity, armorType), armorType, ArmorFeatureTypes.NONE, itemRarity, price, 0.0f, syncArmorHealPoints(itemRarity, armorType), syncArmorDamageReduction(itemRarity, armorType));
    }

    @Override
    public void fix() {
        super.fix();
        super.setArmorHealPoints(syncArmorHealPoints(itemRarity, armorType));
    }

    @Override
    public boolean isArmorFixed() {
        if (getArmorHealPoints() == syncArmorHealPoints(itemRarity, armorType) && !(isArmorBroken()))
            return true;
        return false;

    }

}
