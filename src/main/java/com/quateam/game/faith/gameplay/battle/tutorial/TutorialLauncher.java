package com.quateam.game.faith.gameplay.battle.tutorial;

import com.quateam.game.faith.game_system.battle.Cell;
import com.quateam.game.faith.game_system.battle.CellType;
import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.enemy.Lupizdrik;
import com.quateam.game.faith.model.player.Player;
import com.quateam.game.faith.gameplay.battle.Battle;

public class TutorialLauncher {

    public static void main(String[] args) {
        Cell[][] gameBoard = {
                {new Cell(1,1, CellType.NONE), new Cell(1,1, CellType.HEAL)}, {new Cell(1,2, CellType.NONE)}, {new Cell(1,3, CellType.NONE)},
                {new Cell(2,1, CellType.NONE)}, {new Cell(2,2, CellType.NONE)}, {new Cell(2,3, CellType.NONE)},
                {new Cell(3,1, CellType.NONE)}, {new Cell(3,2, CellType.NONE)}, {new Cell(3,3, CellType.NONE)}
        };

        Player player = new Player(1,1,1);
        player.setX(1);
        player.setY(1);

        Enemy enemy1 = new Lupizdrik(1,1,1);
        enemy1.setX(2);
        enemy1.setY(1);

        Enemy enemy2 = new Lupizdrik(1,1,1);
        enemy2.setX(2);
        enemy2.setY(2);

        Battle battle = new TutorialBattle();
        battle.setPlayer(player);
        battle.addEnemy(enemy1);
        battle.addEnemy(enemy2);
        battle.startBattle(gameBoard);
    }

}
