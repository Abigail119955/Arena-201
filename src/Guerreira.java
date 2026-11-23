public class Guerreira extends Personagem{

    public int escudo = 3;

    public Guerreira(String nome, int escudo) {
        super(nome);
        this.escudo = escudo;

    }

    public void defender(){

        escudo -= 1;
        System.out.println("Nome defende!");

    }
}
