import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você deseja convidar?: ");
        int quantidade = sc.nextInt();
        sc.nextLine();// limpar buffer
        
        String pessoas[] = new String[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.println(String.format("Informe o nome do %s° convidado: ", i+1));
            pessoas[i] = sc.nextLine();
        }
        
        System.out.println("Os convidados são: ");

        for(String pessoa : pessoas){
            System.out.println(String.format("- %s", pessoa));
        }


        sc.close();
    }
    
}
