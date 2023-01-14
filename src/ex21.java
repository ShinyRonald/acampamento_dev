import java.util.Scanner;

public class ex21 {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();

        System.out.println("Informe a palavra a ser substituida");
        String palavraReservada = sc.nextLine();

        System.out.println("Informe por qual vai ser substituida");
        String palavraSubstituida = sc.nextLine();

        frase = frase.replace(palavraReservada,palavraSubstituida);

        System.out.println(frase);


        sc.close();
    }
    
}
