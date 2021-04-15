/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.tarea4_tema7_imad_coches;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class LecturaVehiculos {

    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        // Fichero a leer con datos de ejemplo
        // String idFichero = "RegAlum.csv";
        String idFichero = "vehiculos.csv";
        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(":");
                Vehiculo tmp = new Vehiculo();

                for (String string : tokens) {
//                    System.out.print(string + "\t");
                    if (tmp instanceof Turismo) {
                        tmp.setMatricula(tokens[0]);
                        tmp.setMarca(tokens[1]);
                        tmp.setModelo(tokens[2]);
                        tmp.setColor(tokens[3]);

                        tmp.setTarifa(Double.parseDouble(tokens[4]));
                        tmp.setDisponible(Boolean.valueOf(tokens[5]));

                    } else if (tmp instanceof Deportivo) {
                        tmp.setMatricula(tokens[0]);
                        tmp.setMarca(tokens[1]);
                        tmp.setModelo(tokens[2]);
                        tmp.setColor(tokens[3]);

                        tmp.setTarifa(Double.parseDouble(tokens[4]));
                        tmp.setDisponible(Boolean.valueOf(tokens[5]));

                    } else if (tmp instanceof Turismo) {
                        tmp.setMatricula(tokens[0]);
                        tmp.setMarca(tokens[1]);
                        tmp.setModelo(tokens[2]);
                        tmp.setColor(tokens[3]);

                        tmp.setTarifa(Double.parseDouble(tokens[4]));
                        tmp.setDisponible(Boolean.valueOf(tokens[5]));

                    }

                }
//                System.out.println();
                listaVehiculos.add(tmp);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Vehiculo a1 : listaVehiculos) {
            System.out.println(a1);
        }

    }
}
