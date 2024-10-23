package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.impl;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.Prestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.repository.PrestamoRepository;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PrestamoService implements IPrestamoService {

    private final PrestamoRepository prestamoRepository;


    @Cacheable(value = "PrestamosXAnio", key = "#anio")
    @Override
    public List<Prestamo> obtenerPrestamoXAnio(int anio) {
        return prestamoRepository.obtenerPrestamosPorAnio(anio);
    }

    @CacheEvict(value = "PrestamosXAnio", allEntries = true)
    @Override
    public Prestamo registrarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @CachePut(value = "PrestamosXAnio", key = "#prestamo.id")
    @Override
    public Prestamo actualizarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @CacheEvict(value = "PrestamosXAnio", allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
