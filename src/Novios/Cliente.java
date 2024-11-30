package Novios;


public class Cliente {
    private String nombre;
    private int edad;
    private String preferenciaRomantica;

    public Cliente(String nombre, int edad, String preferenciaRomantica) {
        this.nombre = nombre;
        this.edad = edad;
        this.preferenciaRomantica = preferenciaRomantica;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPreferenciaRomantica() {
        return preferenciaRomantica;
    }

    public void setPreferenciaRomantica(String preferenciaRomantica) {
        this.preferenciaRomantica = preferenciaRomantica;
    }
    
    public void solicitarNovio(Novio novio){
        System.out.println("Cliente: " +nombre+ " has solicitado al novio " +novio.getNombre());
        novio.saludar();
        System.out.println("Detalles del novio ");
        System.out.println("Precio por dia del novio es $: " +novio.getPrecioPorDia()+ " y mi ocupacion es: " + novio.getOcupacion());
    }
    
}
