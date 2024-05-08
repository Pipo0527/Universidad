package co.ucentral.universidad.controlador;

import co.ucentral.universidad.servicios.ServicioUniversidades;
import co.ucentral.universidad.dto.UniversidadDTO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorUniversidad {
    @Autowired
    ServicioUniversidades servUniversidad;

    @GetMapping("/")
    public String inicio(){
        return "redirect:/universidades/lista";
    }

    @GetMapping("/universidades/lista")
    public String mostrar(Model model){
        model.addAttribute("universidades",servUniversidad.listar());
        return "universidades";
    }
}

