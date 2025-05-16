CP de java feito por:
Eduardo barriviera - RM 555309
Thiago Lima Feitas - RM 556795

Criamos uma aplicação java com spring-boot, além disso usamos jpa e banco H2 para armazenar os dados 

Rotas:

- UsuariorControler:
- | Método   | URL                  | Ação                     |
| -------- | -------------------- | ------------------------ |
| `POST`   | `/api/usuarios`      | Criar usuário            |
| `GET`    | `/api/usuarios/{id}` | Buscar por ID            |
| `GET`    | `/api/usuarios`      | Listar todos os usuários |
| `PUT`    | `/api/usuarios/{id}` | Atualizar usuário        |
| `DELETE` | `/api/usuarios/{id}` | Deletar usuário          |


- MotoControler:
- | Método   | Endpoint          | Ação                  |
| -------- | ----------------- | --------------------- |
| `POST`   | `/api/motos`      | Criar nova moto       |
| `GET`    | `/api/motos`      | Listar todas as motos |
| `GET`    | `/api/motos/{id}` | Buscar moto por ID    |
| `PUT`    | `/api/motos/{id}` | Atualizar moto        |
| `DELETE` | `/api/motos/{id}` | Deletar moto          |
