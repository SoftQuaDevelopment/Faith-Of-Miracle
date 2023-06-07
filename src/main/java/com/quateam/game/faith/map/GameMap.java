package com.quateam.game.faith.map;

import com.quateam.game.faith.model.map.region.Region;

import java.util.ArrayList;
import java.util.List;

public class GameMap {

    public List<Region> regions = new ArrayList<>();

    public void addRegion(Region region) {
        regions.add(region);
    }

}
