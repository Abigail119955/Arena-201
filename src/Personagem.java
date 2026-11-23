public class Personagem {
    protected String nome;
    protected int vida = 100;

    public Personagem(String nome){
        this.nome = nome;
    }
    public void receberDado(int dano){
        vida = vida - dano;
    }
}
