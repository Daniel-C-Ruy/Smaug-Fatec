package jogo;
//#1128 linhas de codigo feitos até o momento  ultima coisa realizada, escrita na tela do score
// e a pontuação ao personagem colidir com o obstaculo;

import jplay.GameImage;
import jplay.Keyboard;

import jplay.Window;

public class ExecutaJogo {

    public static void main(String[] args) {

        Window janela = new Window(800, 600);
        GameImage logo = new GameImage("src/Recursos/Imagem/fatec.png");
        boolean executando = true;
        Keyboard teclado = janela.getKeyboard();
        ThreadMusicaLooping tm1 = new ThreadMusicaLooping("src/Recursos/Musica/Intro Fatec.wav", false);
        Thread backGround = new Thread(tm1);
        backGround.start();

        while (executando) {

            logo.draw();
            janela.update();

            if (teclado.keyDown(Keyboard.ENTER_KEY)) {
                //JOptionPane.showMessageDialog(janela, "funcionando");
                tm1.stop();
                new IntroMenu(janela);

            }
        }
    }
}
