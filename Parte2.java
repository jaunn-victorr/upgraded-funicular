public class Parte2 {
     public static void main(String[] args) {
         
        int inicial=125, 
        razao=5, 
        an=inicial, 
        n=10;
     
    System.out.printf("Elementos da PA, de valor inicial 125 e razão 5", inicial, razao, n ); 
    while(an<=(n-1)*2){ 
        System.out.println(an); 
        an += razao; 
    } 
} 

}
  