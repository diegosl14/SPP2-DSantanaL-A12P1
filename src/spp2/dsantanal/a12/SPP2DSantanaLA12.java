/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.dsantanal.a12;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class SPP2DSantanaLA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double est, peso, imc;
        est=pedirDato("Introduce Estatura");
        peso=pedirDato("Introduce Peso");
        imc=peso/Math.pow(est,2);
        System.out.println("El IMC es:" +imc);
    }
    public static double pedirDato(String mensaje){
        Scanner sc=new Scanner (System.in);
        String dato;
        double num=0;
        boolean flag;
        do{
            try{
                dato=JOptionPane.showInputDialog (null, mensaje);
                flag=false;
            }catch (Exception ex){
                JOptionPane.showInputDialog (null, "Error");
                flag=true;
            }
        }while(flag);
        return num;
    }
}
