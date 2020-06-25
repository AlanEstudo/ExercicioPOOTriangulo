
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class appTriangulo {

    public static void main(String[] args) {

        Triangulo trianguloEquilatero = new Triangulo(20,50);
        trianguloEquilatero.setAltura(30);

        float area = trianguloEquilatero.calculeArea();
        float perimetro = trianguloEquilatero.calculaPerimetro();

        System.out.println("Area :" + area);
        System.out.println("Perimetro :" + perimetro);
    }

}
