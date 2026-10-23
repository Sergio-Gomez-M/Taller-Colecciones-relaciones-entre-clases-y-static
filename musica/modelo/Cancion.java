/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.modelo;

/**
 *
 * @author Hp
 */
public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private static int totalCanciones = 0;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        totalCanciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public static int getTotalCanciones() {
        return totalCanciones;
    }
}
