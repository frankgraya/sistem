package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.Entregas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregasRepository extends JpaRepository<Entregas, Long>  {
}
