
package jogo;

import java.awt.Color;
import java.awt.Font;

import jplay.Time;
import jplay.Window;

/**
 *
 * @author dan
 */
public class ThreadCronometro2 implements Runnable {

    Time tempo;
    Font fonte = new Font("Jokerman", Font.PLAIN, 25);
    Color cor = new Color(255, 215, 0);
    int hora = 0;
    int minuto;
    int segundo;
    int x = 200;
    int y = 75;
    Window janela;

    public ThreadCronometro2(int segundo, int minuto) {
        this.segundo = segundo;
        this.minuto = minuto;
        tempo = new Time(hora, minuto, segundo, x, y, fonte, cor, false);

    }

    @Override
    public void run() {
        janela = Window.instance;

        tempo.draw();

        if (tempo.timeEnded()) {     
            Cenario2.tm1.stop();
            new FinalFase2(janela);

        }

    }

}
