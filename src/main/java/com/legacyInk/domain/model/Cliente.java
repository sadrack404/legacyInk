package com.legacyInk.domain.model;

import com.legacyInk.domain.model.enums.Sexo;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Cliente {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    @Embedded
    private Endereco endereco;
    private Integer idade;
    private Sexo sexo;

}