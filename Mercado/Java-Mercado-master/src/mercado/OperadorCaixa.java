package mercado;

import java.util.Scanner;

public class OperadorCaixa extends Usuario {

    public OperadorCaixa(String usuario, String senha, String nome, int tipo) {
        super(usuario, senha, nome, tipo);
    }
    
    public String getNome() {
    	return this.getNome();
    }
    
    public void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcao;
        // Menu Login
        System.out.println("=====================================");
        System.out.println("|         Operador de Caixa         |");
        System.out.println("=====================================");
        System.out.println("| Opções:                           |");
        System.out.println("|   1. Abrir um Caixa               |");
        System.out.println("|   2. Sair                         |");
        System.out.println("=====================================");
        System.out.print(" Opção: ");
        opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                //Caixa.abrir();
                break; 
            case 2:
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Inválida");
                break; 
        }
        
    }
}
