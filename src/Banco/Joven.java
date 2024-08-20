/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author DZ
 */
public class Joven extends Tarjeta {    
    
    Descuento discount = new Descuento(0.11, 50000);
        
    public Joven(String numeroDeCuenta, double valorApertura, String mes) {
        super(numeroDeCuenta, valorApertura, mes);
    }
        
    @Override
    public double cuotaDeManejo() {
        return discount.getValorDescontado(discount.valorDescontar, discount.valorInicial);
    }
    
    
}
