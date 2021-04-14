/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.tarea4_tema7_imad_coches;

import java.awt.Color;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author MSI
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo() {
        this.matricula = generaMatricula();
        this.marca = "FIAT";
        this.modelo = "FEO";
        this.color = "rojo";
        this.tarifa = 2.0;
        this.disponible = true;
    }

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = generaMatricula();
        this.marca = "FIAT";
        this.modelo = "FEO";
        this.color = "rojo";
        this.tarifa = 2.0;
        this.disponible = true;
    }

    private static String generaMatricula() {
        //Letras válidas para matrícula
        char[] array = {'B', 'C',
            'D', 'F', 'G', 'H', 'J', 'K', 'L',
            'M', 'N', 'P', 'R', 'S', 'T', 'V',
            'W', 'X', 'Y', 'Z'};

        String matricula = "";

        for (int i = 0; i < 7; i++) {
            Random rnd = new Random();
            int ale = (int) (rnd.nextDouble() * array.length); //Aleatorio para la letra
            int ale2 = (int) (rnd.nextDouble() * 10); //Aleatorio entre 0-9
            if (i > 3) {
                matricula += array[ale];
            } else {
                matricula += ale2;
            }
        }

        return matricula;

    }
    
        private static String genrarColor(){
        
        String [] arrayColores = {"naranja","blanco","rojo","azul","verde",
            "amarillo","marron","negro","dorado"};
        
        Random aleatorioRD = new Random();
        
        int numeroAleatorio = aleatorioRD.nextInt(7);
        

        
        String color = arrayColores[numeroAleatorio];
        
        return color;
    }
    
    private static String genararMarca(int posicion){
         String [] arrayMarcas = {"Fiat","Ford","Maserati","Audi","Ferrari",
            "Citroen","Renault","Opel","Mustang"};
       Random aleatorioRD = new Random();
        
        int numeroAleatorio = aleatorioRD.nextInt(7);
        

        
        String marca = arrayMarcas[numeroAleatorio];
        
        return marca;
    }
    
    private static String modelo(int posicion){
          String [] arrayModelo = {"a1","c3","Giulia","a7","Enzo",
            "B3","Corsa","Zafira","SS"};
       Random aleatorioRD = new Random();
        
        int numeroAleatorio = aleatorioRD.nextInt(7);
        

        
        String modelo = arrayModelo[numeroAleatorio];
        
        return modelo;
    }
    
    private static double tarifa(int posicion){
        String cadena = "2,5,6,10.5,22";
        String [] lista = cadena.split(",");
        
        return Double.parseDouble(lista[posicion]);
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.matricula);
        hash = 79 * hash + Objects.hashCode(this.marca);
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 79 * hash + (this.disponible ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return matricula + ":" + marca + ":" + modelo + ":" + color + ":" + tarifa;
    }
}
