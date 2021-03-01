package Cadastros;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CadastrarSalas{

  private Scanner l;
	private boolean execute;
	private List<Salas> salas;

  public CadastrarSalas() {
		l = new Scanner(System.in);
		execute = true;
		salas = new ArrayList<Salas>();

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
		System.out.println("Selecione a opção Para as Salas:");
		System.out.println("N - Novo cadastro");
		System.out.println("L - Listar cadastros");
		System.out.println("X - Sair");
		return l.nextLine();
	}

	public void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
      
      System.out.println("Cadastro de Salas");
      Salas s = new Salas();
      s.setNome(textInput("Nome: "));
      s.setLotacao(textInput("Lotacao: "));


			String cadastrar = textInput("Cadastrar (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				salas.add(s);
       

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
		if (salas.size() == 0) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < salas.size(); i++) {
				Salas s = salas.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome: " + s.getNome());
				System.out.println("\tLotacao: " + s.getLotacao());
			
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}