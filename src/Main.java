import java.util.Scanner;

//importante é o que importa
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tosa = 90;
        int banho = 50;
        int vacina = 40;
        int tb = tosa + banho;
        int tv = tosa + vacina;
        int bv = banho + vacina;
        int tbv = tosa + banho + vacina;

        System.out.println("|Petshop Omaga|");
        System.out.println("|O que deseja?|");

        int escolha = 0;


        while (escolha != 2147483647 ) { //limite do integer literalmente kkkkk
            System.out.println("1-Banho\n2-Tosa\n3-Vacina\n4-Tosa + banho\n5-Tosa + vacina\n6-Banho + vacina\n7-Todos");
            escolha = ler.nextInt();
            switch (escolha) {

                case 1:
                    System.out.println("Valor a pagar: "+tosa);
                    System.exit(0);
                    break;

                case 2:
                    System.out.println("Valor a pagar:"+banho);
                    System.exit(0);
                    break;

                case 3:
                    System.out.println("Valor a pagar:"+vacina);
                    System.exit(0);
                    break;

                case 4:
                    System.out.println("Valor a pagar: "+tb);
                    System.exit(0);
                    break;

                case 5:
                    System.out.println("Valor a pagar:"+tv);
                    System.exit(0);
                    break;

                case 6:
                    System.out.println("Valor a pagar:"+bv);
                    System.exit(0);
                    break;

                case 7:
                    System.out.println("Valor a pagar:"+tbv);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha uma opção válida!!!");
                    System.out.println("---------------------------");
            }
        }
    }
}