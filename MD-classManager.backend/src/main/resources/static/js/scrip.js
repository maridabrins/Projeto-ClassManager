document.getElementById("criarAulaButton").addEventListener("click", function() {
    // Pegando os valores dos campos do formulário
    const materia = document.getElementById("materia").value;
    const conteudo = document.getElementById("conteudo").value;
    const tipoAula = document.getElementById("tipoAula").value;

    // Criando um objeto com os dados do formulário
    const aulaData = {
        materia: materia,
        conteudo: conteudo,
        tipoAula: tipoAula
    };

    // Mostrando no console os dados antes de enviar
    console.log("Dados enviados:", aulaData);

    // Realizando a requisição POST com JSON
    fetch("http://localhost:8080/aulas/criar-nova", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",  // Enviar como JSON
        },
        body: JSON.stringify(aulaData),  // Convertendo o objeto aulaData para JSON
        mode: 'cors' // Adicionando CORS explicitamente
    })
    .then(response => {
        if (!response.ok) {
            // Se a resposta não for ok, lançar um erro
            throw new Error("Erro na criação da aula. Código de erro: " + response.status);
        }
        return response.json();  // Se for bem-sucedida, converte a resposta para JSON
    })
    .then(data => {
        // Se a aula foi criada com sucesso
        console.log("Aula criada com sucesso:", data);
        alert("Aula criada com sucesso!");

        // Limpar o formulário após a criação
        document.getElementById("formAula").reset();
    })
    .catch(error => {
        // Caso haja um erro na requisição ou no processamento
        console.error("Erro ao criar aula:", error);
        alert("Erro ao criar aula: " + error.message);

        // Adicionalmente, podemos adicionar mais informações ao erro para facilitar o diagnóstico
        alert("Erro ao enviar a requisição para o backend. Verifique os logs de rede.");
    });
});
