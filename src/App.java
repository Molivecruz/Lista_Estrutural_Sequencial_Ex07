import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Requisito 01: Pedir o lado do quadrado
        System.out.print("Entre com a medida do lado do quadrado: ");
        int lado = sc.nextInt();

        sc.close();

        //Requisito 02: Calcular a área do quadrado
        int area = lado * lado;

        //Requisito 03: Calcular e mostrar o dobro da área do quadrado
        int dobro = area * 2;
        System.out.print("O dobro da área do quadrado de lado " + lado + " é igual a " + dobro);
        

    }
}
