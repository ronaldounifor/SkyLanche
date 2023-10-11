package observer;

import java.util.ArrayList;
import java.util.List;

import model.Item;

public class ItemEstoque {
    private Item item;
    private int quantidade;
    private List<Funcionario> funcionarios;

    public ItemEstoque(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
        funcionarios = new ArrayList<>();
    }

    public void notificar() {
        if(quantidade <= 1)
            for (Funcionario funcionario : funcionarios)
                funcionario.atualizar(this);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarItem() {
        quantidade++;
    }

    public void removerItem() {
        quantidade--;
        notificar();
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificar();
    }
}
