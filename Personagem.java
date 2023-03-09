import java.io.StringBufferInputStream;

public class Personagem{
    //variavel de instancia
    String nome;
    int energia;
    int fome;
    int sono;

    //isso é um método de instância
    void cacar(){
        System.out.println(nome + "cacando");
    }

    void comer(){
        System.out.print(nome + "comendo\n");
    }

    void dormir(){
        System.out.printf("%s dormindo%n", nome);
    }

    
    
}