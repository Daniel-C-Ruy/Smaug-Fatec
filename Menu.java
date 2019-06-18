package jogo;

import javax.swing.JOptionPane;
import jplay.Keyboard;
import jplay.Sound;
import jplay.Sprite;
import jplay.Window;

public class Menu {

    private Window janela;
    private Sprite menu;
    private Keyboard teclado;
    private int opcaoEscolhida = 0;

    //private Sound musicaMenu;
    ThreadMusicaLooping tm1 = new ThreadMusicaLooping("src/Recursos/Musica/musicaMenu.wav", true);
    Thread backGround = new Thread(tm1);

    public Menu(Window window) throws InterruptedException {

        backGround.start();

        janela = window;
        menu = new Sprite("src/Recursos/Imagem/menu.png", 3);
        teclado = janela.getKeyboard();
        teclado.setBehavior(Keyboard.UP_KEY, Keyboard.DETECT_INITIAL_PRESS_ONLY);
        teclado.setBehavior(Keyboard.DOWN_KEY, Keyboard.DETECT_INITIAL_PRESS_ONLY);
        teclado.setBehavior(Keyboard.ENTER_KEY, Keyboard.DETECT_INITIAL_PRESS_ONLY);
        run();
    }

    private void desenhar() {
        //Desenha a imagem usada como fundo da tela.
        menu.draw();

        //Mostra as atualizações - esse método não pode faltar e tem 
        //que ser o último a ser chamado.
        janela.update();
    }

    //Escolha de opções do menu...
    private void verificarOpcaoEscolhida() {

        boolean escolheuUmaOpcao = true;

        //Se a tecla foi pressionada...
        if (teclado.keyDown(Keyboard.UP_KEY)) {

            ThreadEfeito tm2 = new ThreadEfeito("src/Recursos/Musica/som.wav", false);

            //O if serve para não deixar que a opção seja menor que zero.
            if (opcaoEscolhida > 0) {
                opcaoEscolhida--;
            }

        }

        //Se a tecla para baixo foi pressionada...
        if (teclado.keyDown(Keyboard.DOWN_KEY)) { //ThreadMusicaEfeito t1 = new ThreadMusicaEfeito();

            ThreadEfeito tm3 = new ThreadEfeito("src/Recursos/Musica/som.wav", false);

            if (opcaoEscolhida < 2) {
                opcaoEscolhida++;
            }

        }
        if (teclado.keyDown(Keyboard.ENTER_KEY)) {

            ThreadEfeito tm4 = new ThreadEfeito("src/Recursos/Musica/som.wav", false);
            select();

        } else {
            escolheuUmaOpcao = false;

        }
        //}

        //Seta a opção do menu escolhida pelo usuário.
        menu.setCurrFrame(opcaoEscolhida);

    }

    private void run() {

        boolean sair = false;
        do {
            desenhar();
            verificarOpcaoEscolhida();

            //Se apertar a tecla ESC, sai da tela inicial.
            if (teclado.keyDown(Keyboard.ESCAPE_KEY)) {
                sair = true;
            }

        } while (sair == false);
    }

    private void select() {
        switch (opcaoEscolhida) {
            case 0:
                if (menu.getCurrFrame() == 0) {
                    tm1.stop();
                }
                new MenuTutorial(janela);

                break;
            case 1:
                if (menu.getCurrFrame() == 1) {
                    tm1.stop();
                }
                new Credito(janela);
                break;
            case 2:
                if (menu.getCurrFrame() == 2) {
                    tm1.stop();
                }
                janela.exit();

                break;
            default:

                break;
        }

    }
}
