package mercado;
import java.util.*;

public class Log {
    static ArrayList<String> historico = new ArrayList();
    
    public void criarLog(OperadorCaixa operador,Produto produto,Caixa caixa) {
    	String log;
    	Date data = new Date();
    	log = "Caixa: " + caixa.getId() + " - Funcionario: " + operador.getNome() + " - Porduto: "+ produto.getNome() + " - Data: " + data;
    	this.historico.add(log);
    }
    
    public void printarHistorico() {
    	for(int i=0;i < this.historico.size();i++) {
    		String atual;
    		atual = (String)this.historico.get(i);
    		System.out.println(atual);
    	}
    }
}
