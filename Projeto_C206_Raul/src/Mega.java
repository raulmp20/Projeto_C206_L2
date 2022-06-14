public class Mega extends Jogos{

    private int num_apostas;

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas,Conta conta,Cliente cliente) {

        if(num_apostas == 6){
            cliente.pagar(4.50,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 7){
            cliente.pagar(31.50,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 8){
            cliente.pagar(126,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 9) {
            cliente.pagar(378, conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 10){
            cliente.pagar(945,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 11){
            cliente.pagar(2079,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 12){
            cliente.pagar(4158,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 13) {
            cliente.pagar(7722, conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 14){
            cliente.pagar(13513.50,conta);
            this.num_apostas = num_apostas;
        }
        else if(num_apostas == 15){
            cliente.pagar(22522.50,conta);
            this.num_apostas = num_apostas;
        }
        else
            System.out.println("Opcao Invalida");
    }

    @Override
    public void premio(int acertos, Conta c,Cliente cliente){
        if(acertos == 6){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(100000000.00,c);
            System.out.println("Voce acertou todas as dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 5){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(45019.83,c);
            System.out.println("Voce acertou 5 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 4){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(1029.63,c);
            System.out.println("Voce acertou 4 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else {
            System.out.println("Conta antes: ");
            c.mostraInfo();
            System.out.println("Não foi dessa vez :(");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
    }



}
