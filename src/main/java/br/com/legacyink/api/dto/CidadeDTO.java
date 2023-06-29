package br.com.legacyink.api.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CidadeDTO {

    private Long id;
    private String nome;
    private EstadoDTO estado;

}
