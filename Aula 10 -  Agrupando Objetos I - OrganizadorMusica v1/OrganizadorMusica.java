import java.util.ArrayList;

public class OrganizadorMusica {

    private ArrayList<String> arquivos;

    public OrganizadorMusica() {
        arquivos = new ArrayList<>();
    }

    public void adicionarArquivo( String nome_arquivo ) {
        arquivos.add( nome_arquivo );
    }

    public int getNumeroDeArquivos() {
        return arquivos.size();
    }

    public void mostrarArquivo( int indice ) {
        if ( indice >= 0 && indice < arquivos.size()) {
            String nome_arquivo = arquivos.get( indice );
            System.out.println( nome_arquivo );
        }
    }

    public void removerArquivo( int indice ) {
        if ( indice >= 0 && indice < arquivos.size()) {
            arquivos.remove( indice );
        }
    }
}