package jogo;

import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class Fim {

    private Window janela;
    private GameImage credito;
    private Keyboard teclado;

    public Fim(Window window) {
        janela = window;
        credito = new GameImage("src/Recursos/Imagem/Tutorial.png");
        teclado = janela.getKeyboard();
        Keyboard teclado = janela.getKeyboard();

        run();

    }

    private void run() {
        while (true) {
            credito.draw();
            escreveTexto();
            janela.update();

            if (teclado.keyDown(Keyboard.ENTER_KEY)) {

                try {
                    new Menu(janela);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fim.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void escreveTexto() {

        Color cor = new Color(255, 215, 0);

        Font fonte = new Font("Jokerman", Font.PLAIN, 60);
        Font fonteTexto = new Font("Jokerman", Font.PLAIN, 25);

        String frase1 = "Isso é tudo Pessoal.";

        janela.drawText(frase1, 150, 150, cor, fonte);

        janela.drawText("Fim do beta ParkourRun", 280, 550, cor, fonteTexto);

    }

}
