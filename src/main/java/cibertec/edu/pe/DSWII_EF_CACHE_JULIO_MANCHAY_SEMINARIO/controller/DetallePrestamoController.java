package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.controller;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.DetallePrestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.IDetallePrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/detalleprestamo")
public class DetallePrestamoController {

    private final IDetallePrestamoService iDetallePrestamoService;

    @GetMapping("/{anio}")
    public List<DetallePrestamo> obtenerDetallePrestamoXAnio(@PathVariable("anio") int anio) {
        return iDetallePrestamoService.obtenerDetallePrestamoXAnio(anio);
    }
}
