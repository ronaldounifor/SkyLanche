package model;
public class VendaAluno extends Venda {

    @Override
    protected void aplicarDesconto() {
        total = total * 0.9;
    }

    @Override
    protected void escolherToppings() {
        System.out.println("Venda Aluno - toppings populares");
    }
    
}
