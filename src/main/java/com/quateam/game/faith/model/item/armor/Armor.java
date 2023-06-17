package com.quateam.game.faith.model.item.armor;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;

/**
 * Принцип работы брони:
 * Броня защищает героя, принимая на себя определенный процент от полученного урона (остальное дамажит героя).
 */

public abstract class Armor extends Item {


    private float damageReduction;

    /**
     * Броня имеет свою шкалу "здоровья" {@code  armorHealPoints} , которая изнашивается, принимая на себя определенный
     * процент урона. Если по количеству он больше, чем оставшийся уровень здоровья брони, то броня разрушается,
     * поглащая только урон соответствующий остатку.
     */
    private float armorHealPoints;

    private boolean isTemporary;

    /**
     * акже броня может быть временной (время устанавливается в reductionTimeSeconds. Если
     * * переменная reductionTimeSeconds больше нуля, то значением temporary является true. Чтобы сделать
     * * броню временной, следует вызвать метод setReductionTimeSeconds()).
     */
    private float reductionTimeSeconds = 0.0f;

    /**
     * Абсолютно любая броня также может иметь определенную особенность (armorFeatureType), которую можно добыть по мере прохождения
     * игры. Обычно, по умолчанию в броне не заложено никакой особенности. К особенностям брони можно отнести
     * ночное зрение, устойчивость к замедлению, устойчивость к отбрасыванию. Чтобы наделить броню особенностью,
     * требуется вызвать метод setArmorFeatureType().
     */
    private ArmorFeatureTypes armorFeatureType;
    private final ArmorTypes armorType;

    /**
     * За работоспособность брони отвечает поле isArmorBrake. Все методы связанные с броней всегда проверяют значение
     * этой переменной (оно должно быть false у "живой" брони). Когда броня разрушена, лучше всего вызвать метод
     * armorIsBroken(), чтобы безопасно перевести броню в "сломанное состояние".
     */
    private boolean armorBroken = false;

    public Armor(String itemName,
                 String description,
                 ArmorTypes armorType,
                 ArmorFeatureTypes armorFeatureType,
                 ItemRarity itemRarity,
                 float price,
                 float reductionTimeSeconds,
                 float armorHealPoints,
                 float damageReduction) {

        super(itemName, description, itemRarity, price);

        assert armorHealPoints > 0;
        this.armorHealPoints = armorHealPoints;
        assert armorType != ArmorTypes.UNKNOWN_ARMOR_TYPE;
        this.armorType = armorType;
        this.armorFeatureType = armorFeatureType;

        assert damageReduction > 0;
        this.damageReduction = damageReduction;

        if (reductionTimeSeconds <= 0) {
            this.isTemporary = false;
        } else {
            this.isTemporary = true;
            this.reductionTimeSeconds = reductionTimeSeconds;
        }
    }

    public static float syncArmorDamageReduction(ItemRarity itemRarity, ArmorTypes armorType){
        if (armorType == ArmorTypes.CLOAK || armorType == ArmorTypes.SHIELD){
            return 100.0f;
        }
        float damageReduction = 0;
        switch (itemRarity){
            case ELEMENTARY: damageReduction = 10.0f;
            case RELICT: damageReduction = 20.0f;
            case HRENASITOVIY: damageReduction = 40.0f;
            case MYSTICAL: damageReduction = 80.0f;
            case STORY: damageReduction = 100.0f;
        }
        return damageReduction;
    }

    public static float syncArmorHealPoints(ItemRarity itemRarity, ArmorTypes armorType){
        float healPoints = 0;
        if (armorType == ArmorTypes.CLOAK || armorType == ArmorTypes.SHIELD){
            switch (itemRarity){
                case ELEMENTARY: healPoints = 25.0f;
                case RELICT: healPoints = 50.0f;
                case HRENASITOVIY: healPoints = 100.0f;
                case MYSTICAL: healPoints = 200.0f;
                case STORY: healPoints = 400.0f;
            }
            return healPoints;
        }
        switch (itemRarity){
            case ELEMENTARY: healPoints = 50.0f;
            case RELICT: healPoints = 100.0f;
            case HRENASITOVIY: healPoints = 200.0f;
            case MYSTICAL: healPoints = 400.0f;
            case STORY: healPoints = 800.0f;
        }
        return healPoints;
    }

