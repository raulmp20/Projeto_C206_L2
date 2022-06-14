public class Quina extends Jogos{

    private int num_apostas;

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas, Conta conta,Cliente c) {
        if(num_apostas == 5){
            c.pagar(2.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 6){
            c.pagar(12.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 7){
            c.pagar(42.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 8){
            c.pagar(112.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 9) {
            c.pagar(252.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 10){
            c.pagar(504.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 11){
            c.pagar(924.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 12){
            c.pagar(1584.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 13) {
            c.pagar(2574.00,conta);
            this.num_apostas = num_apostas;
        }else if(num_apostas == 14){
            c.pagar(4004.00,conta);
            this.num_apostas = num_apostas;
        }
        else if(num_apostas == 15){
            c.pagar(6006.00,conta);
            this.num_apostas = num_apostas;
        }
        else
            System.out.println("Opcao Invalida");
    }

    @Override
    public void premio(int acertos, Conta c,Cliente cliente){
        if(acertos == 5){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(2983683.89,c);
            System.out.println("Voce acertou todas as dezenas!");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 4){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(3000.48,c);
            System.out.println("Voce acertou 4 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 3){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(44.43,c);
            System.out.println("Voce acertou 3 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 2){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(2.42,c);
            System.out.println("Voce acertou 2 dezenas");
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
