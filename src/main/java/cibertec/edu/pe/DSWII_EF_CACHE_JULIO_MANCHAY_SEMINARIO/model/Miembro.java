package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Miembro")
public class Miembro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechanacimiento;
}
