package jogo;

import jplay.Keyboard;
import jplay.Window;

public class ThreadColisao2 implements Runnable {

    Window janela;

    public ThreadColisao2(Window window) {
        this.janela = window;

    }

    @Override
    public void run() {

        if (Cenario2.colidiu1 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo)) {

                Cenario2.colidiu1 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu1 = true;

            }
        }
        Cenario2.colidiu1 = false;

        if (Cenario2.colidiu2 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo2)) {

                Cenario2.colidiu2 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu2 = true;
            }
        }
        Cenario2.colidiu2 = false;

        if (Cenario2.colidiu3 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo3)) {

                Cenario2.colidiu3 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu3 = true;

            }
        }
        Cenario2.colidiu4 = false;

        if (Cenario2.colidiu4 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo4)) {

                Cenario2.colidiu4 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu4 = true;
            }
        }
        Cenario2.colidiu4 = false;

        if (Cenario2.colidiu5 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo5)) {

                Cenario2.colidiu5 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu5 = true;

            }
        }
        Cenario2.colidiu6 = false;

        if (Cenario2.colidiu6 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo6)) {

                Cenario2.colidiu6 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu6 = true;
            }
        }
        Cenario2.colidiu7 = false;

        if (Cenario2.colidiu7 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo7)) {

                Cenario2.colidiu7 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);

            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu7 = true;

            }
        }
        Cenario2.colidiu8 = false;

        if (Cenario2.colidiu8 == false) {
            if (Cenario2.personagem.collided(Cenario2.obstaculo8)) {

                Cenario2.colidiu8 = false;
                Cenario2.personagem.moveTo(10, 490, 0.6);
            }

            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)) {
                Cenario2.colidiu8 = true;
            }
        }
        Cenario2.colidiu8 = false;
        
        if (Cenario2.colidiu9 == false){
            if(Cenario2.personagem.collided(Cenario2.obstaculo9)){
                Cenario2.colidiu9 = false;
                Cenario2.personagem.moveTo(10,490, 0.6);
                
            }
            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)){
                Cenario2.colidiu9 = true;
            }
        }
        Cenario2.colidiu10 = false;
                if (Cenario2.colidiu10 == false){
            if(Cenario2.personagem.collided(Cenario2.obstaculo10)){
                Cenario2.colidiu10 = false;
                Cenario2.personagem.moveTo(10,490, 0.6);
                
            }
            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)){
                Cenario2.colidiu10 = true;
            }
        }
        Cenario2.colidiu11 = false;
                Cenario2.colidiu11 = false;
                if (Cenario2.colidiu11 == false){
            if(Cenario2.personagem.collided(Cenario2.obstaculo11)){
                Cenario2.colidiu11 = false;
                Cenario2.personagem.moveTo(10,490, 0.6);
                
            }
            if (Cenario2.teclado.keyDown(Keyboard.SPACE_KEY)){
                Cenario2.colidiu11 = true;
            }
        }
        Cenario2.colidiu11 = false;

    }

}
