package jogo;

import jplay.Keyboard;

import jplay.Sprite;

import jplay.Window;

public class PersonagemPrincipal extends Sprite {

    double velocidade = 0.5;
    protected int direcao = 3;
    private Keyboard teclado;
    boolean movimentando = false;

    public PersonagemPrincipal(int x, int y) {
        super("src/Recursos/Sprite/personagem2.png", 16);
        this.x = x;
        this.y = y;
        this.setTotalDuration(1000);

    }

    public void movimentar(Window janela) {
        if (teclado == null) {
            teclado = janela.getKeyboard();

        }
        
        if (teclado.keyDown(Keyboard.LEFT_KEY)) {
       if (this.x < janela.getWidth() - 30) {
               this.x += velocidade;
            }
            
            if (direcao != 1) {
                setSequence(13,15);
                direcao = 1;
            }
            movimentando = true;

        } else if (teclado.keyDown(Keyboard.RIGHT_KEY)) {
          // if (this.x < janela.getWidth() - 30) {
            //    this.x += velocidade;
            //}
            if (direcao != 2) {
                //setSequence(0, 12);
                setSequence(0, 12, true);
                direcao = 2;
            }
            movimentando = false;

        }

         //if (movimentando) {             
            update();
           //  movimentando = false;
  //}
         
}

}
