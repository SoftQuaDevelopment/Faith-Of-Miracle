package com.quateam.game.faith.model.item.armor;

import com.quateam.game.faith.model.item.Item;
import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.armor.types.ArmorFeatureTypes;
import com.quateam.game.faith.model.item.armor.types.ArmorTypes;
import com.quateam.game.faith.model.item.armor.types.DamageReductionTypes;

public abstract class Armor extends Item {

    /**
     * Принцип работы брони:
     * Броня защищает героя, принимая на себя определенный процент от полученного урона (остальное дамажит героя).
     * Броня имеет свою шкалу "здоровья" (armorHealPoints), которая изнашивается, принимая на себя определенный
     * процент урона. Если по количеству он больше, чем оставшийся уровень здоровья брони, то броня разрушается, поглащая только урон
     * соответствующий остатку. Броню можно полностью восстановить, вызвав метод fix(), но только если она
     * не разрушена полностью. Также броня может быть временной (время устанавливается в reductionTimeSeconds. Если
     * переменная reductionTimeSeconds больше нуля, то значением temporary является true. Чтобы сделать
     * броню временной, следует вызвать метод setReductionTimeSeconds()). Если значение
     * reductionTimeSeconds станет равным нулю, то это значит, что время действия брони закончено и следует вызвать
     * метод armorTimeIsUp(), чтобы синхронизировать все значения, связанные с временем действия и состоянием брони.
     *
     * За работоспособность брони отвечает поле armorBroken. Все методы связанные с броней всегда проверяют значение
     * этой переменной (оно должно быть false у "живой" брони). Когда броня разрушена, лучше всего вызвать метод
     * armorIsBroken(), чтобы безопасно перевести броню в "сломанное состояние". Если требуется принудительно вывести
     * броню из строя, то нужно вызвать метод breakArmorForcedly(). Сломанную броню починить уже нельзя - по логике
     * она пропадает сразу после разрушения. Кстати говоря, такая броня, как щит и плащ могут работать поверх жилета
     * и снижают они урон на 100% (но имеют при этом сравнительно меньше HP, чем любой другой вид брони).
     *
     * Абсолютно любая броня также может иметь определенную особенность (armorFeatureType), которую можно добыть по мере прохождения
     * игры. Обычно, по умолчанию в броне не заложено никакой особенности. К особенностям брони можно отнести
     * ночное зрение, устойчивость к замедлению, устойчивость к отбрасыванию. Чтобы наделить броню особенностью,
     * требуется вызвать метод setArmorFeatureType().
     *
     */

    private float damageReduction;
    private boolean temporary;
    private float reductionTimeSeconds = (float) 0;
    private ArmorFeatureTypes armorFeatureType;
    private final ArmorTypes armorType;
    private float armorHealPoints;
    private boolean armorBroken = false;

    public Armor(
            String itemName,
            String description,
            ArmorTypes armorType,
            ArmorFeatureTypes armorFeatureType,
            ItemRarity itemRarity,
            float price,
            float reductionTimeSeconds,
            float armorHealPoints,
            float damageReduction
    ) {
        super(itemName, description, itemRarity, price);
        assert armorHealPoints > 0;
        this.armorHealPoints = armorHealPoints;
        this.armorType = armorType;
        this.armorFeatureType = armorFeatureType;
        assert damageReduction > 0;
        this.damageReduction = damageReduction;
        if (reductionTimeSeconds <= 0){
            this.temporary = false;
        } else {
            this.temporary = true;
            this.reductionTimeSeconds = reductionTimeSeconds;
        }
    }

    public void setArmorFeatureType(ArmorFeatureTypes armorFeatureType) {
        assert this.armorBroken = false;
        assert this.armorHealPoints > 0;
        this.armorFeatureType = armorFeatureType;
    }

    public void setDamageReduction(float damageReduction) {
        assert this.armorBroken = false;
        assert this.armorHealPoints > 0;
        assert damageReduction > 0;
        this.damageReduction = damageReduction;
    }

    public void setArmorHealPoints(float armorHealPoints){
        assert this.armorBroken = false;
        assert armorHealPoints > 0;
        this.armorHealPoints = armorHealPoints;
    }

    public boolean isTemporary() {
        return temporary;
    }

    public void armorIsBroken(){
        if (this.armorHealPoints <= 0) {
            this.armorBroken = true;
            this.armorHealPoints = 0;
            return;
        }
    }

    public void breakArmorForcedly(){
        this.armorBroken = true;
        this.armorHealPoints = 0;
    }

    public void armorTimeIsUp(){
        assert this.armorBroken = false;
        assert this.armorHealPoints > 0;
        if (temporary){
            temporary = false;
            reductionTimeSeconds = (float) 0;
            armorBroken = true;
            armorHealPoints = 0;
            return;
        }

    }

    public void setReductionTimeSeconds(float reductionTimeSeconds){
        assert this.armorBroken = false;
        assert this.armorHealPoints > 0;
        if (reductionTimeSeconds <= 0){
            this.temporary = false;
            return;
        }
            this.temporary = true;
            this.reductionTimeSeconds = reductionTimeSeconds;
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

    public void restoreArmor(){
        if (this.armorBroken){
            this.armorBroken = false;
            this.armorHealPoints = 1;
        }
    }

    public void fix(){
        assert this.armorBroken = false;
        assert this.armorHealPoints > 0;
    }

}