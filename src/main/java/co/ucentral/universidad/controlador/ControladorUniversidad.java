package co.ucentral.universidad.controlador;

import co.ucentral.universidad.servicios.ServicioUniversidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUniversidad {
    @Autowired
    ServicioUniversidades servicioUniversidades;

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

