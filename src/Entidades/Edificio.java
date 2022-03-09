/*
Crear una superclase llamada Edificio con los siguientes atributos: 
ancho, alto y largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
 */
package Entidades;

public  class Edificio {
    protected Double ancho;
    protected Double alto;
    protected Double largo;

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {
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
        return "---Edificio--- " + "\nancho= " + ancho + ", \nalto= " + alto + ", \nlargo= " + largo ;
    }
   
}
