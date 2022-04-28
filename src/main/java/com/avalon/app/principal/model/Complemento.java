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
public class Complemento {

    @JsonProperty("TipoComplemento")
    private String TipoComplemento;

    @JsonProperty("Nacional")
    private List<Nacional> Nacional;

    @JsonProperty("TerminalAlmYDist")
    private transient TerminalAlmYDist TerminalAlmYDist;

}
