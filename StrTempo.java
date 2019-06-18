package jogo;

import jplay.Sprite;

public class StrTempo extends Sprite {

    String endereco;

    public StrTempo(int x, int y, String caminho) {
        super(caminho, 1);
        this.x = x;
        this.y = y;
        this.endereco = caminho;

    }

}
