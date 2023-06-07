package com.quateam.game.faith.gameplay.battle;

import com.quateam.game.faith.game_system.battle.Cell;
import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.player.Player;

import java.util.Random;

public abstract class Battle {

    abstract public void addEnemy(Enemy enemy);

    abstract public void setPlayer(Player player);

    abstract public void startBattle(Cell[][] gameBoard);

    abstract public void stopBattle();

    public boolean booleanRand() {
        return new Random().nextBoolean();
    }

}
