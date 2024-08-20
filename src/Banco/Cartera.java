/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author DZ
 */
public class Cartera implements PatronCartera {
    public String anho;

    public Cartera(String anho) {
        this.anho = anho;
    }
    
    
    
    @Override
    public void imprimirListaDeTarjetas() {
        System.out.println();
    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
    }
    
}
