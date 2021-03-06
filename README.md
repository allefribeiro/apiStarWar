
<h1>Desafio Star Wars</h1>

A aplicacao é uma API REST para cadastrar, consultar, atualizar e deletar Planetas.</h4><br>

<h2>Consultas</h2>

| Metodo        | Url                    | Descricao                |
| ------------- |:-------------:         | -----:                   |
| DELETE        | /api/planeta           | Deletar Planeta          |
| POST          | /api/planeta           | Inserir Planeta          |
| PUT           | /api/planeta           | Atualizar Planeta        |
| GET           | /api/planeta/{id}      | Buscar Planeta  por ID   |
| GET           | /api/planeta/{name}    | Buscar Planeta  por Nome |
| GET           | /api/planetas/         | Buscar todos Planetas    |

| Headers       |                        |                          |
| ------------- |     :-------------:    |           -----:         |
|               | Key                    | Value                    |
|               | Content-Type           | application/json         |

<h3>Observação:</h3>

<p>Não passar id no método POST, pois o id é auto-incremente</p>

<h3>Exemplo:</h3>

<p><img src="apipost.png" width="350" alt="accessibility text"></p>
  
<h2>Utilizado:</h2>

- Java 8<br>
- Spring Boot<br> 
- PostgreSQL 9.6<br>
