package org.example;

import org.example.herenciamultiple.AlumnoDeportistArtista;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado ();
        cuadrado.setLado(5);
        System.out.println("Area del cuadrado= " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo= " + circulo.calcularArea());
        AlumnoDeportistArtista ada = new AlumnoDeportistArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Futbol");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");

    }
}