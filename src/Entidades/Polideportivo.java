/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser 
Techado o Abierto, esta clase implementará los dos métodos abstractos 
y los atributos del padre.
 */
package Entidades;

public class Polideportivo extends Edificio{
private String nombrePoli;
private String techadoOabierto;

    public Polideportivo() {
    }

    public Polideportivo(String nombrePoli, String techadoOabierto, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombrePoli = nombrePoli;
        this.techadoOabierto = techadoOabierto;
    }

    public Polideportivo(String nombrePoli, String techadoOabierto) {
        this.nombrePoli = nombrePoli;
        this.techadoOabierto = techadoOabierto;
    }

    public String getNombrePoli() {
        return nombrePoli;
    }

    public void setNombrePoli(String nombrePoli) {
        this.nombrePoli = nombrePoli;
    }

    public String getTechadoOabierto() {
        return techadoOabierto;
    }

    public void setTechadoOabierto(String techadoOabierto) {
        this.techadoOabierto = techadoOabierto;
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
        return "---Polideportivo--- " + "\nNombre del Polideportivo :" + nombrePoli + ", \nTechado o abierto=" + techadoOabierto +
                "\nAlto: "+ super.getAlto()+ "\nLargo: "+ super.getLargo()+
                "\nAncho: "+ super.getAncho();
    }

   
    
}
