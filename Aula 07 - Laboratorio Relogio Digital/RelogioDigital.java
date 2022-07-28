public class RelogioDigital {
    private DoisDigitos horas;
    private DoisDigitos minutos;
    private String telaString;

    public RelogioDigital(){
        horas = new DoisDigitos(24);
        minutos = new DoisDigitos(60);
        atualizarTela();
    }
    public RelogioDigital(int hora_especifica, int minuto_especifico){
        horas = new DoisDigitos(24);
        minutos = new DoisDigitos(60);
        setTempo(hora_especifica, minuto_especifico);
    }

    public void setTempo(int phora, int pminuto){
        horas.setValor(phora);
        minutos.setValor(pminuto);
        atualizarTela();
    }

    public void tempoTic(){
        minutos.incremento();
        if (minutos.getValor() == 0 ) {
            horas.incremento();
        }
        atualizarTela();
    }

    public String getTempo(){
        return telaString;
    }

    public void atualizarTela(){
        telaString = horas.getValorParaMostrar() + ":" +
                    minutos.getValorParaMostrar();
    }
}



