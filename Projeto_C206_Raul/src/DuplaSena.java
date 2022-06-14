public class DuplaSena extends Jogos{

    private int num_apostas;

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas, Conta conta,Cliente c) {
        if (num_apostas == 6) {
            c.pagar(2.50,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 7) {
            c.pagar(17.50,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 8) {
            c.pagar(70.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 9) {
            c.pagar(210.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 10){
            c.pagar(525.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 11){
            c.pagar(1155.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 12) {
            c.pagar(2310.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 13) {
            c.pagar(4290.00,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 14) {
            c.pagar(7507.50,conta);
            this.num_apostas = num_apostas;
        } else if (num_apostas == 15) {
            c.pagar(12512.50,conta);
            this.num_apostas = num_apostas;
        }
        else
            System.out.println("Opcao Invalida");
    }

    @Override
    public void premio(int acertos, Conta c,Cliente cliente) {
        if(acertos == 6){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(5871535.18,c);
            System.out.println("Voce acertou 6 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 5){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(5073.69,c);
            System.out.println("Voce acertou 5 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 4){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(102.38,c);
            System.out.println("Voce acertou 4 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 3){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(2.78,c);
            System.out.println("Voce acertou 3 dezenas");
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
