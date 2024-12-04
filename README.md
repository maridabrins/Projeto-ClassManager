[JAVASCRIPT__BADGE]: https://img.shields.io/badge/Javascript-000?style=for-the-badge&logo=javascript
[HTML5_BADGE]: https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white
[CSS3_BADGE]: https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white
[JAVA_BADGE]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[MySQL_BADGE]: https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white

<h1 align="center" style="font-weight: bold;">CLASSMANAGER </h1>

![javascript][JAVASCRIPT__BADGE]
![MySQL][MySQL_BADGE]
![spring][SPRING_BADGE]
![java][JAVA_BADGE]
![HTML5][HTML5_BADGE]
![CSS3][CSS3_BADGE]






<p align="center">
  <b>O ClassManager é um gerenciador de aulas onde os usuários podem facilitar e organizar suas aulas a serem lecionadas e prepara-las também. </b>
</p>

<h2 id="started">🚀 Para Começar: </h2>

Para rodar esta aplicação localmente é necessário os seguintes recursos 

<h3>Pré-requisitos</h3>

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Lombook](https://projectlombok.org/download)

<h3>Instruções</h3>

Como clonar o projeto

```bash
git clone https://github.com/maridabrins/Projeto-ClassManager.git
```

<h3> Variáveis ​​de ambiente</h2>

Credenciais necessárias para o `application.propertie` 
```yaml
spring.datasource.url=jdbc:mysql://localhost:3306/ClassManager
spring.datasource.username= SEU_USER
spring.datasource.password= SUA_SENHA
```


<h2 id="routes">📍 API Endpoints</h2>

​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /aulas</kbd>     | caminho para ver todas as aulas registradas [response details](#get-auth-detail)
| <kbd>GET /aulas/{id}</kbd>     | caminho para buscar aula por id [response details](#get1-auth-detail)
| <kbd>GET /tipo/{tipoAula}</kbd>     | caminho para visualizar somente um tipo de aula  [response details](#get2-auth-detail)
| <kbd>POST /criar-nova</kbd>     | caminho para criar uma nova aula [request details](#post-auth-detail)
| <kbd>PUT /editar{id}</kbd>     | caminho para editar uma aula existente pelo id [request details](#put-auth-detail)
| <kbd>DELETE/deletar{id}</kbd>     | caminho para deletar uma aula pelo id [request details](#post-auth-detail)

<h3 id="get-auth-detail">GET /aulas</h3>

**RESPONSE**
```json
{ "id": 1,
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "PREPARADA"
  }
  {

  "id": 2,
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "LECIONADA"
}
```

<h3 id="get1-auth-detail">GET /aulas/{id}</h3>

**RESPONSE**
```json
{
   "id": "{id}",
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "PREPARADA"
}
```
<h3 id="get2-auth-detail">GET /tipo/{tipoAula}</h3>

**RESPONSE**
```json
{
   "id": "{id}",
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "PREPARADA"
}
{

  "id": "{id}",
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "PREPARADA"
}
```

<h3 id="post-auth-detail">POST /criar-nova</h3>

**REQUEST**
```json
{
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "PREPARADA"
}
```
**RESPONSE**
```json
{
  "id": "{id}",
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "PREPARADA"
}
```

<h3 id="put-auth-detail">PUT /editar/{id}</h3>

**REQUEST**
```json
{
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "LECIONADA"
}
```
**RESPONSE**
```json
{
  "id": "{id}",
  "materia": "urlimagem.jpg",
  "conteudo": "conteudo da aula",
  "tipoAula": "LECIONADA"
}
```





