package javamanipulaçãoarquivoss;

import javax.swing.JOptionPane;

public class MenuEstatistica {
    public int MenuEstatistica() {
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATISTICA \n"
                                                                + "1 - Vencedor \n"
                                                                + "2 - Segundo Colocado \n"
                                                                + "3 - Quantidade de votos em branco \n"
                                                                + "4 - Quantidade de votos nulos \n"
                                                                + "5 - Mostra eleitores \n"
                                                                + "6 - Mostra Apuracao \n"
                                                                + "9 - Finalizar Estatistica"));
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
