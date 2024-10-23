package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.repository;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Integer> {

    @Query("SELECT b FROM Bibliotecario b WHERE b.categoria.id = :idCategoria")
    List<Bibliotecario> obtenerBibliotecariosXCategoria(@Param("idCategoria") Integer idCategoria);

}
