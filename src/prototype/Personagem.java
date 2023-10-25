package prototype;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Personagem {
    private int porte;
    private String nome;
    private double altura;
    private ArrayList<Pet> pets;
    private int fiosDeCabelo;
    private transient String render;

    public Personagem(int porte, String nome, double altura, int fiosDeCabelo) {
        this.porte = porte;
        this.nome = nome;
        this.altura = altura;
        this.fiosDeCabelo = fiosDeCabelo;
        this.pets = new ArrayList<>();
        this.render = render();
    }

    public Personagem() {
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public String render() {
        // usa os atributos do objeto e renderiza o personagem
        String resultado = "";

        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public int getPorte() {
        return porte;
    }
    public void setPorte(int porte) {
        this.porte = porte;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getFiosDeCabelo() {
        return fiosDeCabelo;
    }
    public void setFiosDeCabelo(int fiosDeCabelo) {
        this.fiosDeCabelo = fiosDeCabelo;
    }
    public ArrayList<Pet> getPets() {
        return pets;
    }
    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    public String getRender() {
        return render;
    }
    public void setRender(String render) {
        this.render = render;
    }

    public Personagem clone() {
        Personagem clone = new Personagem();

        clone.setAltura(altura);
        clone.setFiosDeCabelo(fiosDeCabelo);
        clone.setNome(nome);
        clone.setPets((ArrayList<Pet>)pets.clone());
        clone.setPorte(porte);
        clone.setRender(render);

        return clone;
    }
    
}