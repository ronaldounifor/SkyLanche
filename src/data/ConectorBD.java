package data;

import java.util.ArrayList;
import java.util.List;

import model.Bebida;
import model.Comida;
import model.Item;

public class ConectorBD {
    private static ConectorBD instancia;
    private static ArrayList<Item> itens;
    
    private ConectorBD() {
        //conexao com banco de dados
    }

    static {
        itens = new ArrayList<>();

        itens.add(new Bebida(1, 10.99, "Corote", 220));
        itens.add(new Bebida(2, 2, "Água Indaia", 300));
        itens.add(new Comida(12, 9.75, "Elma chips P", 75));
        itens.add(new Comida(13, 15.5, "Elma chips G", 250));
    }

    public static synchronized ConectorBD getInstancia() {
        if(instancia == null)
            instancia = new ConectorBD();

        return instancia;
    }

    public void registrarVenda() {
        // salva no BD uma venda
    }

    public List<Item> pegarTodosItens() {
        return itens;
    }

    public Item pegarPorID(int id) {
        for (Item item : itens)
            if(item.getId() == id)
                return item;

        return null;
    }
}
