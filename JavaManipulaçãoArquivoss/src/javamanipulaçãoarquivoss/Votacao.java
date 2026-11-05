package javamanipulaçãoarquivoss;

public class Votacao {
    int NumeroSecao;
    int NumeroCandidato;
    int NumeroEleitor;
	
    Votacao() {
        this(0, 0, 0);
    }
	
    Votacao(
	int nsecao, 
	int ncandidato,
        int neleitor) {
            NumeroSecao = nsecao;
            NumeroCandidato = ncandidato;
            NumeroEleitor = neleitor;		
    }
}