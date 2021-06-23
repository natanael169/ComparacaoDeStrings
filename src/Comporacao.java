import java.util.Scanner;

public class Comporacao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);//Scanner para leitura de informação

        String verificacao = "natanael";
        String usuario;
        int senha1 = 4400;
        int senha2;
        System.out.print("Digite seu nome de usuario: ");
        usuario = teclado.nextLine();
        System.out.println("Digite Sua senha: ");
        senha2= teclado.nextInt();

        if (senha1 == senha2 & verificacao.equals(usuario)){// Para comparar String é usado  String1.equals(String2)
            System.out.println("Acesso autorizado");
        }
        else {
            System.out.println("acesso negado");
        }
    }
}
