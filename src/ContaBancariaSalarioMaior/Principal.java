package ContaBancariaSalarioMaior;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        ArrayList<ContaBancaria2> conta = new ArrayList<>();

        ContaBancaria2 contaBancaria2 = new ContaBancaria2(22,250.5);
        ContaBancaria2 contaBancaria21 = new ContaBancaria2(12,1000.5);
        ContaBancaria2 contaBancaria23 = new ContaBancaria2(98,10);
        ContaBancaria2 contaBancaria24 = new ContaBancaria2(2,200.5);

        conta.add(contaBancaria2);
        conta.add(contaBancaria21);
        conta.add(contaBancaria23);
        conta.add(contaBancaria24);

        ContaBancaria2 maiorSalario = conta.get(0);
        for (ContaBancaria2 cont :conta){

            if (cont.getSaldoConta() > maiorSalario.getSaldoConta()) {
                maiorSalario = cont;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + maiorSalario.getNumeroConta() +
                ", Saldo: " + maiorSalario.getSaldoConta());


    }
}
