package br.com.legacyink.api.dto;

import br.com.legacyink.api.dto.resumo.ClienteResumo;
import br.com.legacyink.api.dto.resumo.TatuagemResumo;
import br.com.legacyink.domain.model.enums.StatusAgendamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO {

    private String codigo;
    private ClienteResumo cliente;
    private TatuagemResumo tatuagem;
    private StatusAgendamento status;
    private OffsetDateTime dataHora;

}