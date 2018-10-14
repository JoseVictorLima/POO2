package mercado;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Caixa {
    
	private int id;
	
	public Caixa(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
    public void abrir(){
        //Log;
    }
    public void fechar(){
        //Log;
    }
    public double pesoBalanca(){
        Random gerador = new Random();
        double peso = gerador.nextDouble();
        return peso;
    }
    
    public void vender(Estoque estoque){
        int total=0;
        System.out.println("=====================================");
        System.out.println("|               Caixa               |");
        System.out.println("=====================================");
        System.out.print("Código: ");
        Scanner teclado = new Scanner(System.in);
        int cod = teclado.nextInt();
        System.out.print("Quantidade: ");
        int quant = teclado.nextInt();
        
        System.out.println("-Produto: " + estoque.getProduto(cod).getNome());
        double x=estoque.getProduto(cod).getPreco();
        estoque.subtrairEstoque(cod, quant);
        System.out.println("--Preco: " + x + " x " + quant + " = " + x*quant);
        
        System.out.println("Total= " + total);
        //Dinheiro ou cartao
        //mandar para o relatorio
    
    }
}
