package com.company.gameObj;

import com.company.Global;
import com.company.controllers.SceneController;
import com.company.gametest9th.utils.Delay;
import com.company.gametest9th.utils.GameKernel;
import com.company.gametest9th.utils.Path;

import java.awt.*;

public class Joker extends GameObject implements GameKernel.GameInterface {
    private Image img;
    private Global.Direction dir;
    private Delay delay;
    private final int SPEED = 4;

    public Joker(int x, int y){
        super(x, y, 55, 55, x, y, 50, 50);
        dir = Global.Direction.RIGHT;
        img = SceneController.getInstance().imageController().tryGetImage(new Path().img().actors().joker());
        delay = new Delay(30);
        delay.loop();
    }

    public void move(){
        if(dir == Global.Direction.RIGHT && !touchRight()){
            translateX(SPEED);
        }
        else if(dir == Global.Direction.LEFT && !touchLeft()){
            translateX(-1*SPEED);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, painter().left(), painter().top(), painter().width(), painter().height(), null);
    }

    @Override
    public void update() {
        move();
        if(delay.count()){
            this.dir = Global.Direction.getRandomLeftRight();
        }
        if(dir == Global.Direction.LEFT && touchLeft()){
            this.dir =Global.Direction.RIGHT;
        }
        if(dir == Global.Direction.RIGHT && touchRight()){
            this.dir =Global.Direction.LEFT;
        }
    }
}
