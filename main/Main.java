package main;  // Archivo Main.java

import analizador.Analizador;
import analizadorLexico.AnalizadorLexico;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        AnalizadorLexico lex = new AnalizadorLexico();
        Analizador analizar = new Analizador(lex);
        analizar.programa();
    }
}
