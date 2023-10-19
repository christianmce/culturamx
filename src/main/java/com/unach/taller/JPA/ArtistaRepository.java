package com.unach.taller.JPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.unach.taller.Entity.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Integer>{

	@Query ("select o from Artista o where o.Apellidos like %?1 ORDER BY o.Nombre DESC")
	Artista findByNombre(String apellido);
	
}
