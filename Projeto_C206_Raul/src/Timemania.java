public class Timemania extends Jogos{

    private int num_apostas;

    private String nomeTime;

    private String timeSorteado;

    public String getTimeSorteado() {
        return timeSorteado;
    }

    public void setTimeSorteado(String timeSorteado) {
        this.timeSorteado = timeSorteado;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas) {
        this.num_apostas = num_apostas;
    }

    @Override
    public void premio(int acertos, Conta c,Cliente cliente) {
        if(this.timeSorteado.equals(this.nomeTime)){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(7.50,c);
            System.out.println("Voce acertou o time");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        if(acertos == 7){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(10078210.05,c);
            System.out.println("Voce acertou todas as dezenas!");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 6){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(22633.21,c);
            System.out.println("Voce acertou 6 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 5){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(1096.03,c);
            System.out.println("Voce acertou 5 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 4){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(9.00,c);
            System.out.println("Voce acertou 4 dezenas");
            System.out.println();
            System.out.println("Conta depois: ");
            c.mostraInfo();
        }
        else if(acertos == 3){
            System.out.println("Conta antes: ");
            c.mostraInfo();
            cliente.deposito(3.00,c);
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
