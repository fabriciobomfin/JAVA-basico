
import java.util.Scanner;

public class aluno_duas_notas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        String nome = read.nextLine();

        System.out.println("Informe a nota da primeira prova:");
        double primeiraNota = read.nextDouble();
        
        System.out.println("Informe a nota da segunda prova:");
        double segundaNota = read.nextDouble();
        
        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("\n== DADOS DO ALUNO ==\n");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Média: " + media);
        
        if (media >= 7) {
            System.out.println("\nO aluno" + nome + "foi aprovado !");
        } 
        else if(media >= 5){
            System.out.println("\nAluno em Recuperação");
        }else{
            System.out.println("\nAluno Reprovado!");
        }
        
        // estudar get e set
    }
}
