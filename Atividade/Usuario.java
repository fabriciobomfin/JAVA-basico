package Atividade;
import java.util.Scanner;

class Usuario {
    private String nome;
    private int idade;
    private String email;

    // Construtor
    public Usuario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Método para exibir os dados do usuário
    public void exibirInfo() {
        System.out.println("\n--- Dados do Usuário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        // Criando um objeto Usuario
        Usuario usuario = new Usuario(nome, idade, email);

        // Exibindo as informações do usuário
        usuario.exibirInfo();

        scanner.close();
    }
}

