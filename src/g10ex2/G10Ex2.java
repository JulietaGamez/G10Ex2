/*
 Crear una superclase llamada Edificio con los siguientes atributos: 
ancho, alto y largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser 
Techado o Abierto, esta clase implementará los dos métodos abstractos 
y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, 
cantidad de personas por oficina y numero de pisos. Esta clase implementará 
los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el edificio,
el usuario dirá cuantas personas entran en cada oficina, cuantas oficinas y
el numero de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso y 
cuantas en todo el edificio.
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe 
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y 
ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá 
mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos polideportivos 
son techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar 
al método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package g10ex2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicio.EdificioDeOficinasService;
import Servicio.PolideportivoService;
import java.util.ArrayList;
import java.util.Scanner;

public class G10Ex2 {

    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios = new ArrayList();
        Scanner leer = new Scanner(System.in);
        Edificio e = new Edificio();
        EdificioDeOficinasService eS = new EdificioDeOficinasService();
        PolideportivoService pS = new PolideportivoService();

        System.out.println("---EDIFICIOS---");
        for (int i = 0; i < 4; i++) {

            if ((i == 0) || (i == 1)) {
                Polideportivo pD = pS.crearPolideportivo(e);
                listaEdificios.add(pD);
            } else {
                EdificioDeOficinas edOf = eS.crearEdificioDeOficinas(e);
                listaEdificios.add(edOf);
            }
        }
        
//        for (Edificio listaEdificio : listaEdificios) {
//            System.out.println("");
//            System.out.println(listaEdificio);
//        }
        
         System.out.println("---LISTA DE EDIFICIOS---");
        int abierto = 0;
        int cerrado = 0;
        for (Edificio edif : listaEdificios) {
            System.out.println("");

            if (edif instanceof Polideportivo) {

                Polideportivo poli = (Polideportivo) ((Polideportivo) edif);
                if (poli.getTechadoOabierto().equalsIgnoreCase("abierto")) {
                    abierto++;
                    System.out.println(poli);
                    pS.calcularSuperficie(poli);
                    pS.calcularVolumen(poli);
                    
                } else if (poli.getTechadoOabierto().equalsIgnoreCase("techado")) {
                    cerrado++;
                    System.out.println(poli);
                }

            }else if (edif instanceof EdificioDeOficinas) {
                EdificioDeOficinas eOfi= (EdificioDeOficinas)((EdificioDeOficinas)edif);
                System.out.println(eOfi);
                eS.calcularSuperficie(eOfi);
                eS.calcularVolumen(eOfi);
                
            }

        }
        System.out.println("");
        System.out.println("---Polideportivos cerrados o abiertos---");
        System.out.println("Los polideportivos abiertos son " + abierto);
        System.out.println("Los polideportivos cerrados son " + cerrado);
    }
}
