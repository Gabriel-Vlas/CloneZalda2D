package game;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;

public class Game extends Canvas implements Runnable {
    public static int WIDTH = 480;
    public static int HEIGHT = 480;

    public Game() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setTitle("Zelda Clone");
        frame.pack();

        frame.setLocationRelativeTo((Component)null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

        new Thread(game).start();
    }

    @Override
    public void run() {

        while(true) {
            System.out.println("Chamando game looping");
        }

    }
}
