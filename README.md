### GitHub
Projeto disponível em: https://github.com/heberas/challenger

### Instruções
- Fazer um git clone https://github.com/heberas/challenger em seu repositório local
- Importar o projeto na IDE.

### Regra da aplicação

Validador de senhas com os requisitos:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
- Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto
- Espaços em branco não devem ser considerados como caracteres válidos.

### Detalhes do desenvolvimento da aplicação

1. cuRL:
curl --location --request POST 'http://localhost:8080/validate/password' \
--header 'Content-Type: application/json' \
--data-raw '{
"password": "9bp Lmf@01"
}'


2. Handler para validação de url, caso o endereço não seja o correto retornará a mensagem padrão:

- Rota inválida! Por gentileza, adicionar caminho completo do serviço desejado.

3. Dependência para facilitar o desenvolvimento (a cada alteração salva o projeto é executado)

spring-boot-devtools

4. Implementado na Camada de Controller o recurso:

- Obtenção de log -> logger.info("m=validatePassword", password, request);

5. Implementado Teste
