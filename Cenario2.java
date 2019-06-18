package jogo;


import java.awt.Color;
import java.awt.Font;

import jplay.Keyboard;
import jplay.Scene;
import jplay.Window;


public class Cenario2 {

    public static Window janela;
    private Scene cenario;
    public static Keyboard teclado;

    public static boolean colidiu1 = false;
    public static boolean colidiu2 = false;
    public static boolean colidiu3 = false;
    public static boolean colidiu4 = false;
    public static boolean colidiu5 = false;
    public static boolean colidiu6 = false;
    public static boolean colidiu7 = false;
    public static boolean colidiu8 = false;
    public static boolean colidiu9 = false;
    public static boolean colidiu10 = false;
    public static boolean colidiu11 = false;
    
    public static Obstaculo obstaculo;
    public static Obstaculo obstaculo2;
    public static Obstaculo obstaculo3;
    public static Obstaculo obstaculo4;
    public static Obstaculo obstaculo5;
    public static Obstaculo obstaculo6;
    public static Obstaculo obstaculo7;
    public static Obstaculo obstaculo8;
    public static Obstaculo obstaculo9;
    public static Obstaculo obstaculo10;
    public static Obstaculo obstaculo11;
    private StrTempo strTempo;

    public static PersonagemPrincipal personagem;

    ThreadCronometro2 timer = new ThreadCronometro2(20, 0);
    Thread timerTest = new Thread(timer);

    public static ThreadMusicaLooping tm1 = new ThreadMusicaLooping("src/Recursos/Musica/fase1.wav", true);
    Thread backGround = new Thread(tm1);

    ThreadColisao2 tColisao = new ThreadColisao2(janela);
    Thread tColidiu = new Thread(tColisao);

    public Cenario2(Window window) {

        backGround.start();

        janela = window;
        cenario = new Scene();

        teclado = janela.getKeyboard();

        cenario.loadFromFile("src/Recursos/Cenario/Cenario1.scn");

        obstaculo = new Obstaculo(900, 508, "src/Recursos/Imagem/obstaculoBaixo2.png");
        obstaculo2 = new Obstaculo(1800, 508, "src/Recursos/Imagem/obstaculoBaixo.png");
        obstaculo3 = new Obstaculo(2700, 508, "src/Recursos/Imagem/obstaculoBaixo2.png");
        obstaculo4 = new Obstaculo(3600, 508, "src/Recursos/Imagem/obstaculoBaixo2.png");
        obstaculo5 = new Obstaculo(4500, 508, "src/Recursos/Imagem/obstaculoBaixo.png");
        obstaculo6 = new Obstaculo(5400, 508, "src/Recursos/Imagem/obstaculoBaixo.png");
        obstaculo7 = new Obstaculo(6300, 508, "src/Recursos/Imagem/obstaculoBaixo.png");
        obstaculo8 = new Obstaculo(7200, 508, "src/Recursos/Imagem/obstaculoBaixo2.png");
        obstaculo9 = new Obstaculo(8100, 508, "src/Recursos/Imagem/obstaculoBaixo.png");
        obstaculo10 = new Obstaculo(9000, 508, "src/Recursos/Imagem/obstaculoBaixo2.png");
        obstaculo11 = new Obstaculo(9900, 508, "src/Recursos/Imagem/obstaculoBaixo.png");
        strTempo = new StrTempo(25, 25, "src/Recursos/Imagem/tempo.png");
        personagem = new PersonagemPrincipal(200, 490);

        run();

        timerTest.start();
        tColidiu.start();

    }
    

    private void run() {
        while (true) {
            cenario.draw();

            desenhaObstaculo();
            personagem.draw();
            personagem.movimentar(janela);
            strTempo.draw();
            escreveTexto();
            testeContador();
            obstaculoMovimento();

            timerTest.run();
            tColidiu.run();

            janela.update();

        }

    }

