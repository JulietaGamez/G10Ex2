/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Edificio;
import Entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author julietagamez
 */
public class PolideportivoService extends EdificioService{
    Scanner leer= new Scanner(System.in);
    public Polideportivo crearPolideportivo(Edificio e){
        System.out.println("---POLIDEPORTIVO---");
        Polideportivo pD= new Polideportivo();
        super.crearEdificio(pD);
        System.out.println("Ingrese el nombre del Polideportivo");
        pD.setNombrePoli(leer.next());
        System.out.println("El polideportivo es techado? SI/NO");
            String rta= leer.next();
        do {
            
            if (rta.equalsIgnoreCase("SI")) {
                pD.setTechadoOabierto("abierto");
                break;
            }else if (rta.equalsIgnoreCase("NO")) {
                pD.setTechadoOabierto("techado");
                break;
            }else{
                System.out.println("Respuesta incorrecta");
            }
        } while (!rta.equalsIgnoreCase("si")||(!rta.equalsIgnoreCase("no")));
//        calcularSuperficie(pD);
//        calcularVolumen(pD);
        return pD;
    }

     @Override
    public Double calcularSuperficie(Edificio e) {
        Double superficie= e.getLargo()*e.getAncho();
        System.out.println("La superficie es: "+superficie);
        return superficie;
                
    }

    @Override
    public Double calcularVolumen(Edificio e) {
       Double volumen= e.getLargo()*e.getAncho()* e.getAlto();
       System.out.println("El volumen es: "+volumen);
        return volumen;
    }
    
}
