public class TestePersonagem {
    static public void main(String [] args){
        //p é uma variavel de referencia. Ela faz referencia ao objeto construido com new
        //Personagem p = new Personagem();
        //java 10+
        var p = new Personagem();
        p.nome = "John" ;
        p.cacar();
        p.comer();
        p.dormir();
    }
}
