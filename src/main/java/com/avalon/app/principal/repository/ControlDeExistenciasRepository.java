package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.ControlDeExistencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ControlDeExistenciasRepository extends JpaRepository<ControlDeExistencias, Long> {
}
