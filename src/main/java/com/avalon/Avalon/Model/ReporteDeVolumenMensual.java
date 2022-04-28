package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "reporte_de_volumen_mensual")
public class ReporteDeVolumenMensual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "control_de_existencias_id")
    @JsonProperty("ControlDeExistencias")
    private ControlDeExistencias ControlDeExistencias;

    @ManyToOne
    @JoinColumn(name = "entregas_id")
    @JsonProperty("Entregas")
    private Entregas Entregas;

    @ManyToOne
    @JoinColumn(name = "recepciones_id")
    @JsonProperty("Recepciones")
    private Recepciones Recepciones;

}
