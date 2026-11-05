package javamanipulaçãoarquivoss;
import java.io.IOException;
import javax.swing.*;

public class MenuPrincipal {
    public static void main(String[] args) throws IOException {
        MenuCadastro c = new MenuCadastro();
        MenuEstatistica e = new MenuEstatistica();
        MetodosMenuPrincipal m = new MetodosMenuPrincipal();
        Eleitor [] eleitor = new Eleitor[5];
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n"
                                                                + "1 - Cadastra Eleitor \n"
                                                                + "2 - Cadastra Votacao \n"
                                                                + "3 - Agrupa Apuracao \n"
                                                                + "4 - Consulta Estatisticas \n"
                                                                + "9 - Sair"));
            switch (opc) {
                case 1:
                    eleitor = m.CadastraEleitor(eleitor);
                    break;
                case 2:
                    c.MenuCadastro(eleitor);
                    break;
                case 3:
                    m.AgrupaApuracao(eleitor);
                    break;
                case 4:
                    e.MenuEstatistica();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida!");
            }
        
        }
    }
}
