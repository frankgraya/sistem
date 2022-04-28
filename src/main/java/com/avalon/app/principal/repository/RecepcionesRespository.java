package com.avalon.Avalon.Repository;


import com.avalon.Avalon.Model.Recepciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepcionesRespository extends JpaRepository<Recepciones, Long> {


}
