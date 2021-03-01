package Cadastros;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastrarEspaco{

  private Scanner l;
	private boolean execute;
	private List<Espaco> espaco;

  public CadastrarEspaco() {
		l = new Scanner(System.in);
		espaco = new ArrayList<Espaco>();
  
		while (execute) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("n")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("l")) {
				listarCadastros();
			} else if (opcao.equalsIgnoreCase("x")) {
				execute = false;
			} else {
				System.out.println("\nOpção Inválida \n");
			}
     
		}
    
	}

	public String menu() {
		System.out.println("Selecione a opção Para os Espaços:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return l.nextLine();
	}

	public void cadastrar() {
		boolean cadastrando = true;
		while (cadastrando) {
      
      System.out.println("Cadastro de Salas");
      Espaco e = new Espaco();
      e.setNome(textInput("Nome: "));

			String cadastrar = textInput("Cadastrar (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				espaco.add(e);
       

			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOpção inválida. \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
			} else {
				System.out.println("\nOpção inválida \n");
				cadastrando = false;
			}
		}
	}
  

	public void listarCadastros() {
		if (espaco.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < espaco.size(); i++) {
				Espaco e = espaco.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + e.getNome());
			
			
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}