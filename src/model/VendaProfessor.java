package model;

public class VendaProfessor extends Venda {

    @Override
    protected void aplicarDesconto() {
        total = total * 0.5;
    }

    @Override
    protected void escolherToppings() {
        System.out.println("Venda Professor - toppings premium");
    }
    
}
