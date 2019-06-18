package jogo;

import java.awt.Color;
import java.awt.Font;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class MenuTutorial {

    private Window janela;
    private GameImage credito;
    private Keyboard teclado;

    public MenuTutorial(Window window) {
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

                new Cenario1(janela);
            }
        }
    }

    private void escreveTexto() {

        Color cor = new Color(255, 215, 0);

        Font fonte = new Font("Jokerman", Font.PLAIN, 40);
        Font fonteTexto = new Font("Jokerman", Font.PLAIN, 25);

        String frase1 = "Acerte o tempo e pratique o primeiro passo de parkour.";
        String frase2 = "Pressione ESPAÇO  no momento certo para realizar o salto.";
        String frase3 = "Ao final do nível, você poderá ver seus resultados.";
        String frase4 = "São eles : Ruim, Mal, Bom e Ótimo.";
        String frase5 = "Cada nível tem uma contagem regressiva, em quanto o  ";
        String frase6 = "tempo nao acabar, Parkour nele.";
        String frase7 = " A cada nível, a velocidade dos obstaculos aumenta!";
        String frase8 = "Boa sorte...";

        janela.drawText(frase1, 40, 150, cor, fonteTexto);
        janela.drawText(frase2, 40, 190, cor, fonteTexto);
        janela.drawText(frase3, 40, 230, cor, fonteTexto);
        janela.drawText(frase4, 40, 270, cor, fonteTexto);
        janela.drawText(frase5, 40, 310, cor, fonteTexto);
        janela.drawText(frase6, 40, 350, cor, fonteTexto);
        janela.drawText(frase7, 40, 390, cor, fonteTexto);
        janela.drawText(frase8, 300, 480, cor, fonteTexto);
        janela.drawText("Enter para iniciar o nivel 1", 280, 550, cor, fonte);

    }

}
