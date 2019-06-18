package jogo;

import java.awt.Color;
import java.awt.Font;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class IntroPFase2 {

    private Window janela;
    private GameImage credito;
    private Keyboard teclado;

    public IntroPFase2(Window window) {
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

                new Cenario2(janela);
            }
        }
    }

    private void escreveTexto() {

        Color cor = new Color(255, 215, 0);

        Font fonte = new Font("Jokerman", Font.PLAIN, 40);
        Font fonteTexto = new Font("Jokerman", Font.PLAIN, 25);

        String frase1 = "Bora aumentar um pouco a velocidade?";

        janela.drawText(frase1, 40, 150, cor, fonteTexto);

        janela.drawText("Enter para iniciar o nivel 2", 280, 550, cor, fonte);

    }

}
