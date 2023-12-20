# Verificador da segurança de uma senha

<!-- SOBRE O PROJETO -->
## SOBRE O PROJETO

Verificador da segurança de uma senha utilizando Java e Spring Boot para aprendizado. 

Você envia via json alguma senha e retorna o que falta para dar mais segurança para a senha ou se ela já é segura retorna.

```
  Exemplo:
  password: Neo@12
  
  Retorno:
  "A senha tem menos que 8 carecteres"
```


Tecnologias utilizadas:
* Java
* Lombok
* Spring Boot

<!-- GETTING STARTED -->
## Instalação

### Pré requisitos

* Insomnia/Postman/Google Chrome ( Para testar os endpoints ) 

* Alguma IDE que rode Java como Eclipse, Netbeans, Intellij... 



### Instalação

1. Pegue o link do repositório https://github.com/GustavoTBett/secure-password.git
2. Clone o repo
   ```sh
   git clone https://github.com/GustavoTBett/secure-password.git
   ```
3. Abra o projeto em sua IDE de prefêrencia

4. Na IDE execute o arquivo SecurePasswordApplication

5. No insomnia teste os endpoins no localhost:8080

```
    Exemplo de JSON :
    {
    "password": "Neo@202222"
    }
 ```
