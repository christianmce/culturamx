package com.unach.taller.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_murales")
public class Mural {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idMural")
		private int IdMural;	

		@Column(name = "titulo",nullable = false,length=150)
		private String Titulo;	

		@Column(name = "fecha")
		private int Fecha;
		
		@Column(name = "dimensiones",length=70)
		private String Dimensiones;	
	
		
		@Column(name = "institucion",length=100)
		private String Institucion;
		
		@Column(name = "url",nullable = false)
		private String Url;
		
		@ManyToOne(cascade = CascadeType.REMOVE)
	    @JoinColumn(name = "idArtista",referencedColumnName = "idArtista")
	    private Artista artista;

		
		
		public Mural() {
			super();
		}


		public Mural(int idMural, String titulo, int fecha, String dimensiones, String institucion, String url,
				Artista artista) {
			super();
			IdMural = idMural;
			Titulo = titulo;
			Fecha = fecha;
			Dimensiones = dimensiones;
			Institucion = institucion;
			Url = url;
			this.artista = artista;
		}


		public int getIdMural() {
			return IdMural;
		}


		public void setIdMural(int idMural) {
			IdMural = idMural;
		}


		public String getTitulo() {
			return Titulo;
		}


		public void setTitulo(String titulo) {
			Titulo = titulo;
		}


		public int getFecha() {
			return Fecha;
		}


		public void setFecha(int fecha) {
			Fecha = fecha;
		}


		public String getDimensiones() {
			return Dimensiones;
		}


		public void setDimensiones(String dimensiones) {
			Dimensiones = dimensiones;
		}


		public String getInstitucion() {
			return Institucion;
		}


		public void setInstitucion(String institucion) {
			Institucion = institucion;
		}


		public String getUrl() {
			return Url;
		}


		public void setUrl(String url) {
			Url = url;
		}


		public Artista getArtista() {
			return artista;
		}


		public void setArtista(Artista artista) {
			this.artista = artista;
		}		
		
		
}
