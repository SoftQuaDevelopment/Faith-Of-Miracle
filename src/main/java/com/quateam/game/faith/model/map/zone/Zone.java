package com.quateam.game.faith.model.map.zone;

import com.quateam.game.faith.gameplay.battle.Battle;
import com.quateam.game.faith.gameplay.boss_fight.BossFight;
import com.quateam.game.faith.gameplay.quest.Quest;
import com.quateam.game.faith.gameplay.story.Story;
import com.quateam.game.faith.model.map.city.City;
import com.quateam.game.faith.model.shop.Shop;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

    List<City> cityList = new ArrayList<>();
    List<Shop> shopList = new ArrayList<>();

    List<Battle> battleList = new ArrayList<>();
    List<Story> storyList = new ArrayList<>();
    List<Quest> questList = new ArrayList<>();
    List<BossFight> bossFightList = new ArrayList<>();

    public void addCity(City city) {
        cityList.add(city);
    }

    public void addShop(Shop shop) {
        shopList.add(shop);
    }

    public void addBattle(Battle battle) {
        battleList.add(battle);
    }

    public void addStory(Story story) {
        storyList.add(story);
    }

}
