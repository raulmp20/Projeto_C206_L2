public class Lotofacil extends Jogos{

    private int num_apostas;

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas, Conta conta,Cliente c) {
        if (num_apostas == 15) {
            c.pagar(2.50,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 16) {
            c.pagar(40.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 17) {
            c.pagar(340.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 18) {
            c.pagar(2040.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 19){
            c.pagar(9690.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 20){
            c.pagar(38760.00,conta);
            this.num_apostas = num_apostas;
        } else
            System.out.println("Opcao Invalida");
    }

    @Override
    public void premio(int acertos, Conta c,Cliente cliente){
        if(acertos == 11){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(5.00,c);
            System.out.println("Voce acertou 11 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 12){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(10.00,c);
            System.out.println("Voce acertou 12 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 13){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(25.00,c);
            System.out.println("Voce acertou 13 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 14){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(1085.55,c);
            System.out.println("Voce acertou 14 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 15){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(397442.57,c);
            System.out.println("Voce acertou 15 dezenas");
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
