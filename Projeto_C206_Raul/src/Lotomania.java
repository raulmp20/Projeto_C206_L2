public class Lotomania extends Jogos{

    private int num_apostas;

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas) {
        this.num_apostas = num_apostas;
    }

    @Override
    public void premio(int acertos, Conta c,Cliente cliente) {
        if(acertos == 20){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(12796492.14,c);
            System.out.println("Voce acertou todas as dezenas!");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 19){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(29926.04,c);
            System.out.println("Voce acertou 19 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 18){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(1724.46,c);
            System.out.println("Voce acertou 18 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 17){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(217.87,c);
            System.out.println("Voce acertou 17 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 16){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(36.93,c);
            System.out.println("Voce acertou 16 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 15){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(8.80,c);
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
