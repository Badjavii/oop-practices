package com.github.badjavii.vm02_KataTennis.p02_TypesGames;

public class PingPongGame extends AbstractGame {

    public PingPongGame(Player player1, Player player2, ScoreBoard scoreBoard) {
        super(player1, player2, scoreBoard);
    }

    @Override
    public void play() {

    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}