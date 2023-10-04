package controller;

import java.util.List;
import java.util.Scanner;

import data.ConectorBD;
import model.Item;
import model.Venda;
import model.VendaAluno;

public class FachadaVenda {
    private ConectorBD conector;
    private Item itemAtual;
    private Venda vendaAtual;

    public FachadaVenda() {
        conector = ConectorBD.getInstancia();
    }

    public void imprimirItens() {
        List<Item> itens = conector.pegarTodosItens();

        for (Item item : itens)
            System.out.println(item);
    }

    public void selecionarItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aguardando seleção");
        int escolha = scanner.nextInt();

        scanner.close();

        itemAtual = conector.pegarPorID(escolha);
    }
    
    public void pagar() {
        vendaAtual = new VendaAluno();
        vendaAtual.setTotal(itemAtual.getPreco());
        vendaAtual.efetuar();
    }
    
    public void dispensar() {
        System.out.println("Receba!");
    }
}
