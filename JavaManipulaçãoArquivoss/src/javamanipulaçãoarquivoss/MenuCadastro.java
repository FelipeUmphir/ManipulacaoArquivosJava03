package javamanipulaçãoarquivoss;
import java.io.IOException;
import javax.swing.*;

public class MenuCadastro {
    public int MenuCadastro(Eleitor[] e) throws IOException {
        MetodosMenuPrincipal m = new MetodosMenuPrincipal();
        
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU CADASTRO \n"
                                                                + "1 - Cadastro Votacao 1 \n"
                                                                + "2 - Cadastro Votacao 2 \n"
                                                                + "9 - Finalizar Cadastro"));
            switch (opc) {
                case 1:
                    m.CadastraVotacao1(e);
                    break;
                case 2:
                    m.CadastraVotacao2(e);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida!");
            }
        
        }
        return 0;
    }
}
