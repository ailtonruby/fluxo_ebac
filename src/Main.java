import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite nota 1: ");
        float nota1= s.nextFloat();
        System.out.println("digite nota 2: ");
        float nota2= s.nextFloat();
        System.out.println("digite nota 3: ");
        float nota3= s.nextFloat();
        System.out.println("digite nota 4: ");
        float nota4= s.nextFloat();
        float resul = (nota1 + nota2 + nota3 + nota4)/4;

        if (resul >= 7){
            System.out.println("aprovado");
        } else if ((resul >= 5) && (resul < 7)){
            System.out.println("recuperação");
        }else {
            System.out.println("reprovado");
        }
    }
}