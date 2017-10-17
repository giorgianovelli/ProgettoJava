public class Conto {

    private String iban, cf;
    private double saldo;

    public String getCf() {
        return cf;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    //costruttore
    public Conto(String i, String c){
        iban = i;

        cf = c;

    }

    public boolean preleva(double num){
        if(num <= saldo) {
            saldo -= num;
            return true;
        }
        else
            return false;
    }

    public boolean deposita(double num){
        saldo+=num;
        return true;
    }
}
