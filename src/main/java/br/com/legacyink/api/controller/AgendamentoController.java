package br.com.legacyink.api.controller;

import br.com.legacyink.api.dto.AgendamentoDTO;
import br.com.legacyink.api.dto.input.AgendamentoInput;
import br.com.legacyink.api.dtoconverter.AgendamentoDTOConverter;
import br.com.legacyink.domain.model.Agendamento;
import br.com.legacyink.domain.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudios/{estudioId}/tatuador/{tatuadorId}/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;
    @Autowired
    private AgendamentoDTOConverter converter;

    @GetMapping
    public List<AgendamentoDTO> listar(@PathVariable Long estudioId, @PathVariable Long tatuadorId) {
        List<Agendamento> listar = agendamentoService.listar(estudioId, tatuadorId);
        return converter.paraDTOLista(listar);
    }

    @GetMapping("/{agendamentoId}")
    public AgendamentoDTO buscar(@PathVariable Long agendamentoId) {
        var agendamento = agendamentoService.validaEnderecoOuErro(agendamentoId);
        return converter.paraDTO(agendamento);
    }

    @PostMapping
    public AgendamentoDTO agendar(@PathVariable Long estudioId, @PathVariable Long tatuadorId, @Validated @RequestBody AgendamentoInput agendamentoInput) {
        Agendamento agendamento = agendamentoService.agendar(estudioId, tatuadorId, agendamentoInput);
        return converter.paraDTO(agendamento);
    }

    @PutMapping
    public AgendamentoDTO alterar(@PathVariable Long estudioId, @PathVariable Long tatuadorId, @Validated @RequestBody AgendamentoInput agendamentoInput) {
        return converter.paraDTO(agendamentoService.alterar(estudioId, tatuadorId, agendamentoInput));
    }

    @DeleteMapping("/{agendamentoId}")
    public void desagendar(@PathVariable Long estudioId, @PathVariable Long tatuadorId, @PathVariable Long agendamentoId) {
        agendamentoService.desagendar(estudioId, tatuadorId, agendamentoId);
    }

}