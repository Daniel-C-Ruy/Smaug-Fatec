package jogo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jplay.Animation;
import jplay.Keyboard;
import jplay.Window;

public class IntroMenu {

    private Window janela;
    private Animation introMenu;
    private Keyboard teclado;
    ThreadMusicaLooping tm1 = new ThreadMusicaLooping("src/Recursos/Musica/musicaMenu.wav", true);
    Thread backGround = new Thread(tm1);

    public IntroMenu(Window window) {
        janela = window;
        introMenu = new Animation("src/Recursos/Imagem/IntroMenu.png", 2);
        introMenu.setDuration(0, 500);
        introMenu.setDuration(1, 500);
        introMenu.setLoop(true);
        teclado = janela.getKeyboard();
        backGround.start();

        run();

    }

    private void run() {
        while (true) {
            introMenu.draw();
            janela.update();
            introMenu.update();

            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                try {
                    tm1.stop();
                    new Menu(janela);
                } catch (InterruptedException ex) {
                    Logger.getLogger(IntroMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
