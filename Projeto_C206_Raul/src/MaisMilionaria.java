public class MaisMilionaria extends Jogos{

    private int num_apostas;

    private int num_trevos;

    private int acertos_trevos;

    public int getAcertos_trevos() {
        return acertos_trevos;
    }

    public void setAcertos_trevos(int acertos_trevos) {
        this.acertos_trevos = acertos_trevos;
    }

    public int getNum_apostas() {
        return num_apostas;
    }

    public void setNum_apostas(int num_apostas, Conta conta, int num_trevos,Cliente c) {

        if(num_trevos == 2) {
            this.num_trevos = num_trevos;
            if (num_apostas == 6) {
                c.pagar(6.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 7) {
                c.pagar(42.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 8) {
                c.pagar(168.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 9) {
                c.pagar(504.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 10) {
                c.pagar(1260.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 11) {
                c.pagar(2772.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 12) {
                c.pagar(5544.00,conta);
                this.num_apostas = num_apostas;
            } else
                System.out.println("Opcao Invalida");
        }
        else if(num_trevos == 3) {
            this.num_trevos = num_trevos;
            if (num_apostas == 6) {
                c.pagar(18.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 7) {
                c.pagar(126.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 8) {
                c.pagar(504.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 9) {
                c.pagar(1512.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 10) {
                c.pagar(3780.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 11) {
                c.pagar(8316.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 12) {
                c.pagar(16632.00,conta);
                this.num_apostas = num_apostas;
            } else
                System.out.println("Opcao Invalida");
        }
        else if(num_trevos == 4) {
            this.num_trevos = num_trevos;
            if (num_apostas == 6) {
                c.pagar(36.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 7) {
                c.pagar(252.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 8) {
                c.pagar(1008.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 9) {
                c.pagar(3024.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 10) {
                c.pagar(7560.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 11) {
                c.pagar(16632.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 12) {
                c.pagar(33264.00,conta);
                this.num_apostas = num_apostas;
            } else
                System.out.println("Opcao Invalida");
        }
        else if(num_trevos == 5) {
            this.num_trevos = num_trevos;
            if (num_apostas == 6) {
                c.pagar(60.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 7) {
                c.pagar(420.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 8) {
                c.pagar(1680.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 9) {
                c.pagar(5040.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 10) {
                c.pagar(12600.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 11) {
                c.pagar(27720.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 12) {
                c.pagar(55440.00,conta);
                this.num_apostas = num_apostas;
            } else
                System.out.println("Opcao Invalida");
        }
        else if(num_trevos == 6) {
            this.num_trevos = num_trevos;
            if (num_apostas == 6) {
                c.pagar(90.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 7) {
                c.pagar(630.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 8) {
                c.pagar(2520.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 9) {
                c.pagar(7560.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 10) {
                c.pagar(18900.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 11) {
                c.pagar(41580.00,conta);
                this.num_apostas = num_apostas;
            } else if (num_apostas == 12) {
                c.pagar(83160.00,conta);
                this.num_apostas = num_apostas;
            } else
                System.out.println("Opcao Invalida");
        }
        else System.out.println("Numero de trevos Invalido");
    }
    @Override
    public void premio(int acertos, Conta c,Cliente cliente) {
        if (this.getAcertos_trevos() == 2){
            if(acertos == 6){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(6200000.00,c);
                System.out.println("Voce acertou 6 dezenas e 2 trevos");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
        else if(acertos == 5){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(800000.00,c);
                System.out.println("Voce acertou 5 dezenas e 2 trevos");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 4){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(600000.00,c);
                System.out.println("Voce acertou 4 dezenas e 2 trevos");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 3){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(50.00,c);
                System.out.println("Voce acertou 3 dezenas e 2 trevos");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 2){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(12.00,c);
                System.out.println("Voce acertou 2 dezenas e 2 trevos");
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
        else if (this.getAcertos_trevos() == 1){
            if(acertos == 6){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(1000000.00,c);
                System.out.println("Voce acertou 6 dezenas e 1 trevo");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 5){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(800000.00,c);
                System.out.println("Voce acertou 5 dezenas e 1 trevo");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 4){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(600000.00,c);
                System.out.println("Voce acertou 4 dezenas e 1 trevo");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 3){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(24.00,c);
                System.out.println("Voce acertou 3 dezenas e 1 trevo");
                System.out.println();
                System.out.println("Conta depois: ");
                c.mostraInfo();
            }
            else if(acertos == 2){
                System.out.println("Conta antes: ");
                c.mostraInfo();
                cliente.deposito(6.00,c);
                System.out.println("Voce acertou 2 dezenas e 1 trevo");
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
        else{
            System.out.println("Não foi dessa vez :(");
        }
    }
}
