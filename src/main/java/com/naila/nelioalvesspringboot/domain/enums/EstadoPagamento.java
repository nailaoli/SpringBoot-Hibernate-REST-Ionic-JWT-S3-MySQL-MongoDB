package com.naila.nelioalvesspringboot.domain.enums;

import java.util.Arrays;
import java.util.Optional;

public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private Integer cod;
    private String descricao;

    private EstadoPagamento(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer cod) {
        if (cod == null) return null;
        Optional<EstadoPagamento> estadoPagamento =
                Arrays.stream(EstadoPagamento.values()).filter(x -> x.getCod() == cod).findFirst();
        return estadoPagamento.orElseThrow(() -> new IllegalArgumentException("Id inválido: " + cod));
    }


}
