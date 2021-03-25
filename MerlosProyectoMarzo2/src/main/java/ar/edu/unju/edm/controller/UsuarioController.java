package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService Usuarioservicio;
	
	@GetMapping("/usuarios")
	public ModelAndView getUsuario() {
		return new ModelAndView("usuarios").addObject("usuario", new Usuario());
	}
	
	@GetMapping("/listadoUsuarios")
	public String getlistadoUsuarios() {
		return "listadousuarios";
	}
	
	@PostMapping("/guardarUsuario")
	public String saveUsuario(Usuario usuario, Model modelo) {
		
	Usuarioservicio.guardarUsuario(usuario);
	 return "usuarios";

	}

}
