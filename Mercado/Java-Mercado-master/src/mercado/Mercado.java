package mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {
   
    public static void main(String[] args) {
    
    //Criar os produtos
    Produto produto1 = new Produto("CocaCola",5.50,1);
    Produto produto2 = new Produto("Picanha",35.20,2);
    Produto produto3 = new Produto("Biscoito",2.00,1);
    
    //Cadastrar no Estoque
    Estoque estoque = new Estoque();
    estoque.add(produto1, 50);
    estoque.add(produto2, 10);
    estoque.add(produto3, 20);
    
    //Criar o Gerente
    Gerente gerente = new Gerente("admin","admin","Stefaldo",1);
    
    //Criar os Operadores dos Caixas
    OperadorCaixa operadorCaixa1 = new OperadorCaixa("junior","junior","Junior Claudio",2);
    OperadorCaixa operadorCaixa2 = new OperadorCaixa("fabio","fabio","Fabio Neves",2);
    OperadorCaixa operadorCaixa3 = new OperadorCaixa("carlos","carlos","Carlos Pedro",2);
    
    //Criar a lista de Usuários do Sistema
    ArrayList<Usuario> listaUsuario = new ArrayList();
    
    //Adicionando os Usuarios a Lista
    listaUsuario.add(gerente);
    listaUsuario.add(operadorCaixa1);
    listaUsuario.add(operadorCaixa2);
    listaUsuario.add(operadorCaixa3);
    
    int opcao;
  
    // Menu Principal
    System.out.println("===============================");
    System.out.println("|        SisMercado           |");
    System.out.println("===============================");
    System.out.println("| Opções:                     |");
    System.out.println("|        1. Login             |");
    System.out.println("|        2. Consultar Produto |");
    System.out.println("|        3. Sair              |");
    System.out.println("===============================");
    System.out.print("Selecione uma opção: ");
    Scanner teclado = new Scanner(System.in);
    opcao = teclado.nextInt();

    // Switch das opções
    switch (opcao) {
      case 1:
        Usuario usuario = new Usuario();
        usuario.login(listaUsuario);
        break;
      case 2:
        Produto produto = new Produto();
        produto.consultarPreco(estoque);
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
   
