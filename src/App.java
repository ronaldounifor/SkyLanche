import model.Bebida;
import prototype.Personagem;
import prototype.Pet;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem maui = new Personagem(5, "Mauí", 1.8, 200000);
        System.out.println("criei maui");
        // Personagem maui2 = new Personagem(5, "Mauí", 1.8, 200000);
        // System.out.println("criei maui 2");
        // Personagem maui3 = new Personagem(5, "Mauí", 1.8, 200000);
        // System.out.println("criei maui 3");
        // Personagem maui4 = new Personagem(5, "Mauí", 1.8, 200000);
        // System.out.println("criei maui 4");
        // Personagem maui5 = new Personagem(5, "Mauí", 1.8, 200000);
        // System.out.println("criei maui 5");

        Personagem maui2 = maui.clone();
        System.out.println("criei maui 2");
        Personagem maui3 = maui.clone();
        System.out.println("criei maui 3");
        Personagem maui4 = maui.clone();
        System.out.println("criei maui 4");
        Personagem maui5 = maui.clone();
        System.out.println("criei maui 5");
    }

}
