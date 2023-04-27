package com.example.servertiendaelectronica.Repositories;

import com.example.servertiendaelectronica.Models.UsuariosDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends MongoRepository<UsuariosDTO, String> {
}
