package com.company.gameObj;

import com.company.controllers.SceneController;
import com.company.gametest9th.utils.Path;

import java.awt.*;

public class BatmanDart extends GameObject{

    private Image dart;

    public BatmanDart(int x, int y){
        super(x, y, 50, 50);
        dart = SceneController.getInstance().imageController().tryGetImage(new Path().img().objs().batmanDart());
    }

    @Override
    public void paintComponent(Graphics g) {

    }

    @Override
    public void update() {

    }
}
