/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import java.util.Scanner;

public class EdificioDeOficinasService extends EdificioService{
     Scanner leer= new Scanner(System.in);
     public EdificioDeOficinas crearEdificioDeOficinas(Edificio e){
         System.out.println("---EDIFICIO DE OFICINAS---");
        EdificioDeOficinas eDo= new EdificioDeOficinas();
        super.crearEdificio(eDo);
        System.out.println("Ingrese la cantidad de pesonas por oficina");
        eDo.setNumPersonasXpiso(leer.nextInt());
        Integer cantPers= eDo.getNumPersonasXpiso();
        System.out.println("Ingrese el numero de pisos");
        eDo.setNumPisos(leer.nextInt());
        cantidadPersonas(eDo.getNumPisos(),eDo.getNumPersonasXpiso());
        eDo.setNumOficinas(eDo.getNumPisos());
//        calcularSuperficie(eDo);
//        calcularVolumen(eDo);
        return eDo;
     }
     public Integer cantidadPersonas(Integer pisos, Integer personas){
         Integer cantPers=0;
         cantPers=(pisos*personas);
         System.out.println("La cantidad total de personas en el edificio es: "+ cantPers);
         return cantPers;
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
