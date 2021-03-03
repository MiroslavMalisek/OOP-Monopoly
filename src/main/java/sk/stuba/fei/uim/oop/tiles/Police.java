package sk.stuba.fei.uim.oop.tiles;

import sk.stuba.fei.uim.oop.player.Player;

public class Police extends Tile {

    @Override
    public void activate(Player player) {
        System.out.println("You are arrested and you going to PRISON for 3 rounds!");
        player.setTurnsInPrison(3);
    }
}
