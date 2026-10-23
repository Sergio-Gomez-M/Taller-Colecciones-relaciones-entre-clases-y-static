/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero.modelo;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;

public class Parqueadero {
    private String nombre;
    private ArrayList<Puesto> puestos;
    private static int ingresosTotales = 0;

    public Parqueadero(String nombre, int cantidad) {
        this.nombre = nombre;
        this.puestos = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            puestos.add(new Puesto(i));
        }
    }

    public static int getIngresosTotales() {
        return ingresosTotales;
    }

    public void ingresar(String placa) {
        for (Puesto p : puestos) {
            if (!p.estaLibre() && p.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println(placa + " ya está adentro");
                return;
            }
        }

        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                p.ocupar(placa);
                ingresosTotales++;
                System.out.println(placa + " en puesto " + p.getNumero());
                return;
            }
        }

        System.out.println(placa + ": parqueadero lleno");
    }

    public boolean salir(String placa) {
        for (Puesto p : puestos) {
            if (!p.estaLibre() && p.getPlaca().equalsIgnoreCase(placa)) {
                p.liberar();
                return true;
            }
        }
        return false;
    }

    public int puestosLibres() {
        int libres = 0;
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                libres++;
            }
        }
        return libres;
    }
}
