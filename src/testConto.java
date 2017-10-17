public class testConto {
    public static void main(String[] args) {
        Conto c1=null;
        c1= new Conto("iban1","cf1");

        if(c1.deposita(100)){
            System.out.println("saldo="+c1.getSaldo());
        }
        else
            System.out.println("deposito non eseguito");


        if(c1.preleva(100)){
            System.out.println("saldo="+c1.getSaldo());
        }
        else
            System.out.println("prelievo non eseguito");

    }
}
