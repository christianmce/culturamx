package com.unach.taller.Service;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.unach.taller.Entity.Artista;

public interface IArtistaService {
	List<Artista> consultarTodos();  
	ResponseEntity<Artista> consultarbyId(int idArt);
	List<Artista> consultarxApellido(String ape);
	ResponseEntity<Map<String, String>> insertarArtista(Artista obj);
}
