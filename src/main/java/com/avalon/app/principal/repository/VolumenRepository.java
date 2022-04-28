package com.avalon.Avalon.Repository;

import com.avalon.Avalon.Model.Volumen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolumenRepository extends JpaRepository<Volumen, Long> {
}
