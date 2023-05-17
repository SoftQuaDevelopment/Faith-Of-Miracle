package com.quateam.game.faith.story.battle.tutorial;

import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.enemy.Lupizdrik;
import com.quateam.game.faith.model.player.Player;
import com.quateam.game.faith.model.player.Warrior;
import com.quateam.game.faith.story.battle.BattleMove;
import com.quateam.game.faith.story.battle.BattleType;
import com.quateam.game.faith.story.battle.Playground;

public class TutorialLauncher {

    public static void main(String[] args) {

        Playground playground = new TutorialBattle();
        playground.setStatus(BattleType.STORY);

        Player player = new Warrior(1,1,1);
        playground.setPlayer(player);

        Enemy enemyLupizdrik = new Lupizdrik(1, 1,1);
        playground.addEnemy(enemyLupizdrik);

        playground.startBattle();
    }

}
