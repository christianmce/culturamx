package com.unach.taller.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unach.taller.Service.IArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.unach.taller.Entity.Artista;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/api")
public class ArtistaController {
	@Autowired
	private IArtistaService lognegocioArtista;

	@GetMapping("/artistas")
	public List<Artista> muestratodosArtistas(){
		return lognegocioArtista.consultarTodos();
	}
	
	@PostMapping("/artista")
	public String insertar(@RequestBody Artista obj){
		lognegocioArtista.insertarArtista(obj);
		return "El Artista fue registrado correctamente";
	}
}
