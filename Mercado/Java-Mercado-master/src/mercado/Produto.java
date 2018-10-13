package mercado;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int tipo;//0 unidade | 1 quilo
    
    public Produto(){
    }
    
    public Produto(String nome, double preco, int tipo){
        this.nome=nome;
        this.preco=preco;
        this.tipo=tipo;
    } 
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void consultarPreco(Estoque estoque){
        int codProduto;
        // Menu Consultar o preço do Produto
        System.out.println("===============================");
        System.out.println("|      Consulta de preço      |");
        System.out.println("===============================");
        System.out.print("Código do produto: ");
        Scanner teclado = new Scanner(System.in);
        codProduto = teclado.nextInt();
        System.out.println(estoque.getProduto(codProduto).preco);
      }
}
