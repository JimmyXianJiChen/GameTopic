package com.company.scene;

import com.company.Global;
import com.company.gameObj.Batman;
import com.company.gameObj.CEnemy;
import com.company.gameObj.Joker;
import com.company.gametest9th.utils.CommandSolver;

import java.awt.*;

public class BatmanScene extends Scene{

    private Joker joker;
    private Batman batman;
    @Override
    public void sceneBegin() {
        joker = new Joker(Global.SCREEN_X/2, 200);
        batman = new Batman(Global.SCREEN_X/2, Global.SCREEN_Y-200);
    }

    @Override
    public void sceneEnd() {
        joker = null;
        batman = null;
    }

    @Override
    public void paint(Graphics g) {
        batman.paint(g);
        joker.paint(g);
    }

    @Override
    public void update() {
        batman.update();
        joker.update();
    }

    @Override
    public CommandSolver.MouseCommandListener mouseListener() {
        return null;
    }

    @Override
    public CommandSolver.KeyListener keyListener() {
        return new CommandSolver.KeyListener() {
            @Override
            public void keyPressed(int commandCode, long trigTime) {
                batman.keyPressed(commandCode, trigTime);
            }

            @Override
            public void keyReleased(int commandCode, long trigTime) {

            }

            @Override
            public void keyTyped(char c, long trigTime) {

            }
        };
    }
}
