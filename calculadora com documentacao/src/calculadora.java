import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class calculadora {
    
    Scanner input = new Scanner(System.in);

        int valor1;
        int valor2;
        String operacao;

    public void calculadora(){
    }


    public void menuInsert(){
        System.out.print("Insira o primeiro valor: ");
        this.valor1 = input.nextInt();
        clearBuffer(input);
        System.out.print("Qual operação deseja ? ");
        this.operacao = input.nextLine();
        System.out.print("Insira o segundo valor: ");
        this.valor2 = input.nextInt();
        System.out.println(valor1 + " " + operacao + " " + valor2);
    }

    public void escolhaOperacao(){
        operacoes o = new operacoes();
        switch(this.operacao){
            case "+":
                System.out.println(o.adicao(this.valor1, this.valor2));
                break;
            case "-":
                System.out.println(o.divisao(this.valor1, this.valor2));
                break;
            case "*":
                System.out.println(o.multiplicacao(this.valor1, this.valor2));
                break;
            case "/":
                if(valor2 == 0){
                    System.out.print("operação invalida");
                    break;
                }
                System.out.println(o.divisao(this.valor1, this.valor2));
                break;
            default:
                System.out.println("Operador invalido");
                return;   
        }
    }

    public void fraseResposta(){
        System.out.println("\nA resposta da operação é:");
        escolhaOperacao();
    }

    public boolean terminarCal(){
        System.out.println("\ndeseja terminar o calculo?");
        input.nextLine();
        String teste = input.nextLine();
        if(teste.equalsIgnoreCase("e"))return false;
        return true;
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
