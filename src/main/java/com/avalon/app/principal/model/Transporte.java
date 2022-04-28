package com.avalon.Avalon.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Transient;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Transporte {

    @JsonProperty("PermisoTransporte")
    private String PermisoTransporte;

    @JsonProperty("ClaveDeVehiculo")
    private String ClaveDeVehiculo;

    @JsonProperty("TarifaTransporte")
    private String TarifaTransporte;
}

