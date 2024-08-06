import java.util.Scanner;

/**
 * @author Anthony.Amaz3d
 */

public class Interface {
    public static String definirNome(){
        System.out.println("Digite o nome da pessoa: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        return nome;
    }

    public static String definirSexo(){
        System.out.println("Digite o sexo: ");
        Scanner sc = new Scanner(System.in);
        String sexo = sc.nextLine();
        return sexo;
    }

    public static int definirQuantasPessoas() {
        System.out.println("Quantas pessoas serão colocadas? ");
        Scanner sc = new Scanner(System.in);
        int quantasPessoas = sc.nextInt();
        return quantasPessoas;
    }
}