package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "control_de_existencias")
public class ControlDeExistencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty("VolumenExistenciasMes")
    private double VolumenExistenciasMes;

    @JsonProperty("FechaYHoraEstaMedicionMes")
    private Date FechaYHoraEstaMedicionMes;

    Map<String , String> obtieneDato() {
        return Collections.unmodifiableMap(
                new HashMap<>() {{
                    put("VolumenExistenciasMes", String.valueOf(VolumenExistenciasMes));
                    put("FechaYHoraEstaMedicionMes", String.valueOf(FechaYHoraEstaMedicionMes));
                }});
    }
}
