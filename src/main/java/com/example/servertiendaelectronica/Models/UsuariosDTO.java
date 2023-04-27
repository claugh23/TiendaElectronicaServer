package com.example.servertiendaelectronica.Models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
public class UsuariosDTO {
    private String _id;
    private String user_name;
    private String user_lastName;
    private String user_email;
    private int user_phone;
    private String user_password;
}
