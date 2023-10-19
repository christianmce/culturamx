package com.unach.taller.Entity;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_artistas")
public class Artista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idArtista")
	private int IdArtista;	

	@Column(name = "nombre",nullable = false,length=30)
	private String Nombre;	
	
	@Column(name = "apellidos",nullable = false,length=50)
	private String Apellidos;
	
	@OneToMany(mappedBy = "artista")
	private List<Mural> pinturas;	
	
	public Artista() {
		super();
	}

	public Artista(int idArtista, String nombre, String apellidos, List<Mural> pinturas) {
		super();
		IdArtista = idArtista;
		Nombre = nombre;
		Apellidos = apellidos;
		this.pinturas = pinturas;
	}

	public int getIdArtista() {
		return IdArtista;
	}

	public void setIdArtista(int idArtista) {
		IdArtista = idArtista;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public List<Mural> getPinturas() {
		return pinturas;
	}

	public void setPinturas(List<Mural> pinturas) {
		this.pinturas = pinturas;
	}
	
	
}