    private void desenhaObstaculo() {
        obstaculo.draw();
        obstaculo2.draw();
        obstaculo3.draw();
        obstaculo4.draw();
        obstaculo5.draw();
        obstaculo6.draw();
        obstaculo7.draw();
        obstaculo8.draw();
        obstaculo9.draw();
        obstaculo10.draw();
        obstaculo11.draw();

    }

    private void obstaculoMovimento() {
        if (obstaculo.x > 0) {
            obstaculo.moveTo(0, 508, 0.9);
            if (obstaculo.x < 1) {
                obstaculo.stop();
                obstaculo.hide();

            }

        }
        if (obstaculo2.x > 0) {
            obstaculo2.moveTo(0, 508, 0.9);
            if (obstaculo2.x < 1) {
                obstaculo2.stop();
                obstaculo2.hide();

            }

        }
        if (obstaculo3.x > 0) {
            obstaculo3.moveTo(0, 508, 0.9);
            if (obstaculo3.x < 1) {
                obstaculo3.stop();
                obstaculo3.hide();

            }

        }
        if (obstaculo4.x > 0) {
            obstaculo4.moveTo(0, 508, 0.9);
            if (obstaculo4.x < 1) {
                obstaculo4.stop();
                obstaculo4.hide();

            }

        }
        if (obstaculo5.x > 0) {
            obstaculo5.moveTo(0, 508, 0.9);
            if (obstaculo5.x < 1) {
                obstaculo5.stop();
                obstaculo5.hide();

            }

        }
        if (obstaculo6.x > 0) {
            obstaculo6.moveTo(0, 508, 0.9);
            if (obstaculo6.x < 1) {
                obstaculo6.stop();
                obstaculo6.hide();

            }

        }
        if (obstaculo7.x > 0) {
            obstaculo7.moveTo(0, 508, 0.9);
            if (obstaculo7.x < 1) {
                obstaculo7.stop();
                obstaculo7.hide();

            }

        }

        if (obstaculo8.x > 0) {
            obstaculo8.moveTo(0, 508, 0.9);
            if (obstaculo8.x < 1) {
                obstaculo8.stop();
                obstaculo8.hide();

            }
        }
        if (obstaculo9.x > 0){
            obstaculo9.moveTo(0, 508, 0.9);
            if (obstaculo9.x < 1){
                obstaculo9.stop();
                obstaculo9.hide();
            }
        }
        
        if (obstaculo10.x > 0){
            obstaculo10.moveTo(0, 508, 0.9);
            if (obstaculo10.x < 1){
                obstaculo10.stop();
                obstaculo10.hide();
            }
            
        }
           if (obstaculo11.x > 0){
            obstaculo11.moveTo(0, 508, 0.9);
            if (obstaculo11.x < 1){
                obstaculo11.stop();
                obstaculo11.hide();
            }
            
        }

    }

    private void escreveTexto() {
        Color cor = new Color(255, 215, 0);
        Font fonte = new Font("Jokerman", Font.PLAIN, 60);
        String texto = "Nivel 2 ";

        janela.drawText(texto, 300, 200, cor, fonte);
    }

    private void testeContador() {

        Color cor = new Color(255, 215, 0);

        Font fonte = new Font("Jokerman", Font.PLAIN, 25);

        if (personagem.collided(obstaculo)) {
            janela.drawText(" BOM = )", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo2)) {
            janela.drawText(" BOM = )", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo3)) {
            janela.drawText(" Mal =(", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo4)) {
            janela.drawText(" BOM =)", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo5)) {
            janela.drawText(" BOM = )", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo6)) {
            janela.drawText(" Mal =(", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo7)) {
            janela.drawText(" Mal =(", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo8)) {
            janela.drawText(" BOM = )", 325, 325, cor, fonte);

        }
        if (personagem.collided(obstaculo9)){
            janela.drawText("Mal =( ", 325,325, cor, fonte);
        }
        if (personagem.collided(obstaculo10)){
            janela.drawText("Bom = )", 325, 325, cor , fonte);
        }
        
        if (personagem.collided(obstaculo11)){
            janela.drawText("Otimo =D", 325, 325, cor, fonte);
        }

    }

  

}
