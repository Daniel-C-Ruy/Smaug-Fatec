package jogo;

import java.awt.Color;
import java.awt.Font;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class FinalFase2 {

    private Window janela;
    private GameImage credito;
    private Keyboard teclado;

    public FinalFase2(Window window) {
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

                new Fim(janela);
            }
        }
    }

    private void escreveTexto() {

        Color cor = new Color(255, 215, 0);

        Font fonte = new Font("Jokerman", Font.PLAIN, 40);
        Font fonteTexto = new Font("Jokerman", Font.PLAIN, 25);

        String frase1 = "Ruim :0";
        String frase2 = "Mal :4";
        String frase3 = "Bom :6";
        String frase4 = "Otimo :1";
        String frase5 = "Nível de Parkour : Bom ;(";
        String frase6 = "Você está ficando bom nisso, continue!!";
        String frase7 = "";
        String frase8 = "";

        janela.drawText(frase1, 40, 150, cor, fonteTexto);
        janela.drawText(frase2, 40, 190, cor, fonteTexto);
        janela.drawText(frase3, 40, 230, cor, fonteTexto);
        janela.drawText(frase4, 40, 270, cor, fonteTexto);
        janela.drawText(frase5, 40, 310, cor, fonteTexto);
        janela.drawText(frase6, 40, 350, cor, fonteTexto);
        janela.drawText(frase7, 40, 390, cor, fonteTexto);
        janela.drawText(frase8, 300, 480, cor, fonteTexto);
        janela.drawText("Enter para prosseguir.", 280, 550, cor, fonte);

    }

}
