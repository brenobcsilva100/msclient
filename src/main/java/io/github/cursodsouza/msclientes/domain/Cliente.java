package io.github.cursodsouza.msclientes.domain;

import javax.persistence.Id;

public class Cliente {

    @Id

    private Long id;
    private String cpf;
    private String nome;
    private Integer idade;

}
