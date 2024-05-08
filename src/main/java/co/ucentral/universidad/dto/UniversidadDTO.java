package co.ucentral.universidad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString

public class UniversidadDTO implements Serializable{

    private long codigo;

    private long correo;

    private String nombre;

    private String direccion;

    private int telefono;
}
