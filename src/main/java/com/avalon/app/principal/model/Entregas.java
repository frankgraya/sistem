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
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "entregas")
public class Entregas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonProperty("TotalEntregasMes")
    private long TotalEntregasMes;

    @ManyToOne
    @JoinColumn(name = "suma_volumen_entregado_mes_id")
    @JsonProperty("SumaVolumenEntregadoMes")
    private Volumen SumaVolumenEntregadoMes;

    @JsonProperty("TotalDocumentosMes")
    private long TotalDocumentosMes;

    @JsonProperty("ImporteTotalEntregasMes")
    private double ImporteTotalEntregasMes;

    @JsonProperty("Complemento")
    private transient List<Complemento> Complemento;

}
