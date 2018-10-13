package mercado;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> listaProduto = new ArrayList();
    private ArrayList<Integer> quantidade = new ArrayList();
    
   public void add (Produto p, int quant){
        this.listaProduto.add(p);
        this.quantidade.add(quant);
   }
   public void subtrairEstoque(int cod,int quant){
        this.quantidade.set(cod, (this.quantidade.get(cod)- quant));        
    }
   public Produto getProduto(int cod){
       return this.listaProduto.get(cod);
   }
}
