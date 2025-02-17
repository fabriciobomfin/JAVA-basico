
public class ComparaçãoTipos {
    public static void main(String[] args) {
        // Declaração de variáveis
        String nomeUsuario = "Marta";
        int senha = 123;
        
        // Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 123);  // Corrigido o nome da variável
        
        // Exibindo resultados
        System.out.println("O nome do usuário está correto ? " + resultadoNome);
        System.out.println("A Senha está correta ? " + resultadoSenha);  // Corrigido o nome da variável
    }

}