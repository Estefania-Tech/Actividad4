package Novios;


public class Novio {
    private String nombre;
    private int edad;
    private String ocupacion;
    private boolean esRomantico;
    private double precioPorDia;

    public Novio(String nombre, int edad, String ocupacion, boolean esRomantico, double precioPorDia) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.esRomantico = esRomantico;
        this.precioPorDia = precioPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public boolean isEsRomantico() {
        return esRomantico;
    }

    public void setEsRomantico(boolean esRomantico) {
        this.esRomantico = esRomantico;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    
    
    public void saludar(){
        System.out.println("Hola, soy " + nombre +  " Estoy listo para ser tu novio por un dia! y tengo  " +edad+ " años");
    
    }
    
}
