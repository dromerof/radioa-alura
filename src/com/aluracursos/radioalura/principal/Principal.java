package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.Favoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Daniel Romero");
        miPodcast.setTitulo("Cafe.tech");

        //Cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        //PodCast
        for (int i = 0; i < 180; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 9883; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gustas: "+ miCancion.getTotalDeMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.incluye(miPodcast);
        favoritos.incluye(miCancion);
    }
}
