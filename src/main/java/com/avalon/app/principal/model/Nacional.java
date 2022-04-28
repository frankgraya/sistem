package com.avalon.Avalon.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Nacional {

    @JsonProperty("RfcClienteOProveedor")
    private String RfcClienteOProveedor;

    @JsonProperty("NombreClienteOProveedor")
    private String NombreClienteOProveedor;

    @JsonProperty("PermisoProveedor")
    private String PermisoProveedor;

    @JsonProperty("CFDIs")
    private List<CFDIs> CFDIs;

}
