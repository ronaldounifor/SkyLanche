package data;

import java.util.ArrayList;
import java.util.List;

import model.Bebida;
import model.Comida;
import observer.ItemEstoque;

public class ConectorBD {
    private static ConectorBD instancia;
    private static ArrayList<ItemEstoque> itens;
    
    private ConectorBD() {
        //conexao com banco de dados
    }

    static {
        itens = new ArrayList<>();

        itens.add(new ItemEstoque(new Bebida(1, 10.99, "Corote", 220), 10));
        itens.add(new ItemEstoque(new Bebida(2, 2, "Água Indaia", 300), 20));
        itens.add(new ItemEstoque(new Comida(12, 9.75, "Elma chips P", 75), 15));
        itens.add(new ItemEstoque(new Comida(13, 15.5, "Elma chips G", 250), 2));
    }

    public static synchronized ConectorBD getInstancia() {
        if(instancia == null)
            instancia = new ConectorBD();

        return instancia;
    }

    public void registrarVenda() {
        // salva no BD uma venda
    }

    public List<ItemEstoque> pegarTodosItens() {
        return itens;
    }

    public ItemEstoque pegarPorID(int id) {
        for (ItemEstoque item : itens)
            if(item.getItem().getId() == id)
                return item;

        return null;
    }
}
