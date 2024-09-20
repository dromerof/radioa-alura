package com.aluracursos.radioalura.modelos;

public class Favoritos {
   public void incluye(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritos");
        }else {
            System.out.println(audio.getTitulo() + "Tambien es uno de los favoritos");
        }
    }
}
