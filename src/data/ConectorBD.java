package data;

public class ConectorBD {
    private static ConectorBD instancia;
    
    private ConectorBD() {
        //conexao com banco de dados
    }

    public static synchronized ConectorBD getInstancia() {
        if(instancia == null)
            instancia = new ConectorBD();

        return instancia;
    }

    public void registrarVenda() {
        // salva no BD uma venda
    }
}
