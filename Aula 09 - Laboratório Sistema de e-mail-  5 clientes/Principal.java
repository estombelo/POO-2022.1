public class Principal {
    public static void main(String[] args) {
        ServidorEmail servidor;
        ClienteEmail cliente1;
        ClienteEmail cliente2;
        ClienteEmail cliente3;
        ClienteEmail cliente4;
        ClienteEmail cliente5;
    
        servidor = new ServidorEmail();
    
        cliente1 = new ClienteEmail( servidor, "cliente1" );
        cliente2 = new ClienteEmail( servidor, "cliente2" );
        cliente3 = new ClienteEmail( servidor, "cliente3" );
        cliente4 = new ClienteEmail( servidor, "cliente4" );
        cliente5 = new ClienteEmail( servidor, "cliente5" );
        

        cliente1.enviarEmail("cliente2", "mensagem de cliente1 para cliente2");
        cliente1.enviarEmail("cliente3", "mensagem de cliente1 para cliente3");
        cliente1.enviarEmail("cliente4", "mensagem de cliente1 para cliente4");
        cliente1.enviarEmail("cliente5", "mensagem de cliente1 para cliente5");
        cliente1.enviarEmail("cliente2", "mensagem de cliente1 para cliente2");

        cliente2.enviarEmail("cliente3", "mensagem de cliente2 para cliente3");
        cliente2.enviarEmail("cliente4", "mensagem de cliente2 para cliente4");
        cliente2.enviarEmail("cliente5", "mensagem de cliente2 para cliente5");
        cliente2.enviarEmail("cliente1", "mensagem de cliente2 para cliente1");

        cliente3.enviarEmail("cliente4", "mensagem de cliente3 para cliente4");
        cliente3.enviarEmail("cliente5", "mensagem de cliente3 para cliente5");
        cliente3.enviarEmail("cliente1", "mensagem de cliente3 para cliente1");
        cliente3.enviarEmail("cliente2", "mensagem de cliente3 para cliente2");
        cliente3.enviarEmail("cliente4", "mensagem de cliente3 para cliente4");
        cliente3.enviarEmail("cliente5", "mensagem de cliente3 para cliente5");
        cliente3.enviarEmail("cliente1", "mensagem de cliente3 para cliente1");
        cliente3.enviarEmail("cliente2", "mensagem de cliente3 para cliente2");

        cliente4.enviarEmail("cliente5", "mensagem de cliente4 para cliente5");
        cliente4.enviarEmail("cliente1", "mensagem de cliente4 para cliente1");

        cliente5.enviarEmail("cliente1", "mensagem de cliente5 para cliente1");

        int qtos;

        qtos = servidor.quantosEmails("cliente1");
        for (int i = 0; i < qtos; i++) cliente1.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente2");
        for (int i = 0; i < qtos; i++) cliente2.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente3");
        for (int i = 0; i < qtos; i++) cliente3.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente4");
        for (int i = 0; i < qtos; i++) cliente4.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente5");
        for (int i = 0; i < qtos; i++) cliente5.imprimirSeguinteEmail();

            
    }
}
