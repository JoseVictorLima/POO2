package mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String usuario;
    private String senha;
    private String nome;
    private int tipo;//1 Gerente | 2 Operador de Caixa
    
    public Usuario(){
      
    }
    
    public String getNome() {
    	return this.nome;
    }
    
    public Usuario(String usuario, String senha, String nome, int tipo){
      this.usuario=usuario;
      this.senha=senha;
      this.nome=nome;
      this.tipo=tipo;
    
    }
    public void login(ArrayList<Usuario> listaUsuario){
        Scanner teclado = new Scanner(System.in);
        // Menu Login
        String Uusuario, Usenha;
        System.out.println("===============================");
        System.out.println("|           Login             |");
        System.out.println("===============================");
        System.out.print("Usuário: ");
        Uusuario = teclado.next();
        System.out.print("Senha: ");
        Usenha = teclado.next();
        int i=0;
        boolean autenticado=false;
        while ((i<listaUsuario.size()) && (autenticado !=true)){
            System.out.print(listaUsuario.get(i).usuario);
            if ((listaUsuario.get(i).usuario.equals(Uusuario)) && (listaUsuario.get(i).senha.equals(Usenha))){
                    listaUsuario.get(i).menu();
                    autenticado=true;
            }else{
                  System.out.println("Usuário ou Senha incorreta!");
                  this.login(listaUsuario);
            }
            i++;
        }
    }
    public void menu (){
        if (this.tipo == 1){
            Gerente gerente = new Gerente(this.usuario,this.senha,this.nome,this.tipo);
            gerente.menu();
        }else{
            OperadorCaixa operadorCaixa = new OperadorCaixa(this.usuario,this.senha,this.nome,this.tipo);
            operadorCaixa.menu();
        }
    }
}
