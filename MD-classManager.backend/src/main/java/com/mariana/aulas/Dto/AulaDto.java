package com.mariana.aulas.Dto;




import com.mariana.aulas.model.TipoAula;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AulaDto(
		
		@NotBlank(message="Selecione a imagem")
		String materia,
		
		@NotBlank(message="O conteúdo precisa ser preenchido")
		@Size(max = 20, message = "O conteúdo não pode ultrapassar de 20 caracteres")
		String conteudo, 
		
		@NotNull(message="O tipo de aula precisa ser selecionado")
		TipoAula tipoAula) {

}
