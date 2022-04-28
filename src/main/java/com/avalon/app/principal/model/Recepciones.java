package com.avalon.Avalon.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "recepciones")
public class Recepciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty("TotalRecepcionesMes")
    private long TotalRecepcionesMes;

    @ManyToOne
    @JoinColumn(name = "suma_volumen_recepcion_mes_id")
    @JsonProperty("SumaVolumenRecepcionMes")
   private Volumen SumaVolumenRecepcionMes;

    @JsonProperty("TotalDocumentosMes")
    private long TotalDocumentosMes;

    @JsonProperty("ImporteTotalRecepcionesMensual")
    private double ImporteTotalRecepcionesMensual;

   @JsonProperty("Complemento")
    private transient List<Complemento> Complemento;

}
