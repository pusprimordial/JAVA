package estruturasDeControle;
public class For1 {
    public static void main(String[] args) {
        /*int contador = 0;
        while(contador <= 10){
            System.out.printf("i = %d\n", contador);
            contador += 2;
        }*/

        for(int contador = 0; contador <= 10; contador += 2){
            System.out.printf("i = %d\n", contador);
        }
    }
}