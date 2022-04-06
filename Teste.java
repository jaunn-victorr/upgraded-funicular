import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int razao, primeiroTermo, numeroDeTermos, resultado;
        resultado = 0;
        System.out.println("Digite a razão da PG:");
        razao = scan.nextInt();
        System.out.println("Digite o primeiro termo da PG:");
        primeiroTermo = scan.nextInt();
        System.out.println("Digite o número de termos da PG:");
        numeroDeTermos = scan.nextInt();
        for(int i = 1; i <= numeroDeTermos; i++){
            resultado += primeiroTermo*(Math.pow(razao,i));
        }
        System.out.println("O resultado foi: " + resultado);
    }
}
    


