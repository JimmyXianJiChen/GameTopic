package com.company.gameObj;

import com.company.Global;
import com.company.controllers.SceneController;
import com.company.gametest9th.utils.GameKernel;
import com.company.gametest9th.utils.Path;

import java.awt.*;

public class Joker extends GameObject implements GameKernel.GameInterface {
    private Image img;
    private Global.Direction dir;

    public Joker(int x, int y){
        super(x, y, 55, 55, x, y, 50, 50);
        dir = Global.Direction.RIGHT;
        img = SceneController.getInstance().imageController().tryGetImage(new Path().img().actors().joker());
    }

    @Override
    public void paintComponent(Graphics g) {

    }

    @Override
    public void update() {

    }
}
