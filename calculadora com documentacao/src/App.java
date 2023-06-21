public class App {
    public static void main(String[] args) throws Exception {
        
        calculadora calc = new calculadora();

        do{
            calc.menuInsert();
            calc.fraseResposta();
        }while(calc.terminarCal());



    }
}
