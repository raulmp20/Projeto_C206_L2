import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public static void escrever (Conta conta){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEScrever;

        try{

            os = new FileOutputStream("Arquivo.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Conta");
            bw.newLine();
            bw.write(conta.getSaldo() + "\n");
            bw.write(conta.getLimite() + "\n");

        }catch(Exception e){

            System.out.println(e);

        }finally{

            try{
                bw.close();
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }


    public static ArrayList<Conta> ler(){

        ArrayList<Conta> contas = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("Conta")){
                    Conta c = new Conta();
                    c.setSaldo(Double.parseDouble(br.readLine()));
                    c.setLimite(Double.parseDouble(br.readLine()));
                    contas.add(c);
                }
                linhaLer = br.readLine();
            }

        }catch(Exception e){
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }

        return contas;
    }
}
