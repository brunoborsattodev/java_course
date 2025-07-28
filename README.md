# CustomerConnect

![GitHub repo size](https://img.shields.io/github/repo-size/brunoborsattodev/customerconnect?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/brunoborsattodev/customerconnect?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/brunoborsattodev/customerconnect?style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues/brunoborsattodev/customerconnect?style=for-the-badge)
![GitHub pull requests](https://img.shields.io/github/issues-pr/brunoborsattodev/customerconnect?style=for-the-badge)

<img src="banner.png" alt="Banner do CustomerConnect" />

> Sistema completo de cadastro e gerenciamento de clientes com API REST, banco de dados MySQL e deploy containerizado. Ideal para empresas que desejam uma aplicação organizada, segura e escalável.

---


### ⚙️ Ajustes e melhorias  
O projeto está em constante evolução. As próximas funcionalidades previstas são:

- [x] Cadastro de clientes  
- [x] Listagem com paginação  
- [x] Atualização e remoção de dados  
- [x] Integração com banco de dados MySQL via Docker  
- [x] Testes de API com cliente HTTP Bruno  
- [ ] Validações com Bean Validation  
- [ ] Documentação da API com Swagger  

---

### 💻 Pré-requisitos  
Antes de começar, verifique se você atendeu aos seguintes requisitos:

✅ Java JDK 17 ou superior instalado  
✅ Docker Desktop instalado (com suporte ao docker compose)  
✅ Git instalado  
✅ IDE recomendada: IntelliJ IDEA ou VS Code  
✅ Bruno HTTP Client (ou outro cliente HTTP) para testar a API  
✅ Beekeeper Studio para visualizar e consultar o banco de dados MySQL  

⚠️ **Observação:** O Docker Compose já está incluído no Docker Desktop para Windows, macOS e Linux. Você não precisa instalar manualmente.

---

### 🚀 Instalando o CustomerConnect

Clone o projeto:

```bash
git clone https://github.com/brunoborsattodev/customerconnect.git
cd customerconnect
````

Inicie os containers com Docker Compose:

```bash
docker compose up -d
```

O banco de dados MySQL será iniciado automaticamente com as configurações definidas no `docker-compose.yml`.

---

### 🧪 Executando o projeto

1. Abra o projeto na sua IDE (IntelliJ ou VS Code).
2. Aguarde o carregamento das dependências (via Maven).
3. Rode a aplicação a partir da classe `CustomerConnectApplication`.
4. Use um cliente HTTP (como o **Bruno** ou **Postman**) para acessar os endpoints.

Exemplo de endpoint:

```
GET http://localhost:8080/customers
```

---

### 📚 Documentação da API

Em breve, será incluída documentação automática com **Swagger** acessível via:

```
http://localhost:8080/swagger-ui.html
```

---

### 🗃️ Banco de Dados

O banco de dados MySQL será iniciado automaticamente via Docker com as seguintes credenciais:

* **Host:** `localhost`
* **Porta:** `3306`
* **Usuário:** `myuser`
* **Senha:** `secret`
* **Database:** `customerconnectdb`

Você pode visualizar e consultar os dados usando o **Beekeeper Studio**, **DBeaver** ou outro cliente SQL.

---

### 🙌 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para:

* Abrir issues com sugestões ou bugs
* Criar branches e Pull Requests com melhorias

---

Se quiser uma versão com mais seções (como "Tecnologias usadas" ou "Screenshots"), posso complementar!

