//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseWheelEvent;
//import java.io.IOException;
//
//public class GameJPanel extends javax.swing.JPanel{
//
//    private Image img;
//    private int x;
//    private int y;
//    private int dir;
//
//    //call back function//實現的人犯觸發的人分開 解耦合
//    public class MyListener extends MouseAdapter{
//        @Override
//        public void mouseMoved(MouseEvent e){
//            //System.out.println(e.getX()+ " " + e.getY());
//            GameJPanel.this.x = e.getX();
//            GameJPanel.this.y = e.getY();
//        }
//
//    }
//
//    public GameJPanel(){
//        x = 30;
//        y = 250;
//        dir = 0;
//        try {
//            img = ImageIO.read(getClass().getResource("/resources/plane1.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        this.addMouseListener(new MyListener());
//        this.addMouseMotionListener(new MyListener());
//
//    }
//    public void move(){
//        if(dir ==0){
//            x += 16;
//        }
//        else{
//            x -= 16;
//        }
//    }
//
//    public void changeDir(int x){
//        if(this.x > x){
//            dir = 1;
//        }
//        else{
//            dir = 0;
//        }
//    }
//
//    @Override
//    public void paintComponent(Graphics g){
//        g.drawImage(img, x, y, this);
//    }
//}
