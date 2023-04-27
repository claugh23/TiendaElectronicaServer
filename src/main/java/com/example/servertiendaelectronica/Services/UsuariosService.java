package com.example.servertiendaelectronica.Services;

import com.example.servertiendaelectronica.Models.UsuariosDTO;
import com.example.servertiendaelectronica.Repositories.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuariosService {

    private final UsuariosRepository service;
    public UsuariosService(UsuariosRepository service) {
        this.service = service;
    }
    public List<UsuariosDTO> ObtenerUsuarios(){
        return service.findAll();
    }
    public String InsertarUsuario(UsuariosDTO user){

        if (user != null){

            service.save(user);
            return "Usuario Insertado";
        }else{
            return "ocurrio un error";
        }

    }

    public String AutenticarUsuario(UsuariosDTO user){

        List<UsuariosDTO> dbUsuarios = new ArrayList<>();

        dbUsuarios.add((UsuariosDTO) service.findAll());

       if(dbUsuarios.contains(user)){
           return "Autenticado";

       }else{
           return "Usuario no encontrado";
       }


    }

}
