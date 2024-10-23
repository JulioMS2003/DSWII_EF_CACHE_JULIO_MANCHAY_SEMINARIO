package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.impl;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.DetallePrestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.repository.DetallePrestamoRepository;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.IDetallePrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DetallePrestamoService implements IDetallePrestamoService {

    private final DetallePrestamoRepository detallePrestamoRepository;


    @Cacheable(value = "DetalleXAnio", key = "#anio")
    @Override
    public List<DetallePrestamo> obtenerDetallePrestamoXAnio(int anio) {
        return detallePrestamoRepository.obtenerDetallePrestamoXAnio(anio);
    }
}