    public static String syncArmorName(ItemRarity itemRarity, ArmorTypes armorType){
        String name = "---";
        switch (armorType){
            case BOOTS -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарные бутcы";
                    case RELICT: name = "Реликтовые бутсы";
                    case HRENASITOVIY: name = "Хренаситовые бутсы";
                    case MYSTICAL: name = "Мистические бутсы";
                    case STORY: name = "Исторические бутсы";
                }
            }
            case BRACES -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарные наручи";
                    case RELICT: name = "Реликтовые наручи";
                    case HRENASITOVIY: name = "Хренаситовые наручи";
                    case MYSTICAL: name = "Мистические наручи";
                    case STORY: name = "Исторические наручи";
                }
            }
            case CLOAK -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарный плащ";
                    case RELICT: name = "Реликтовый плащ";
                    case HRENASITOVIY: name = "Хренаситовый плащ";
                    case MYSTICAL: name = "Мистический плащ";
                    case STORY: name = "Исторический плащ";
                }
            }
            case GREAVES -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарные поножи";
                    case RELICT: name = "Реликтовые поножи";
                    case HRENASITOVIY: name = "Хренаситовые поножи";
                    case MYSTICAL: name = "Мистические поножи";
                    case STORY: name = "Исторические поножи";
                }
            }
            case HELMET -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарный шлем";
                    case RELICT: name = "Реликтовый шлем";
                    case HRENASITOVIY: name = "Хренаситовый шлем";
                    case MYSTICAL: name = "Мистический шлем";
                    case STORY: name = "Исторический шлем";
                }
            }
            case SHIELD -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарный щит";
                    case RELICT: name = "Реликтовый щит";
                    case HRENASITOVIY: name = "Хренаситовый щит";
                    case MYSTICAL: name = "Мистический щит";
                    case STORY: name = "Исторический щит";
                }
            }
            case VEST -> {
                switch (itemRarity){
                    case ELEMENTARY: name = "Элементарный жилет";
                    case RELICT: name = "Реликтовый жилет";
                    case HRENASITOVIY: name = "Хренаситовый жилет";
                    case MYSTICAL: name = "Мистический жилет";
                    case STORY: name = "Исторический жилет";
                }
            }


        }
        return name;

    }

    public static String syncArmorDescription(ItemRarity itemRarity, ArmorTypes armorType){
        String desc = "---";
        String name = syncArmorName(itemRarity, armorType);
        float damageReduction = syncArmorDamageReduction(itemRarity, armorType);
        switch (armorType){
            case BOOTS -> desc = name + " снижают урон в ступни на " + damageReduction + "%";
            case BRACES -> desc = name + " снижают урон в руки на " + damageReduction + "%";
            case GREAVES -> desc = name + " снижают урон в ноги на " + damageReduction + "%";
            case HELMET -> desc = name + " снижает урон в голову на " + damageReduction + "%";
            case VEST -> desc = name + " снижает урон в туловище на " + damageReduction + "%";
            case SHIELD -> desc = name + " снижает урон в живот и грудь на " + damageReduction + "%. Щит может работать поверх жилета.";
            case CLOAK -> desc = name + " снижает урон в спину на " + damageReduction + "%. Плащ может работать поверх жилета";
        }
        return desc;
    }


    public void armorIsBroken() {
        if (this.armorHealPoints <= 0) {
            this.armorBroken = true;
            this.armorHealPoints = 0;
            return;
        }
    }

    /**
     * Если требуется принудительно вывести броню из строя, то нужно вызвать метод breakArmorForcedly().
     * Сломанную броню починить уже нельзя - по логике она пропадает сразу после разрушения. Кстати говоря,
     * такая броня, как щит и плащ могут работать поверх жилета и снижают они урон на 100% (но имеют при этом сравнительно меньше HP, чем любой другой вид брони).
     */
    public void breakArmorForcedly() {
        this.armorBroken = true;
        this.armorHealPoints = 0;
    }

    public void restoreArmor() {
        if (this.armorBroken) {
            this.armorBroken = false;
            this.armorHealPoints = 1;
        }
    }

    /**
     * Броню можно полностью восстановить, вызвав метод fix(), но только если она
     * не разрушена полностью.
     **/
    public void fix() {
        assert this.armorBroken == false;
        assert this.armorHealPoints > 0;
    }

    /**
     * Если значение reductionTimeSeconds станет равным нулю, то это значит, что время действия брони закончено и следует вызвать
     * метод armorTimeIsUp(), чтобы синхронизировать все значения, связанные с временем действия и состоянием брони.
     */
    public void armorTimeIsUp() {
        assert this.armorBroken == false;
        assert this.armorHealPoints > 0;
        if (isTemporary) {
            isTemporary = false;
            reductionTimeSeconds = (float) 0;
            armorBroken = true;
            armorHealPoints = 0;
            return;
        }

    }

    public void setArmorHealPoints(float armorHealPoints) {
        assert this.armorBroken == false;
        assert armorHealPoints > 0;
        this.armorHealPoints = armorHealPoints;
    }

    public void setDamageReduction(float damageReduction) {
        assert this.armorBroken == false;
        assert this.armorHealPoints > 0;
        assert damageReduction > 0;
        this.damageReduction = damageReduction;
    }

    public void setReductionTimeSeconds(float reductionTimeSeconds) {
        assert this.armorBroken == false;
        assert this.armorHealPoints > 0;
        if (reductionTimeSeconds <= 0) {
            this.isTemporary = false;
            return;
        }
        this.isTemporary = true;
        this.reductionTimeSeconds = reductionTimeSeconds;
    }

    public void setArmorFeatureType(ArmorFeatureTypes armorFeatureType) {
        assert this.armorBroken == false;
        assert this.armorHealPoints > 0;
        this.armorFeatureType = armorFeatureType;
    }

    public float getDamageReduction() {
        return damageReduction;
    }

    public float getReductionTimeSeconds() {
        return reductionTimeSeconds;
    }

    public ArmorFeatureTypes getArmorFeatureType() {
        return armorFeatureType;
    }

    public ArmorTypes getArmorType() {
        return armorType;
    }

    public float getArmorHealPoints() {
        return armorHealPoints;
    }

    public boolean isArmorBroken() {
        return armorBroken;
    }

    public boolean isTemporary() {
        return isTemporary;
    }

    public abstract boolean isArmorFixed();

}