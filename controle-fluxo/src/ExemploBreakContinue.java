public class ExemploBreakContinue  {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i == 3)
                break; //para a verificacao.
                //continue; pula a verificacao ao chegar no contador 3.
            System.out.println(i);
        }
    }
}
