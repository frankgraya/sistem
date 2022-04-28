package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.ReporteDeVolumenMensual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReporteDeVolumenMensualRepository extends JpaRepository<ReporteDeVolumenMensual, Long> {
}
