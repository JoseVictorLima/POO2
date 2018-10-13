package mercado;

import java.util.Scanner;

public class Gerente extends Usuario {
   
    public Gerente(String usuario, String senha, String nome, int tipo) {
        super(usuario, senha, nome, tipo);
    }
    public void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcao;
        // Menu Login
        String Uusuario, Usenha;
        System.out.println("=====================================");
        System.out.println("|              GERENTE              |");
        System.out.println("=====================================");
        System.out.println("| Opções:                           |");
        System.out.println("|   1. Adicionar produto em estoque |");
        System.out.println("|   2. [Relatorio] Vendas           |");
        System.out.println("|   2. [Relatorio] Estoque          |");
        System.out.println("|   3. Sair                         |");
        System.out.println("=====================================");
        System.out.print(" Opção: ");
        opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                //Estoque.adicionarProduto();
                break; 
            case 2:
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Invalida");
                break; 
        }
        
    }
    
    public void adicionarProduto(Produto prod, Estoque estoque,int quant) {
    	estoque.add(prod,quant);
    }
}
