package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.controller;

import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model.Prestamo;
import cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/prestamo")
public class PrestamoController {

    private final IPrestamoService iPrestamoService;

    @GetMapping("/{anio}")
    public List<Prestamo> obtenerPrestamoXAnio(@PathVariable("anio") int anio) {
        return iPrestamoService.obtenerPrestamoXAnio(anio);
    }

}
