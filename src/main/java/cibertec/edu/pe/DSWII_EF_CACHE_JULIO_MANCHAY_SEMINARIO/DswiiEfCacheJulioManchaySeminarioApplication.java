package cibertec.edu.pe.DSWII_EF_CACHE_JULIO_MANCHAY_SEMINARIO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DswiiEfCacheJulioManchaySeminarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheJulioManchaySeminarioApplication.class, args);
	}

}
