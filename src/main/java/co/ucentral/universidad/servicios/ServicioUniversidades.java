package co.ucentral.universidad.servicios;

import co.ucentral.universidad.config.ModelMapperConf;
import co.ucentral.universidad.dto.UniversidadDTO;
import co.ucentral.universidad.entidades.Universidad;
import co.ucentral.universidad.operaciones.OperacionesUniversidad;
import co.ucentral.universidad.repositorios.RepoUniversidad;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUniversidades implements OperacionesUniversidad {

    @Autowired
    RepoUniversidad repoUniversidad;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UniversidadDTO> listar() {
        TypeToken<List<UniversidadDTO>> typeToken = new TypeToken<>(){};
        return modelMapper.map(repoUniversidad.findAll(),typeToken.getType());

    }

    @Override
    public void ingresar(UniversidadDTO universidad) {
        Universidad universidades = modelMapper.map(universidad, Universidad.class);
        repoUniversidad.save(universidades);

    }

}

