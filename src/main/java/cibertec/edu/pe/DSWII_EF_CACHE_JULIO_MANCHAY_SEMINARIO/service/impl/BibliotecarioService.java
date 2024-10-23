package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.impl;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.Bibliotecario;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.repository.BibliotecarioRepository;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.IBibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BibliotecarioService implements IBibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    @Cacheable(value = "categoriaBibliotecario", key = "#idCategoria")
    @Override
    public List<Bibliotecario> ObtenerBibliotecarioXCategoria(Integer idCategoria) {
        return bibliotecarioRepository.obtenerBibliotecariosXCategoria(idCategoria);
    }

    @CacheEvict(value = "categoriaBibliotecario", allEntries = true)
    @Override
    public Bibliotecario registrarBibliotecario(Bibliotecario bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

    @CachePut(value = "categoriaBibliotecario", key = "#bibliotecario.id")
    @Override
    public Bibliotecario actualizarBibliotecario(Bibliotecario bibliotecario) {
        return bibliotecarioRepository.save(bibliotecario);
    }

    @CacheEvict(value = "categoriaBibliotecario", allEntries = true)
    @Override
    public void eliminarCache() {
        // Este método eliminará todas las entradas de la caché
    }
}
