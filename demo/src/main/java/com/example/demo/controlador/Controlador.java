package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//http://localhost:8080 para probar la aplicación
// Código para dar estilo CSS (fuentes, botones, etc) obtenido de: https://getbootstrap.com/
@Controller
public class Controlador {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/procesa")
    public String procesa(HttpServletRequest request, Model model){
        String titulo = request.getParameter("titulo");
        String nota = request.getParameter("nota");
        System.out.println("titulo ->" + titulo);
        System.out.println("nota -> " + nota);
        model.addAttribute("titulo", titulo);
        model.addAttribute("nota",nota);
        return "final";
    }

}
