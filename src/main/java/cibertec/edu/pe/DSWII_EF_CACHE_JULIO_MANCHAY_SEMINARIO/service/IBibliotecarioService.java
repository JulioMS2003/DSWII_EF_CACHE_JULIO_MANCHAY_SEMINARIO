package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.Bibliotecario;

import java.util.List;

public interface IBibliotecarioService {

    List<Bibliotecario> ObtenerBibliotecarioXCategoria(Integer idCategoria);
    Bibliotecario registrarBibliotecario(Bibliotecario bibliotecario);
    Bibliotecario actualizarBibliotecario(Bibliotecario bibliotecario);
    void eliminarCache();

}
