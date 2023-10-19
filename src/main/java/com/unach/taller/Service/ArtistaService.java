package com.unach.taller.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.unach.taller.Entity.Artista;
import com.unach.taller.JPA.ArtistaRepository;

//LOGICA DE NEGOCIO
@Service
public class ArtistaService implements IArtistaService{

	@Autowired
	private ArtistaRepository repoArtista;
	
	@Override
	public List<Artista> consultarTodos() {
		List<Artista> result = repoArtista.findAll();
		if(result.isEmpty())
			throw new ResourceNotFoundException("No existen Artistas registrados en la Base de Datos");
		
		return repoArtista.findAll();
	}

	@Override
	public ResponseEntity<Artista> consultarbyId(int idArt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artista> consultarxApellido(String ape) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseEntity<Map<String, String>> insertarArtista(Artista obj) {
		Map<String, String> okResponse = new HashMap<>();
		okResponse.put("message", "El Artista se ha registrado correctamente");
	    okResponse.put("status", HttpStatus.CREATED.toString());
	    repoArtista.save(obj);
		return new ResponseEntity<>(okResponse,HttpStatus.CREATED);
	}

}
