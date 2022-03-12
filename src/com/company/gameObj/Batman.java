package com.company.gameObj;

import com.company.Global;
import com.company.controllers.ImageResourceController;
import com.company.controllers.SceneController;
import com.company.gametest9th.utils.CommandSolver;
import com.company.gametest9th.utils.GameKernel;
import com.company.gametest9th.utils.Path;

import java.awt.*;

public class Batman extends GameObject implements GameKernel.GameInterface, CommandSolver.KeyListener {
    private Image img;
    private Global.Direction dir;

    public Batman(int x, int y){
        super(x,y, 55, 55, x, y, 50, 50);
        dir = Global.Direction.RIGHT;
        img = SceneController.getInstance().imageController().tryGetImage(new Path().img().actors().batman());
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, painter().left(), painter().top(), painter().width(), painter().height(), null);
    }

    @Override
    public void keyPressed(int commandCode, long trigTime) {

    }

    @Override
    public void keyReleased(int commandCode, long trigTime) {

    }

    @Override
    public void keyTyped(char c, long trigTime) {

    }

    @Override
    public void update() {

    }
}
