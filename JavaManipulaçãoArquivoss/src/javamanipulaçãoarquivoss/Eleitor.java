package javamanipulaçãoarquivoss;

public class Eleitor {
    int NumeroEleitor;
    String NomeEleitor;
    int NumeroSecao;
    
    Eleitor() {
        this(0, "", 0);
    }
    
    Eleitor(
        int numeleitor,
        String noeleitor,
        int nsecao){
            NumeroEleitor = numeleitor;
            NomeEleitor = noeleitor;
            NumeroSecao = nsecao;
    }
}
