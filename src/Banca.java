public class Banca {
    private String nome, radiceIban;
    private int numMax, numAttivi;
    private Conto[] c;
    private int contiInseriti;

    public Banca(String nomeBanca, int num){
        nome = nomeBanca;
        numMax = num;
        c = new Conto[numMax];
        contiInseriti = 0;

    }


    public int aggiungiConto(String iban, String cf, double saldo){

        int i;
        String rif=radiceIban + iban;
        c[i]=new Conto(rif, cf);
        return i;

    }

    public double totaleSaldi(){

    }

    public boolean operazione(){

    }


}
