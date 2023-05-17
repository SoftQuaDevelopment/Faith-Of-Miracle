package com.quateam.game.faith.story.battle.tutorial;

import com.quateam.game.faith.game_system.damage.Damage;
import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.player.Player;
import com.quateam.game.faith.story.battle.BattleType;
import com.quateam.game.faith.story.battle.Playground;

import java.util.ArrayList;
import java.util.List;

public class TutorialBattle extends Playground {

    private List<Enemy> enemyList = new ArrayList<>();
    private BattleType battleType;

    private Player player = null;
    public boolean isBattle;

    @Override
    public void startBattle() {

        if(player == null) {
            System.out.println("Player can't be null");
            return;
        }

        if(enemyList.isEmpty()) {
            System.out.println("There must be at least one enemy on the playground");
            return;
        }

        isBattle = true;

        int enemyCount = enemyList.size();
        System.out.println("Перед тобой появилось " + enemyCount + " врагов");

        int index = 0;
        for(Enemy enemy : enemyList) {
            System.out.println(index + " " + enemy.getName());
            index++;
        }

        System.out.print("Первый ход за ");
        //true = player;  false = enemy;
        if(booleanRand()) {
            System.out.println("игрока");
            playerMove();
        } else {
            System.out.println("врага");
            enemyMove();
        }
    }

    @Override
    public void addEnemy(Enemy enemy) {
        enemyList.add(enemy);
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void setStatus(BattleType battleType) {
        this.battleType = battleType;
    }

    @Override
    public void stopBattle() { isBattle = false; }


    public void enemyMove() {
        for(Enemy currentEnemy : enemyList) {
            currentEnemy.attackOnPlayer(player, new Damage(1));
        }
    }

    public void playerMove() {
       Enemy enemy = enemyList.get(0);
       player.attackOnEnemy(enemy, new Damage(1));
    }


}
