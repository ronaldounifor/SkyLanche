package prototype;

public class Pet extends Personagem {
    private String apelido;

    public Pet(){
        
    }
    
    public Pet(int porte, String nome, String apelido, double altura, int fiosDeCabelo) {
        super(porte, nome, altura, fiosDeCabelo);
    }
    
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
