public class Principal {
    public static void main(String[] args) {
        ServidorEmail servidor;
        ClienteEmail cliente1;
        ClienteEmail cliente2;
    
        servidor = new ServidorEmail();
    
        cliente1 = new ClienteEmail( servidor, "cliente1" );
        cliente2 = new ClienteEmail( servidor, "cliente2" );
        
        System.out.println(
            servidor.quantosEmails("cliente2"));

        cliente1.enviarEmail("cliente2", "mensagem de cliente1 para cliente2");

        System.out.println(
            servidor.quantosEmails("cliente2"));


        cliente2.imprimirSeguinteEmail();

        System.out.println(
            servidor.quantosEmails("cliente2"));

            
    }
}
