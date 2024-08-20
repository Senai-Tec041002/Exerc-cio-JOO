# Exerc-cio-JOO
Nesse repositório esta lançado o desafio de criar um código em JAVA com as seguintes especificações encontradas no README
CRIAR UM CODIGO EM JAVA PARA REALIZAR O LOGIN E SENHA DE UM USUARIO DE UMA AGENCIA AEREA, APOS O LOGIN E SENHA O USUARIO DEVE INFORMAR, O CODIGO DEVE CONTER O NOME DO PASSAGEIRO, DOCUMENTO DE IDENTIFICACAO RG, CPF, NUMERO DO PASSAPORTE, TELEFONE DE CONTATO CONTENDO DDD MAIS O NUMERO, TELEFONE DE CONTATO DE EMERGENCIA NO MESMO FORMATO, DESTINO DEVE TER A OPCAO, EUA, PORTUGAL, AUSTRALIA, ITALIA, RUSSIA, CHINA, DATA DE IDA E VOLTA.

```java
import java.util.Scanner;

public class AgenciaAerea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Realizar login
        System.out.println("Login da Agência Aérea");
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Verificar login e senha
        if (autenticarUsuario(usuario, senha)) {
            System.out.println("Login bem-sucedido!");
```
continuem
