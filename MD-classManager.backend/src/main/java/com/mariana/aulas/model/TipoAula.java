package com.mariana.aulas.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoAula {
    
    PREPARADA, LECIONADA;

    // Método personalizado para converter uma string para um valor de enum
    @JsonCreator
    public static TipoAula fromValue(String value) {
        try {
            // Tentativa de conversão para o valor do enum (ignorando maiúsculas/minúsculas)
            return TipoAula.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Se o valor não for válido, pode retornar um valor default ou lançar uma exceção
            // Exemplo de valor default (caso seja desejado)
            return PREPARADA;  // Pode ser qualquer valor válido do enum ou uma exceção personalizada
        }
    }

    // Método para garantir que a string que será serializada está em um formato correto
    @JsonValue
    public String toValue() {
        return this.name().toUpperCase();
    }
}
