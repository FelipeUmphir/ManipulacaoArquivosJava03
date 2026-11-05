package javamanipulaçãoarquivoss;
import javax.swing.*;
import java.io.*;

public class MetodosMenuPrincipal {
    public Eleitor[] CadastraEleitor (Eleitor[] e) {
        for (int i = 0; i < e.length; i++) {
            e[i].NomeEleitor = (JOptionPane.showInputDialog("Digite seu nome: "));
            e[i].NumeroEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero: "));
            e[i].NumeroSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite sua secao: "));
        }
        
        return e;
    }
    
    public void CadastraVotacao1(Eleitor[] e) throws IOException{
        String fileName = "Votação1.txt"; 
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < e.length; i++) {
            if (e[i].NumeroSecao < 5) {
                writer.write(Integer.toString(e[i].NumeroSecao));
                writer.newLine();
                writer.write(JOptionPane.showInputDialog("Digite o numero do candidato: "));
                writer.newLine();
                writer.write(e[i].NumeroEleitor);
                writer.newLine();
            }
        }
        
        writer.close();    
        System.out.println("Dados da votacao gravados!");
    }
    
    public void CadastraVotacao2(Eleitor[] e) throws IOException{
        String fileName = "Votacao2.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < e.length; i++) {
            if (e[i].NumeroSecao < 5) {
                writer.write(Integer.toString(e[i].NumeroSecao));
                writer.newLine();
                writer.write(JOptionPane.showInputDialog("Digite o numero do candidato: "));
                writer.newLine();
                writer.write(e[i].NumeroEleitor);
                writer.newLine();
            }
        }
        
        writer.close();
        System.out.println("Dados da votacao gravados!");
    }
    
    public void AgrupaApuracao(Eleitor[] e) {
        
    }
}
