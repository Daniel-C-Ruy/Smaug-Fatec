package jogo;

import jplay.Keyboard;
import jplay.Window;

public class ThreadColisao implements Runnable {

    Window janela;

    public ThreadColisao(Window window) {
        this.janela = window;

    }

    @Override
    public void run() {

        if (Cenario1.colidiu1 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo)) {

                Cenario1.colidiu1 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu1 = true;

            }
        }
        Cenario1.colidiu1 = false;

        if (Cenario1.colidiu2 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo2)) {

                Cenario1.colidiu2 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu2 = true;
            }
        }
        Cenario1.colidiu2 = false;

        if (Cenario1.colidiu3 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo3)) {

                Cenario1.colidiu3 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu3 = true;

            }
        }
        Cenario1.colidiu4 = false;

        if (Cenario1.colidiu4 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo4)) {

                Cenario1.colidiu4 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu4 = true;
            }
        }
        Cenario1.colidiu4 = false;

        if (Cenario1.colidiu5 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo5)) {

                Cenario1.colidiu5 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu5 = true;

            }
        }
        Cenario1.colidiu6 = false;

        if (Cenario1.colidiu6 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo6)) {

                Cenario1.colidiu6 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu6 = true;
            }
        }
        Cenario1.colidiu7 = false;

        if (Cenario1.colidiu7 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo7)) {

                Cenario1.colidiu7 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu7 = true;

            }
        }
        Cenario1.colidiu8 = false;

        if (Cenario1.colidiu8 == false) {
            if (Cenario1.personagem.collided(Cenario1.obstaculo8)) {

                Cenario1.colidiu8 = false;
                Cenario1.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario1.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario1.colidiu8 = true;
            }
        }
        Cenario1.colidiu8 = false;

    }

}
