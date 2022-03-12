package com.company.scene;

import com.company.Global;
import com.company.controllers.SceneController;
import com.company.gametest9th.utils.CommandSolver;

import java.awt.*;

public class SelectScene extends Scene implements CommandSolver.KeyListener{

    @Override
    public void sceneBegin() {

    }

    @Override
    public void sceneEnd() {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("按下a開啟飛機遊戲，按下b開啟蝙蝠俠遊戲", Global.SCREEN_X/2-100, Global.SCREEN_Y/2);
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
        return this;
    }

    @Override
    public void keyPressed(int commandCode, long trigTime) {

    }

    @Override
    public void keyReleased(int commandCode, long trigTime) {

    }

    @Override
    public void keyTyped(char c, long trigTime) {
        if(Global.IS_DEBUG){
            System.out.println(c);
        }
        if(c == 'a' || c == 'A'){
            SceneController.getInstance().change(new MainScene());
        }
        else if (c == 'b' || c == 'B'){
            SceneController.getInstance().change(new BatmanScene());
        }
    }
}
