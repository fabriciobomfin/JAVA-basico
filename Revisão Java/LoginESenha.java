import java.util.Scanner;

public class LoginESenha {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner ler = new Scanner(System.in);

        // Define o nome de usuário e senha corretos
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        // Solicita o nome de usuário
        System.out.println("Informe o nome de usuário: ");
        String nomeUsuario = ler.nextLine();

        // Solicita a senha
        System.out.println("Informe a senha: ");
        String senha = ler.nextLine();

        // Verifica se o nome de usuário e a senha estão corretos
        if (nomeUsuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem-vindo, usuário logado!");
        } else {
            System.out.println("Nome de usuário ou senha inválidos.");
        }

        // Fecha o Scanner para liberar recursos
        ler.close();
    }
}