package edu.cientifica.metrofacilx.controller;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.metrofacilx.model.Usuario;
import edu.cientifica.metrofacilx.services.UsuarioService;



@Controller //Recurso que administra las peticiones exteriores
public class UsuarioController {
	//Inyeccion de objetos
	//Este es el servicio inyectado de UsuarioServiceImpl
	@Autowired UsuarioService usuarioService;
	
	//Los metodos controlan las peticiones
	@RequestMapping (value = {"/","login"}, method = RequestMethod.GET)
	//@GetMapping ("/login") ESTE ES LA LINEA SIMPLIFICADA DE LA LINEA DE ARRIBA
	//atiende las peticiones
	//"mapeara" las peticiones que se haga en login.html
	public String cargaInicial() {
		return "login";
	}

	//Aca estamos agregando este metodo para poder ir a la pagina de registro
	//Lo que se hizo es referirse en la ruta de la etiqueta "a" en login.html y
	// cambiar esto: <a href="/register.html">¿No posees una cuenta? Registrate</a>
	//Por eso: <a href="/register">¿No posees una cuenta? Registrate</a>
	//El segundo hace referencia al @RequestMapping de abajo
	//(Se hizo lo mismo en register.html para volver a login.html)
	@RequestMapping (value = {"/register"}, method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	//Se esta guardando los valores del login en esas variables
	//Toda peticion que venga de un formulario es de tipo POST (como abajo)
	//*IMPORTANTE: poner el nombre en el HTML (formulario) del value del 
	//@RequestMapping, mas no el nombre del metodo en si: value = "/validarUsuario
	
	@RequestMapping(value = "/validarUsuario", method = RequestMethod.POST )
	//@PostMapping ("/validarUsuario") ESTA ES LA LINEA SIMPLIFICADA DE LA LINEA DE ARRIBA
	public String validar(Model model, 
			@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) 
	{
		Usuario usuario = new Usuario (username,password);
		
		if(usuarioService.validarUsuario(usuario)) {
			
			return "principal";
		}
		return "login";
	} 

}

