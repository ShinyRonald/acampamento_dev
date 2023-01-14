import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        String sobrenome = sc.nextLine();
        String cpf = sc.nextLine();

        System.out.println("Seu nome: " + nome + 
        "\nSeu Sobrenome: " + sobrenome + 
        "\nSeu CPF: " + cpf.substring(0,3).concat(".XXX.XXX-XX"));
        sc.close();
    }
    
}
