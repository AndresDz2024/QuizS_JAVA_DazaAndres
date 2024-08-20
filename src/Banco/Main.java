/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;
import java.util.Scanner;

/**
 *
 * @author DZ
 */
public class Main {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qhubo Usuario, que quiere hacer?");
        System.out.println("1. ver el valor final del descuento básico para las tarjetas de Joven (valor inicial 50.000, descuento 11%)");
        System.out.println("2. ver el valor final del descuento Platino para las tarjetas de Nomina (valor inicial 50.000, descuento 15%)");
        System.out.println("3. ver el valor final del descuento Diamante para las tarjetas de Visa (valor inicial 50.000, descuento 18%)");
        option = sc.nextInt();
        switch(option){
            case 1: 
                Tarjeta joven = new Joven("1234321", 15000.00, "Enero");
                System.out.println("Numero de cuenta: " + joven.getNumeroDeCuenta());
                System.out.println("Valor de apertura: " + joven.getValorApertura());
                System.out.println("Mes: " + joven.getMes());                
                System.out.println("Cuota(Ya está aplicado el descuento Basico ): " + joven.cuotaDeManejo());
                break;
            case 2:
                Tarjeta nomina = new Nomina("123321", 12300.00, "Febrero");
                System.out.println("Numero de cuenta: " + nomina.getNumeroDeCuenta());
                System.out.println("Valor de apertura: " + nomina.getValorApertura());
                System.out.println("Mes: " + nomina.getMes());                
                System.out.println("Cuota(Ya está aplicado el descuento Platino ): " + nomina.cuotaDeManejo());
                break;
            case 3:
                Tarjeta visa = new Visa("123321", 12000.00, "Marzo");
                System.out.println("Numero de cuenta: " + visa.getNumeroDeCuenta());
                System.out.println("Valor de apertura: " + visa.getValorApertura());
                System.out.println("Mes: " + visa.getMes());  
                System.out.println("Cuota(Ya está aplicado el descuento Diamante ): " + visa.cuotaDeManejo());
                break;
        }
    }
    
}
