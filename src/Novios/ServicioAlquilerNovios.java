package Novios;

import java.util.Scanner;


public class ServicioAlquilerNovios {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //capturar datos del cliente
        System.out.println("Ingresando datos del cliente");
        System.out.print("Nombre del Cliente: ");
        String nombreCliente = entrada.nextLine();
        System.out.print("Edad del cliente: ");
        int edadCliente = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Preferencia Romantica del cliente: ");
        String preferenciaRomanticaCliente = entrada.nextLine();
        
        //capturar la cantidad de novios a registrar
        System.out.println("Cuantos novios deseas registrar: ");
        int cantidadNovios = entrada.nextInt();
        entrada.nextLine();
        
        //Resgistrar los novios
        Novio[] novios = new Novio[cantidadNovios];
        for(int i=0; i<cantidadNovios; i++){
            System.out.println("\n Ingrese los datos del novio # "+ (i+1) + ": ");
            System.out.print("Nombre del novio: ");
            String nombreNovio = entrada.nextLine();
            System.out.print("Edad del novio: ");
            int edadNovio = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ocupacion del novio: ");
            String ocupacionNovio = entrada.nextLine();
            System.out.println("Es romantico (true o false: )");
            boolean esRomanticoNovio = entrada.nextBoolean();
            System.out.println("Precio por dia del novio $: ");
            double precioPorDiaNovio = entrada.nextDouble();
            entrada.nextLine();
            
            novios[i] = new Novio(nombreNovio, edadNovio,ocupacionNovio, esRomanticoNovio, precioPorDiaNovio);
        }
        
        //imprimir lista de novios
        System.out.println("\n Lista de Novios Disponibles : ");
        for (int i=0; i <cantidadNovios; i++) {
            System.out.println((i+1)+". " +novios[i].getNombre());
        }

      //cliente selecciona un novio
        System.out.println("\n" + nombreCliente + " Elija un novio (ingrese el numero): ");
        int opcionNovio = entrada.nextInt();
        entrada.nextLine();
        
        while(opcionNovio <1 || opcionNovio>cantidadNovios ){
            System.out.println("\n" + nombreCliente + " Elija un novio (ingrese el numero): ");
            opcionNovio = entrada.nextInt();
            entrada.nextLine();
            // verificar que la opcion este dentro del rango
            if(opcionNovio <1 || opcionNovio>cantidadNovios ){
                System.out.println("Opcion invalida. por favor elija un numero de los novios");
        }
        }
        
        Cliente cliente = new Cliente(nombreCliente, edadCliente, preferenciaRomanticaCliente);
        Novio novioseleccionado =  novios[opcionNovio-1];
        cliente.solicitarNovio(novioseleccionado);
        
        
    }
    
}