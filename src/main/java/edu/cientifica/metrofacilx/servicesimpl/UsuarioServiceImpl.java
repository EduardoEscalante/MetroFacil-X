package edu.cientifica.metrofacilx.servicesimpl;

import org.springframework.stereotype.Service;

import edu.cientifica.metrofacilx.model.Usuario;
import edu.cientifica.metrofacilx.services.UsuarioService;


//debe anotarse para que funcione o "inyectarlo" en el controller
//Ir a UsuarioController para ver la inyeccion
@Service 
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public boolean validarUsuario(Usuario usuario) {
		if (usuario.getCorreo().equals("ejemplo@gmail.com")) {
			if(usuario.getPassword().equals("ejemplo")) {
				return true;
			}
		}
		return false;
	}
	

}
