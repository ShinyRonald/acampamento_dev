import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        cachorro pocazoi = new cachorro();

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("=*=*=*=Digite na tela a opção*=*=*=*");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        int opcao = 0;


    do{
        System.out.println("1 - mudar nome\n2 - mudar sexo\n3 - Parar programa");
        opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1 -> {
                System.out.println("Digite o nome: ");
                pocazoi.trocarNome(sc.nextLine());
                opcao = 0;
            }
            case 2 -> {
                System.out.println("Digite 1 male, 2 female: ");
                pocazoi.trocarSexo(sc.nextInt());
                opcao = 0;
            }

            case 4 -> {
                System.out.println(pocazoi);
                opcao = 0;
            }
        }
    }while(opcao != 3);

        System.out.println(pocazoi);

        sc.close();

    }  
}