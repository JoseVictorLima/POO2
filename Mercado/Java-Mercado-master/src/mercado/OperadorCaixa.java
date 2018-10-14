package mercado;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class OperadorCaixa extends Usuario {

	static ArrayList<String> relatorios = new ArrayList();
	
    public OperadorCaixa(String usuario, String senha, String nome, int tipo) {
        super(usuario, senha, nome, tipo);
    }
    
    public String getNome() {
    	return this.getNome();
    }
    
    public void gerarRelatorio(float venda) {
    	String log;
    	Date data = new Date();
    	log = "Venda: " + venda + "- Data: " + data;
    	this.relatorios.add(log);
    }
    
    public void mostarRelatorio() {
    	for(int i = 0 ;i<this.relatorios.size();i++) {
    		String relatorio;
    		relatorio = this.relatorios.get(i);
    		System.out.println(relatorio);
    	}
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
