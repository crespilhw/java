public class Ex2_ {
    public static void main(String[] args) {
        
        System.out.println("Os números pares de 1 a 50 são: ");
        for (int par = 1; par <= 50; par++) {
        if (par % 2 == 0) {
        System.out.println(par);
            }
        }
        
        System.out.println("Os números ímpares de 51 a 100 são: ");   
        for (int impar = 51; impar <= 100; impar++) {
        if (impar % 2 != 0) {
        System.out.println(impar);
            }
        }
    }
}