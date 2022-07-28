public class Principal {
    public static void main(String[] args) {
        RelogioDigital relogio1 = new RelogioDigital();
        //-----------------------
        String telaString = relogio1.getTempo();
        
        System.out.println( telaString );

        relogio1.tempoTic();

        //-----------------------
        telaString = relogio1.getTempo();

        System.out.println( telaString );

        relogio1.tempoTic();

        //-----------------------
        telaString = relogio1.getTempo();

        System.out.println( telaString );

    }
}
