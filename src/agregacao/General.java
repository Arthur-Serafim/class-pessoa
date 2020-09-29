/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

/**
 *
 * @author alunolab07
 */
public class General {
    
    public static void main(String[] args) {
        
      Pessoa arthur = new Pessoa();
      CodigoPostal localArthur = new CodigoPostal();

      localArthur.setcodigo("29212140");

      arthur.setNome("Arthur Serafim");
      arthur.setEndereco("Rua Viana");
      arthur.setCpf(localArthur);

      System.out.println(arthur.getEndereco());
      System.out.println(arthur.getNome());
      System.out.println(arthur.getCpf().getcodigo());
    }
}
