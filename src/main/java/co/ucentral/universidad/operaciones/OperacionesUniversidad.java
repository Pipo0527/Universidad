package co.ucentral.universidad.operaciones;

import co.ucentral.universidad.dto.UniversidadDTO;

import java.util.List;

public interface OperacionesUniversidad {
    public List<UniversidadDTO> listar();
    public void ingresar(UniversidadDTO universidad);

}
