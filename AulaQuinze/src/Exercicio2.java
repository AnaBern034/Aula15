import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        letra();

    } public static String letra () {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letras = ler.next();

        if (letras.equals("a") || letras.equals("e") || letras.equals("i") || letras.equals("o") || letras.equals("u")) {
            System.out.println("É vogal");
        } else {
            System.out.println("É consoante");
        }
        return null;
    }
}

