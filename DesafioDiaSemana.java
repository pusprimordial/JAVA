import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        String dia = entrada.next();
        
        if(dia.equalsIgnoreCase("domingo")){
            System.out.print(1+"\n");
        } 
        else if(dia.equalsIgnoreCase("segunda")){
            System.out.print(2+"\n");
        } 
        else if(dia.equalsIgnoreCase("terça")
        || dia.equalsIgnoreCase("terca")){
            System.out.print(3+"\n");
        } 
        else if(dia.equals("quarta")){
            System.out.print(4+"\n");
        } 
        else if(dia.equalsIgnoreCase("quinta")){
            System.out.print(5+"\n");
        } 
        else if(dia.equalsIgnoreCase("sexta")){
            System.out.print(6+"\n");
        } 
        else if(dia.equalsIgnoreCase("sabado")){
            System.out.print(7+"\n");
        } 
        else {
            System.out.println("Digite novamente");
            
        }

        entrada.close();


    }
}
