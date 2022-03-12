package com.company.scene;

import com.company.Global;
import com.company.gametest9th.utils.CommandSolver;

import java.awt.*;

public class GameOverScene extends Scene {
    @Override
    public void sceneBegin() {

    }

    @Override
    public void sceneEnd() {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("Game Over", Global.SCREEN_X / 2, Global.SCREEN_Y / 2);
    }

    @Override
    public void update() {

    }

    @Override
    public CommandSolver.MouseCommandListener mouseListener() {
        return null;
    }

    @Override
    public CommandSolver.KeyListener keyListener() {
        return null;
    }
}
