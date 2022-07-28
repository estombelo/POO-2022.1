public class DoisDigitos{
    private int limite;
    private int valor_atual;
    
    public DoisDigitos(int plimite){
        limite = plimite;
        valor_atual = 0;
    }

    public int getValor(){
        return valor_atual;
    }

    public void setValor(int pvalor){
        if ( (pvalor >= 0) && (pvalor < limite)) {
            valor_atual = pvalor;
        }
    }

    public void incremento(){
        valor_atual = (valor_atual + 1) % limite;
    }

    public String getValorParaMostrar(){
        if (valor_atual < 10) {
            return "0" + valor_atual;
        }else{
            return "" + valor_atual;
        }
    }
}


