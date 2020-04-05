package com.example.olmedo.laboratorio2.Controller;

import com.example.olmedo.laboratorio2.Model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @RequestMapping(value="/agregarUsuario", method = RequestMethod.GET)
    public static String welcome(Model model){
        model.addAttribute("usuario", new Usuario());
        return "agregarUsuario";
    }
    @PostMapping(value="/agregarUsuario")
    public static String testpost(@ModelAttribute Usuario user){
        System.out.println(user.getNombre());
        return "mostrarMensaje";
    }
}
