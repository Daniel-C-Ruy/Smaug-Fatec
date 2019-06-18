package jogo;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class Credito {

    public static Window janela;
    private GameImage credito;
    private Keyboard teclado;
    private int opcaoEscolhida = 0;
    ThreadMusicaLooping tm1 = new ThreadMusicaLooping("src/Recursos/Musica/musicaMenu.wav", true);
    Thread backGround = new Thread(tm1);
    static ResultSet res;

    public Credito(Window window) {

        backGround.start();
        janela = window;
        credito = new GameImage("src/Recursos/Imagem/Creditos.png");
        teclado = janela.getKeyboard();
        Keyboard teclado = janela.getKeyboard();

        run();

    }

    private void run() {
        while (true) {
            credito.draw();

            janela.update();

            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                try {
                    ThreadEfeito tm2 = new ThreadEfeito("src/Recursos/Musica/som.wav", false);
                    //JOptionPane.showMessageDialog(janela, "funcionando");
                    //ThreadMusicaEfeito t5 = new ThreadMusicaEfeito();

                    tm1.stop();
                    new Menu(janela);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Credito.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
