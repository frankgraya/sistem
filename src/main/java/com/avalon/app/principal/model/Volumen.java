package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "volumen")
public class Volumen {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("ValorNumerico")
    private double ValorNumerico;

    @JsonProperty("UnidadDeMedida")
    private String UnidadDeMedida;

    Map<String , String> obtieneDato() {
        return Collections.unmodifiableMap(
                new HashMap<>() {{
                    put("ValorNumerico", String.valueOf(ValorNumerico));
                    put("UnidadDeMedida", UnidadDeMedida);
                }});
    }
}
