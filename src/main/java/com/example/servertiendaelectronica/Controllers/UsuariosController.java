package com.example.servertiendaelectronica.Controllers;

import com.example.servertiendaelectronica.Models.UsuariosDTO;
import com.example.servertiendaelectronica.Repositories.UsuariosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

    private final UsuariosRepository service;

    public UsuariosController(UsuariosRepository service){

        this.service = service;
    }
    @GetMapping("/ObtenerUsuario")
    public List<UsuariosDTO> GetUsuarios() {
        return service.findAll();
    }

    @PostMapping("/NuevoUsuario")
    @ResponseBody
    public String PostUsuario(@RequestBody UsuariosDTO user) {

        if(user == null){

            return "ocurrio un error";
        }else{
            service.save(user);

            return "Usuario Insertado";
        }

    }

    @PostMapping
    public String AutenticarUsuario(@RequestBody UsuariosDTO user){

        List<UsuariosDTO> listaUsuarios = new ArrayList<>();

        listaUsuarios.add((UsuariosDTO) service.findAll());

        if(listaUsuarios.contains(user)){
            return "Autenticado";
        }else{
            return "no encontrado";
        }
    }




    }
