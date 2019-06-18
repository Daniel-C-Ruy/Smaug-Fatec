package jogo;

import jplay.Sprite;

public class Obstaculo extends Sprite {

    String endereco;

    public Obstaculo(int x, int y, String caminho) {

        //super("src/Recursos/Imagem/obstaculoBaixo.png", 1);
        super(caminho, 1);
        this.x = x;
        this.y = y;
        this.endereco = caminho;

    }

}
