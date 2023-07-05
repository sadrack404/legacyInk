package br.com.legacyink.api.dto.resumo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CidadeResumoDTO {
    private String nome;
    private String estado;
}