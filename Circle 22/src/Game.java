import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {
    private static Circles myCircle;
    private static int numberOfCircle;
    private Random ran;
    private static ArrayList<Circles> circleList = new ArrayList<>();

    public Game() {
        // TODO Auto-generated constructor stub

        setLayout(new BorderLayout());
        setVisible(true);
        setSize(700,700);
        setTitle("Game");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Thread t = new Thread(this);
        t.start();
        System.out.println(t.getName());
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        for(int i=0; i<numberOfCircle; i++) {
            myCircle = new Circles();
            g.setColor(myCircle.getC());
            g.fillOval(myCircle.getX(), myCircle.getY(), myCircle.getR(), myCircle.getR());
            circleList.add(myCircle);
        }

    }

    public static void main(String[] args) {
        Game game = new Game(); 
        numberOfCircle = Integer.parseInt(args[0]);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            try {
                Thread.currentThread().sleep(100);
                for(int i=0; i<numberOfCircle; i++) {
                    myCircle.move(circleList.get(i).getS());
                }
                repaint();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }

    }

}
