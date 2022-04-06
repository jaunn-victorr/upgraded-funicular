public class Prova {
    public static void main(String[] args) {
        int numero = 5;
        int inicio = 10;
        int tamanho = 6;
        
        for(int indice = inicio;indice < (indice + tamanho);indice++) {
            System.out.println(numero + " * " + indice + " = " + (numero * indice));
        }
    }
}