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
coloque o trecho do código que vc fez e seu nome para identificar

------------------------------- TIAGO ALVES ----------------
// COLETA DE DADOS DO PASSAGEIRO 
}
       Sytem.out.println ("Login bem-sucedido!")
       usuario passageiro = new Usuario(); 
       
       System.out.println("Digite o nome do do passageiro:");
       passageiro.setNome(scanner.nextLine());

       System.out.println("Digite RG do passageiro:);
       passageiro.setRg(scanner.nextLine());

       System.out.println("Digite o CPF do pasageiro:");
       passageiro.setCpf(scanner.nextLine());

       System.out.println("Digite o numero do passaporte do passageiro:");
       passageiro.setPassaporte(scanner.nextLine());

       System.out.println("Digite o telefone de contato (DDD + Numero):");
       passageiro.setTelefone(scanner.nextLine());

       System.out.println ("Digite o telefone de contato de emergencia (DDD + Numero):);
       passageiro.setTelefoneEmergencia(scanner.nextLine());

      Sytem.out.println("Escolha o destino (EUA, PORTUGAL, AUTRALIA, ITALIA, RUSSIA, CHINA):);
      passageiro.setDestino(scanner.nextLine());

      System.out.println("Digite a data de ida (formato AAAA-MM-DD):");
      passageiro.setDataIda(scanner.nextLine());

      System.out.println("Digite a data de volta (formato AAAA-MM-DD):");
      passageiro.setDataVolta(scanner.nextLine());
        
      // Mostrar dados coletados 
      System.out.println(" Dados do Passageiro: ");
      System.out.println(passageiro);
      }
------------------------------------------------------------------------------------
Continuem


