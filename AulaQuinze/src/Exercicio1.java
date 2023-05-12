import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.print("Digite um valor: ");
        Scanner ler = new Scanner(System.in);
       int valor = ler.nextInt();
        System.out.println(verificação(valor));

    } public static boolean verificação (int digito){

        final int divisão = 10;
        if(digito == 0)
        {
            return true;
        }
        while (digito != 0)
        {
            if ((digito % divisão) % 2!= 0){
                return false;
            }
            digito /= 10;
        }
        return true;
    }

}
