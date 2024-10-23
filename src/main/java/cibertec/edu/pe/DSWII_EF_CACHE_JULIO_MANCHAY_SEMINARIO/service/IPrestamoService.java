package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.Prestamo;

import java.util.List;

public interface IPrestamoService {

    List<Prestamo> obtenerPrestamoXAnio(int anio);
    Prestamo registrarPrestamo(Prestamo prestamo);
    Prestamo actualizarPrestamo(Prestamo prestamo);
    void eliminarCache();

}
