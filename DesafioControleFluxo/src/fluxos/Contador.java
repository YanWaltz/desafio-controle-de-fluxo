package fluxos;
import java.util.Scanner;

public class Contador{
  
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();
        
        try{
			contar(parametro1, parametro2);
		}catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
		}finally{
            terminal.close();
        }

    }

        public static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException{
            if(parametro2<parametro1){
                throw new ParametrosInvalidosException("O primeiro parâmetro tem que ser menor que o segundo parâmetro\n");
            }
            
            int contagem = parametro2 - parametro1; //Calculo da diferença de parâmetros
            
            for (int i=1;i<=contagem;i++)
                System.out.println("Imprimindo o número: " + i);
        }

}
