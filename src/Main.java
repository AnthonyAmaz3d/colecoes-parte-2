import java.util.*;

/**
 * @author Anthony.Amaz3d
 */

public class Main {
  public static void main(String[] args) {
    Map<Integer, List<Pessoa>> pessoas = new HashMap<>();
    pessoas.put(1, new ArrayList<>());
    pessoas.put(2, new ArrayList<>());

    int quantasPessoas = Interface.definirQuantasPessoas();

    for (int i = 0; i < quantasPessoas; i++) {
      String nome = Interface.definirNome();
      String genero = Interface.definirSexo();

      Pessoa pessoa = new Pessoa(nome, genero);
      if (genero.equalsIgnoreCase("masculino")) {
        pessoas.get(1).add(pessoa);
      } else if (genero.equalsIgnoreCase("feminino")) {
        pessoas.get(2).add(pessoa);
      }
    }

    imprimirPessoa(pessoas.get(1), "Masculino");
    imprimirPessoa(pessoas.get(2), "Feminino");
  }

  private static void imprimirPessoa(List<Pessoa> pessoas, String sexo) {
    if (pessoas != null && !pessoas.isEmpty()) {
      System.out.println("Lista de pessoas do sexo: " + genero);
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " Genero: " + pessoa.getSexo());
        }
    } else {
      System.out.println("Nenhuma pessoa do tipo: " + genero);
    }
  }
}
