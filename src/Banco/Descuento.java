/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author DZ
 */
public class Descuento {
    
    public double valorDescontar;
    public int valorInicial;
    public double valorFinal;
    public Descuento(){
        
    }
    public Descuento(double valorDescontar, int valorInicial) {
        this.valorDescontar = valorDescontar;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }
    
    public double getValorDescontado(double valorDescontar, int valorInicial){
        valorFinal = valorInicial - valorInicial * valorDescontar;
        return valorFinal;
        
    };
    
}
