package com.quateam.game.faith.model.map.region;

import com.quateam.game.faith.model.map.zone.Zone;

import java.util.ArrayList;
import java.util.List;

public abstract class Region {
    List<Zone> zoneList = new ArrayList<>();

    public void addZone(Zone zone) {
        zoneList.add(zone);
    }

}
