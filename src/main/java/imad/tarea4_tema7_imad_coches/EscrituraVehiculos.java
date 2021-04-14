/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.tarea4_tema7_imad_coches;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class EscrituraVehiculos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        for (int i = 0; i < 30; i++) {
            listaVehiculos.add(new Turismo());
          
        }
        for (int i = 0; i < 30; i++) {
            listaVehiculos.add(new Deportivo());
        }
        for (int i = 0; i < 30; i++) {
            listaVehiculos.add(new Furgoneta());
        }

        String idFichero = "vehiculos.csv";

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            
            flujo.write("Tipo:Matricula:Marca:Modelo:Color:Tarifa:Disponible");
            flujo.newLine();

            for (Vehiculo lib : listaVehiculos) {

                if (lib instanceof Turismo) {

                    flujo.write(((Turismo) lib).toString());

                }

                if (lib instanceof Deportivo) {

                    flujo.write(((Deportivo) lib).toString());
                }

                if (lib instanceof Furgoneta) {

                    flujo.write(((Furgoneta) lib).toString());
                }
                
                flujo.newLine();
            }

            

            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
