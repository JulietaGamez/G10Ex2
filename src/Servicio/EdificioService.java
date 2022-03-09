/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Edificio;
import java.util.Scanner;

public abstract class EdificioService {
    Scanner leer= new Scanner(System.in);
    
    public Edificio crearEdificio(Edificio e){
        
        System.out.println("Ingrese el alto");
        e.setAlto(leer.nextDouble());
        System.out.println("Ingrese el ancho");
        e.setAncho(leer.nextDouble());
        System.out.println("Ingrese el largo");
        e.setLargo(leer.nextDouble());
        return e;
    }
    public abstract Double calcularSuperficie(Edificio e);
    public abstract Double calcularVolumen(Edificio e);
    
}
