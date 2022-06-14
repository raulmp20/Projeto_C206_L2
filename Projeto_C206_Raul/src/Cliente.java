import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int cpf;

    Jogos[] jogos = new Jogos[20];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    void adicionarJogo(Jogos jogo){
        for (int i = 0; i < this.jogos.length; i++) {
            if(jogos[i] == null) {
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostraJogos(){
        for (int i = 0; i < this.jogos.length; i++) {
            if (jogos[i] != null){
                System.out.println(jogos[i].getApostas());
            }
        }
    }

    public void pagarFatura(Faturas fatura, Conta conta) {
        try {
            if (fatura.getValor() < (conta.getSaldo() + conta.getLimite())) {
                conta.setSaldo(conta.getSaldo() - fatura.getValor());
            } else throw new SaldoInsuficienteException("Valor da fatura é superior ao disponivel");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }
    }

    public void pagar(double valor, Conta conta){
        try {
            if (valor < (conta.getSaldo() + conta.getLimite())) {
                conta.setSaldo(conta.getSaldo() - valor);
            } else throw new SaldoInsuficienteException("Valor é superior ao disponivel");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }
    }

    public void sacar(double valor, Conta conta) {
        try {
            if (valor < (conta.getSaldo() + conta.getLimite())) {
                conta.setSaldo(conta.getSaldo() - valor);
            } else throw new SaldoInsuficienteException("Saldo Insuficiente");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }
    }

    public void deposito(double valor, Conta conta){
        conta.setSaldo(conta.getSaldo() + valor);
    }
}

