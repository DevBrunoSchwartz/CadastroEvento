package Cadastros;

class Main {
	  public static void main(String[] args) {

	      System.out.println("Sistema de gerenciamento de eventos");

	    CadastrarSalas s = new CadastrarSalas ();
	    s.cadastrar();
	    s.menu();
	    s.listarCadastros();

	    CadastrarUsuarios u = new CadastrarUsuarios ();
	    u.cadastrar();
	    u.menu();
	    u.listarCadastros();

	    CadastrarEspaco e = new CadastrarEspaco ();
	    e.cadastrar();
	    e.menu();
	    e.listarCadastros();


	  }
	}