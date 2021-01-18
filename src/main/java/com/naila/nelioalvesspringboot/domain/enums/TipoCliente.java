package com.naila.nelioalvesspringboot.domain.enums;

import java.util.Arrays;
import java.util.Optional;

public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private Integer cod;
    private String descricao;

//    Enums têm construtor private
//    You need this constructor to be private, because enums define a finite set of values
//    If you don't use "private" then the compiler adds it for you
    private TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

//    Não entendi se Enums não podem definitivamente ter setter
//    O professor falou que é melhor não colocar
    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) {
        if (cod == null) return null;
        Optional<TipoCliente> tipoCliente =
                Arrays.stream(TipoCliente.values()).filter(x -> x.getCod() == cod).findFirst();
        return tipoCliente.orElseThrow(() -> new IllegalArgumentException("Id inválido: " + cod));
    }

}
