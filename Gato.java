package Animais02;

public class Gato implements AnimalAquatico, AnimalTerrestre {
    private String nome = "Laninha";

    @Override
    public void nadar() { System.out.println(nome + " não gosta de nadar."); }
    @Override
    public void respirarDebaixoDagua() { System.out.println(nome + " não consegue respirar debaixo dágua."); }
    @Override
    public void andar() { System.out.println(nome + " consegue andar em terra firme."); }
    @Override
    public void respirar() { System.out.println(nome + " consegue respirar."); }


    public void emitirSom() { System.out.println(nome + " está miando."); }
    
    
}
