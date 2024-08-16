import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        double taxa;
        try {
            System.out.println("Digite o valor a ser cobrado: ");
            valor = entrada.nextDouble();
            System.out.println("Digite a taxa a ser cobrada: ");
            taxa = entrada.nextDouble();
            if(valor<0 || taxa < 0){
                throw new NegativeNumbersException();
            }
            System.out.println(valor*taxa);
        }catch(InputMismatchException ex){
            System.out.println("O Infeliz, digita o valor corretamente!");
        }catch(ArithmeticException ex){
            System.out.println("Tentou por zero né");
        }catch(NegativeNumbersException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println("Deu pau, porque: "+ex.getMessage());
        }
        finally{
            System.out.println("Teste");
        }

    }
}