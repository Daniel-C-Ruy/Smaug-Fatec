package jogo;

import java.util.logging.Level;
import java.util.logging.Logger;
import jplay.Sound;

public class ThreadEfeito implements Runnable {

    private String caminho;
    private Sound musicaLoop;
    private boolean estaSuspensa;
    private boolean estaTerminada;
    private boolean looping;

    // passado como parametro o caminho do arquivo e se o looping é verdadeiro ou falso;
    public ThreadEfeito(String caminho, boolean looping) {
        this.caminho = caminho;

        this.looping = looping;
        musicaLoop = new Sound(caminho);
        this.estaSuspensa = false;
        this.estaTerminada = true;
        //inicia a thread no proprio construtor;
        new Thread(this, caminho).start();

    }

    @Override
    public void run() {

        //incia musica Jplay e verifica se é infinito ou não;
        musicaLoop.play();
        musicaLoop.setRepeat(looping);

        synchronized (this) {
            while (estaSuspensa) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadEfeito.class.getName()).log(Level.SEVERE, null, ex);
                }
                //para a musica;
                if (this.estaTerminada) {
                    stop();
                }
            }

        }

    }

    //incia musica Jplay e verifica se é infinito ou não;
    // para suspender uma thread por tempo; voltado para a musica;
    void suspend() {
        this.estaSuspensa = true;

    }

    // para voltar uma thread após ser parada; voltado para a musica;
    synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }
    // libera a função thread.stop e a execução é de parada da Jplay musica

    synchronized void stop() {
        if (musicaLoop != null) {
            musicaLoop.stop();
        }
    }

}
