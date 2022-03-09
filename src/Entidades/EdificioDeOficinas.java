/*
Clase EdificioDeOficinas con sus atributos número de oficinas, 
cantidad de personas por oficina y numero de pisos. Esta clase implementará 
los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el edificio,
el usuario dirá cuantas personas entran en cada oficina, cuantas oficinas y
el numero de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso y 
cuantas en todo el edificio.
 */
package Entidades;

public class EdificioDeOficinas extends Edificio {
    private Integer numOficinas;
    private Integer numPisos;
    private Integer numPersonasXpiso;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer numPisos, Integer numPersonasXpiso, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.numPisos = numPisos;
        this.numPersonasXpiso = numPersonasXpiso;
    }

    public EdificioDeOficinas(Integer numOficinas, Integer numPisos, Integer numPersonasXpiso) {
        this.numOficinas = numOficinas;
        this.numPisos = numPisos;
        this.numPersonasXpiso = numPersonasXpiso;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    public Integer getNumPersonasXpiso() {
        return numPersonasXpiso;
    }

    public void setNumPersonasXpiso(Integer numPersonasXpiso) {
        this.numPersonasXpiso = numPersonasXpiso;
    }

    
    

    public EdificioDeOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "---EdificioDeOficinas--- " + "\nNumero de Oficinas: " + numOficinas+
                "\nAlto: "+ super.getAlto()+ "\nLargo: "+ super.getLargo()+
                "\nAncho: "+ super.getAncho()+
                "\nNumero de personas por piso: "+ this.getNumPersonasXpiso()+
                "\nNumero de pisos: "+ this.getNumPisos();
    }
   
    
}
