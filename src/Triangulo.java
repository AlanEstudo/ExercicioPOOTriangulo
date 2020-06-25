
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
public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public float calculeArea(){
        return base*altura/2;
    }
    
    public float calculaPerimetro(){
        return base*3;
    }

}
