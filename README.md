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

1. cuRL:
curl --location --request POST 'http://localhost:8083/validate/password' \
--header 'Content-Type: application/json' \
--data-raw '{
"password": "9bp Lmf@01"
}'
