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
public class BancoDigital {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        c1.setNome("Vinicius");
        c1.setEndereco("Mora na UVV");
        c1.setCpf("1234567890");
        
        
        Conta cc = new Conta();
        cc.setNumero(01);
        cc.setSaldo(100);
        
        cc.setCorrentista(c1);
        
        
        System.out.println("O nome do cliente da conta " + cc.getNumero() + " é " + cc.getCorrentista().getNome() );
        
        cc.deposita(200);
        cc.saca(50);
        
        System.out.println("Saldo atual: " + cc.getSaldo());

        
        Conta cc2 = new Conta();
        cc2.setNumero(01);
        cc2.setSaldo(300);
        
        cc.transfere(cc2, 50);
        
        System.out.println("CC1: " + cc.getSaldo() );
        System.out.println("CC2: " + cc2.getSaldo() );
    }
}
