import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente("Raul", 140454476);
        ArrayList<Conta> contas = Arquivo.ler();
        boolean flag = true;

        while (flag) {
            System.out.println("Opcoes disponiveis: ");
            System.out.println("1 - Criar uma conta para o cliente");
            System.out.println("2 - Mostrar as informacoes do cliente e das suas contas");
            System.out.println("3 - Pagar Contas, boletos ou faturas");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Jogar");
            System.out.println("6 - Mostra os jogos feitos pelo cliente");
            System.out.println("7 - Sair da Aplicacao");
            System.out.println("Sua opcao: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    Conta con = new Conta();
                    System.out.println("Digite o saldo da conta: ");
                    con.setSaldo(sc.nextDouble());
                    System.out.println("Limite da conta: ");
                    con.setLimite(sc.nextDouble());
                    sc.nextLine();
                    if((con.getSaldo() != 0) && (con.getLimite() != 0)) {
                        Arquivo.escrever(con);
                        System.out.println("Conta cadastrada com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Nome do Cliente: " + c.getNome());
                    System.out.println("CPF: " + c.getCpf());
                    System.out.println("Contas cadastradas no sistema: ");
                    for (Conta c1: contas) {
                        if(c1 != null) {
                            c1.mostraInfo();
                        }
                    }
                    break;
                case 3:
                    Faturas f = new Faturas();
                    System.out.println("Digite o numero da fatura: ");
                    f.setId(sc.nextInt());
                    System.out.println("Valor da fatura: ");
                    f.setValor(sc.nextDouble());
                    System.out.println("Digite a conta que sera utilizada para o pagamento: ");
                    i = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Saldo da conta antes do pagamento: ");
                    double antes = contas.get(i).getSaldo();
                    System.out.println(antes);
                    c.pagarFatura(f,contas.get(i));
                    System.out.println("Saldo da conta após o pagamento: ");
                    double depois = contas.get(i).getSaldo();
                    System.out.println(depois);

                    if(antes != depois) {
                        System.out.println("Fatura paga com sucesso!");
                    }else
                        System.out.println("Não foi feito o pagamento");

                    break;
                case 4:
                    System.out.println("Digite a conta de onde se deseja sacar: ");
                    i = sc.nextInt();
                    System.out.println("Digite o valor que se deseja sacar: ");
                    c.sacar(sc.nextDouble(),contas.get(i));
                    System.out.println("Saldo da conta apos o saque: ");
                    System.out.println(contas.get(i).getSaldo());
                    break;
                case 5:
                    System.out.println("Digite o jogo onde se deseja apostar: ");
                    System.out.println("1 - Mega-Sena");
                    System.out.println("2 - Lotofacil");
                    System.out.println("3 - Quina");
                    System.out.println("4 - Lotomania");
                    System.out.println("5 - Timemania");
                    System.out.println("6 - Dupla-Sena");
                    System.out.println("7 - +Milionaria");
                    System.out.println("Sua opcao: ");
                    int ep = sc.nextInt();

                    switch (ep) {
                        case 1:
                            int cont = 0;
                            Mega mega = new Mega();
                            ArrayList<Integer> integers = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q = sc.nextInt();
                            System.out.println("Digite o numero de apostas (6 a 15): ");
                            mega.setNum_apostas(sc.nextInt(), contas.get(q),c);
                            System.out.println("Digite as suas apostas: ");
                            for (int j = 0; j < mega.getNum_apostas(); j++) {
                                integers.add(sc.nextInt());
                            }
                            mega.apostar(c.getNome(), integers);
                            c.adicionarJogo(mega);
                            System.out.println("Numeros sorteados na Mega: ");
                            for (int k = 0; k < 6; k++) {
                                mega.sortiados.add(sc.nextInt());
                            }
                            for (int l = 0; l < mega.getNum_apostas(); l++) {
                                for (int m = 0; m < 6; m++) {
                                    if (integers.get(l) == mega.sortiados.get(m)) {
                                        cont++;
                                    }
                                }
                            }

                            mega.premio(cont, contas.get(q),c);
                            break;
                        case 2:
                            int cont1 = 0;
                            Lotofacil lotofacil = new Lotofacil();
                            ArrayList<Integer> integers1 = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q1 = sc.nextInt();
                            System.out.println("Digite o numero de apostas (15 a 20): ");
                            lotofacil.setNum_apostas(sc.nextInt(), contas.get(q1),c);
                            System.out.println("Digite as suas apostas: ");
                            for (int j = 0; j < lotofacil.getNum_apostas(); j++) {
                                integers1.add(sc.nextInt());
                            }
                            lotofacil.apostar(c.getNome(), integers1);
                            c.adicionarJogo(lotofacil);
                            System.out.println("Numeros sortiados na Lotofacil: ");
                            for(int n = 0; n < 15; n++){
                                lotofacil.sortiados.add(sc.nextInt());
                            }
                            for (int l = 0; l < lotofacil.getNum_apostas(); l++) {
                                for (int m = 0; m < 15; m++) {
                                    if (integers1.get(l) == lotofacil.sortiados.get(m)) {
                                        cont1++;
                                    }
                                }
                            }

                            lotofacil.premio(cont1, contas.get(q1),c);
                            break;
                        case 3:
                            int cont2 = 0;
                            Quina quina = new Quina();
                            ArrayList<Integer> integers2 = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q3 = sc.nextInt();
                            System.out.println("Digite o numero de apostas (5 a 15): ");
                            quina.setNum_apostas(sc.nextInt(), contas.get(q3),c);
                            System.out.println("Digite as suas apostas: ");
                            for (int j = 0; j < quina.getNum_apostas(); j++) {
                                integers2.add(sc.nextInt());
                            }
                            quina.apostar(c.getNome(), integers2);
                            c.adicionarJogo(quina);
                            System.out.println("Numeros sorteados na Quina: ");
                            for (int k = 0; k < 5; k++) {
                                quina.sortiados.add(sc.nextInt());
                            }
                            for (int l = 0; l < quina.getNum_apostas(); l++) {
                                for (int m = 0; m < 5; m++) {
                                    if (integers2.get(l) == quina.sortiados.get(m)) {
                                        cont2++;
                                    }
                                }
                            }
                            quina.premio(cont2, contas.get(q3),c);
                            break;
                        case 4:
                            int cont3 = 0;
                            Lotomania lotomania =  new Lotomania();
                            ArrayList<Integer> integers3 = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q4 = sc.nextInt();
                            System.out.println("Digite as suas 50 apostas: ");
                            for (int j = 0; j < 50; j++) {
                                integers3.add(sc.nextInt());
                            }
                            lotomania.apostar(c.getNome(), integers3);
                            c.adicionarJogo(lotomania);
                            c.pagar(2.50,contas.get(q4));
                            System.out.println("Numeros sorteados na Quina: ");
                            for (int k = 0; k < 20; k++) {
                                lotomania.sortiados.add(sc.nextInt());
                            }
                            for (int l = 0; l < 50; l++) {
                                for (int m = 0; m < 20; m++) {
                                    if (integers3.get(l) == lotomania.sortiados.get(m)) {
                                        cont3++;
                                    }
                                }
                            }
                            lotomania.premio(cont3, contas.get(q4),c);
                            break;
                        case 5:
                            int cont4 = 0;
                            Timemania timemania = new Timemania();
                            ArrayList<Integer> integers4 = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q5 = sc.nextInt();
                            System.out.println("Digite as suas 10 apostas: ");
                            for (int j = 0; j < 10; j++) {
                                integers4.add(sc.nextInt());
                            }
                            System.out.println("Digite o nome do time em que se deseja apostar: ");
                            timemania.setNomeTime(sc.nextLine());
                            sc.nextLine();
                            timemania.apostar(c.getNome(), integers4);
                            c.pagar(3.00,contas.get(q5));
                            c.adicionarJogo(timemania);
                            System.out.println("Numeros sorteados na Timemania: ");
                            for (int k = 0; k < 7; k++) {
                                timemania.sortiados.add(sc.nextInt());
                            }
                            System.out.println("Time sorteado: ");
                            timemania.setTimeSorteado(sc.nextLine());
                            sc.nextLine();
                            for (int l = 0; l < 10; l++) {
                                for (int m = 0; m < 7; m++) {
                                    if (integers4.get(l) == timemania.sortiados.get(m)) {
                                        cont4++;
                                    }
                                }
                            }
                            timemania.premio(cont4, contas.get(q5),c);
                            break;
                        case 6:
                            int cont5 = 0;
                            int con1 = 0;
                            DuplaSena duplaSena = new DuplaSena();
                            ArrayList<Integer> integersS1 = new ArrayList<>();
                            ArrayList<Integer> sortiados2 = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q6 = sc.nextInt();
                            System.out.println("Digite o numero de apostas (6 a 15): ");
                            duplaSena.setNum_apostas(sc.nextInt(), contas.get(q6),c);
                            System.out.println("Digite as suas apostas: ");
                            for (int j = 0; j < duplaSena.getNum_apostas(); j++) {
                                integersS1.add(sc.nextInt());
                            }
                            duplaSena.apostar(c.getNome(), integersS1);
                            c.adicionarJogo(duplaSena);
                            System.out.println("Numeros sorteados no primeiro sorteio: ");
                            for (int k = 0; k < 6; k++) {
                                duplaSena.sortiados.add(sc.nextInt());
                            }
                            System.out.println("Numeros sorteados no segundo sorteio: ");
                            for (int k = 0; k < 6; k++) {
                                sortiados2.add(sc.nextInt());
                            }
                            System.out.println();
                            System.out.println("Resultado do primeiro sorteio: ");
                            for (int l = 0; l < duplaSena.getNum_apostas(); l++) {
                                for (int m = 0; m < 6; m++) {
                                    if (integersS1.get(l) == duplaSena.sortiados.get(m)) {
                                        cont5++;
                                    }
                                }
                            }
                            duplaSena.premio(cont5, contas.get(q6),c);
                            System.out.println();
                            System.out.println("Resultado do segundo sorteio: ");
                            for (int l = 0; l < duplaSena.getNum_apostas(); l++) {
                                for (int m = 0; m < 6; m++) {
                                    if (integersS1.get(l) == sortiados2.get(m)) {
                                        con1++;
                                    }
                                }
                            }
                            duplaSena.premio(con1, contas.get(q6),c);
                            break;
                        case 7:
                            int cont6 = 0;
                            int con2 = 0;
                            MaisMilionaria maisMilionaria = new MaisMilionaria();
                            ArrayList<Integer> integers7 = new ArrayList<>();
                            ArrayList<Integer> trevos = new ArrayList<>();
                            ArrayList<Integer> trevos_sorteados = new ArrayList<>();
                            System.out.println("Digite a conta que será utilizada para o pagamento: ");
                            int q7 = sc.nextInt();
                            System.out.println("Digite as suas 6 apostas em dezenas: ");
                            for (int j = 0; j < 6; j++) {
                                integers7.add(sc.nextInt());
                            }
                            maisMilionaria.apostar(c.getNome(), integers7);
                            c.adicionarJogo(maisMilionaria);
                            System.out.println("Digite as suas 2 apostas em trevos: ");
                            for (int k = 0; k < 2; k++) {
                                trevos.add(sc.nextInt());
                            }
                            System.out.println("Numeros sorteados no sorteio: ");
                            for (int k = 0; k < 6; k++) {
                                maisMilionaria.sortiados.add(sc.nextInt());
                            }
                            System.out.println("Trevos sorteados no sorteio: ");
                            for (int k = 0; k < 2; k++) {
                                trevos_sorteados.add(sc.nextInt());
                            }
                            for (int l = 0; l < 6; l++) {
                                for (int m = 0; m < 2; m++) {
                                    if (integers7.get(l) == maisMilionaria.sortiados.get(m)) {
                                        cont6++;
                                    }
                                }
                            }
                            for (int d = 0; d < 2; d++) {
                                for (int s = 0; s < 2; s++) {
                                    if (trevos.get(d) == trevos_sorteados.get(s)) {
                                        con2++;
                                    }
                                }
                            }
                            maisMilionaria.setAcertos_trevos(con2);
                            maisMilionaria.premio(cont6,contas.get(q7),c);
                            break;
                        default:
                            System.out.println("Opção invalida!");
                            break;
                    }
                case 6:
                    System.out.println("**** JOGOS DO CLIENTE ****");
                    c.mostraJogos();
                    break;
                case 7:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }
    }
}