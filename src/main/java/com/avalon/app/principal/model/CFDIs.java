package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CFDIs {

    @JsonProperty("Cfdi")
    private String Cfdi;

    @JsonProperty("TipoCfdi")
    private String TipoCfdi;

    @JsonProperty("PrecioCompra")
    private double PrecioCompra;

    @JsonProperty("PrecioDeVentaAlPublico")
    private double PrecioDeVentaAlPublico;

    @JsonProperty("PrecioVenta")
    private double PrecioVenta;

    @JsonProperty("VolumenDocumentado")
    private Volumen VolumenDocumentado;

    @JsonProperty("FechaYHoraTransaccion")
    @Column(name = "FechaYHoraTransaccion", updatable = false, nullable = false)
    private Date FechaYHoraTransaccion;

}
