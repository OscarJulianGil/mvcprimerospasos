package com.example.mvcapp.controllers;

import com.example.mvcapp.services.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceController {

    @RequestMapping(value = "index")
    public String saludo(){
        return "Hola Developers";
    }


    @RequestMapping(value = "getusuarios")
    public List<Usuario> getUsuarios(){
        Usuario usuarioUno = new Usuario();
        usuarioUno.setNombre("Pedro");
        usuarioUno.setApellido("Camargo");

        Usuario usuarioDos = new Usuario();
        usuarioDos.setNombre("Camilo");
        usuarioDos.setApellido("Perez");

        ArrayList nuevaLista = new ArrayList<Usuario>();
        nuevaLista.add(usuarioUno);
        nuevaLista.add(usuarioDos);
        return  nuevaLista;
    }
}
