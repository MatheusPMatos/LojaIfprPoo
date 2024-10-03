package com.lojaifpr;

import javax.swing.JFrame;

import com.lojaifpr.view.TelaPrincipal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TelaPrincipal tela = new TelaPrincipal();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(500,300);
        tela.setVisible(true);
    
    }
}