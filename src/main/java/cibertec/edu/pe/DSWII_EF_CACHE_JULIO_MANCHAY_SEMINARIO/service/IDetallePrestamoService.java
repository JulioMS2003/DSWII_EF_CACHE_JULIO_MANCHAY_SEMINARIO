package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.DetallePrestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.repository.DetallePrestamoRepository;

import java.util.List;

public interface IDetallePrestamoService {

    List<DetallePrestamo> obtenerDetallePrestamoXAnio(int anio);

}
