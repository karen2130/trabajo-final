package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.UsuarioDAO;

@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	UsuarioDAO Usuariorepository;

	@Override
	public void guardarUsuario(Usuario unUsuario) {
		// TODO Auto-generated method stub
		Usuariorepository.save(unUsuario);
	}

	@Override
	public Iterable<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario editar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
