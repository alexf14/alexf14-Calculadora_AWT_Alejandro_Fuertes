package com.mycompany.calculadora_awt;

import java.awt.*;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;

public class Calculadora extends Frame {

    String s = "";
    String c = "";
    int n1 = 0;
    int n2 = 0;
    String simbolo = "";

    public Calculadora() {

        Panel pnl = new Panel();
        setSize(400, 500);
        setLayout(new BorderLayout());
        this.add(pnl);
        setLocationRelativeTo(null);

        Panel numeros = new Panel(new GridLayout(4, 3));
        add("Center", numeros);

        var operadores = new Panel(new GridLayout(4, 1));
        add("East", operadores);

        var txt = new TextField();
        txt.setFont(new Font("Script fonts", Font.BOLD, 50));     
        txt.setEnabled(false);
        add(txt, "North");

        var nueve = new Button("9");
        numeros.add(nueve);

        var ocho = new Button("8");
        numeros.add(ocho);

        var siete = new Button("7");
        numeros.add(siete);

        var seis = new Button("6");
        numeros.add(seis);

        var cinco = new Button("5");
        numeros.add(cinco);

        var cuatro = new Button("4");
        numeros.add(cuatro);

        var tres = new Button("3");
        numeros.add(tres);

        var dos = new Button("2");
        numeros.add(dos);

        var uno = new Button("1");
        numeros.add(uno);

        var ac = new Button("AC");
        numeros.add(ac);

        var cero = new Button("0");
        numeros.add(cero);

        var igual = new Button("=");
        numeros.add(igual);

        var div = new Button("/");
        operadores.add("East", div);
        
        var mult = new Button("X");
        operadores.add(mult);
        
        var resta = new Button("-");
        operadores.add(resta);
        
        var suma = new Button("            +            ");
        operadores.add(suma);

        setVisible(true);

        nueve.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "9";
            txt.setText(c + s);
        });

        ocho.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "8";
            txt.setText(c + s);
        });

        siete.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "7";
            txt.setText(c + s);
        });

        seis.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "6";
            txt.setText(c + s);
        });

        cinco.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "5";
            txt.setText(c + s);
        });

        cuatro.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "4";
            txt.setText(c + s);
        });

        tres.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "3";
            txt.setText(c + s);
        });

        dos.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "2";
            txt.setText(c + s);
        });

        uno.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "1";
            txt.setText(c + s);
        });

        cero.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "0";
            txt.setText(c + s);
        });

        igual.addActionListener((ActionEvent e) -> {
            int a = calcular(txt.getText());
            txt.setText(String.valueOf(a));
        });

        ac.addActionListener((ActionEvent e) -> {
            txt.setText("");
        });

        suma.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "+";
            txt.setText(c + s);

        });

        resta.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "-";
            txt.setText(c + s);
        });

        mult.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "*";
            txt.setText(c + s);
        });

        div.addActionListener((ActionEvent e) -> {
            c = txt.getText();
            s = "/";
            txt.setText(c + s);
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    ;
    
    public static int calcular(String operacion) {
        int rest = 0;
        String simb = "";
        String n1 = "";
        int num1 = 0;

        for (int k = 0; k < operacion.length(); k++) {
            if (operacion.charAt(k) > 41 && operacion.charAt(k) < 48) {
                simb = operacion.charAt(k) + "";
                n1 = "";
            } else {
                n1 = n1 + operacion.charAt(k);
            }

            if (k + 1 == operacion.length() || operacion.charAt(k + 1) < 48) {
                num1 = Integer.parseInt(n1);
                rest = switch (simb) {
                    case "*" ->
                        rest * num1;
                    case "-" ->
                        rest - num1;
                    case "/" ->
                        rest / num1;
                    default ->
                        rest + num1;
                };
            }
        }
        return rest;
    }

    
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setVisible(true);
    }
}
