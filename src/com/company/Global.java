package com.company;

import java.util.List;

public class Global {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
        private static  List<Direction> DIRECTIONS = List.of(values());
        private static Direction getDirectionByIndex(int idx){
            return DIRECTIONS.get(idx);
        }
        public static Direction getRandomLeftRight(){
            int dir = Global.random(2,3);
            return getDirectionByIndex(dir);
        }
    }

    public static final boolean IS_DEBUG = true;

    public static final int UPDATE_TIMES_PER_SEC = 60;
    public static final int NANOSECOUND_PER_UPDATE = 1000000000 / UPDATE_TIMES_PER_SEC;

    public static final int FRAME_LIMIT = 60;
    public static final int LIMIT_DELTA_TIME = 1000000000 / FRAME_LIMIT;

    //視窗大小
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int SCREEN_X = WINDOW_WIDTH - 8 - 8;
    public static final int SCREEN_Y = WINDOW_HEIGHT - 31 - 8;

    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    public static final int SPACE = 3;

    /**
     * 輸出範圍內的隨機數字
     *
     * @param min
     * @param max
     * @return
     */
    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
