import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("USD coin options: dollar, half dollar, quarter, dime, nickel, penny");
        System.out.println("EUR coin options: two euro, one euro, fifty cent euro, twenty cent euro, ten cent euro, five cent euro, two cent euro, euro cent");
        System.out.println("What coin?");
        String s = kb.nextLine();
        mintFactory m = new mintFactory();
        EFactory e = new EFactory();
        Coin c = m.makeCoin(s);
        
        if (c == null) {
            c = e.makeCoin(s);
            if(c == null) {
                System.out.println("no coin");
            }
            System.out.println(c.toString());
        }
        else {
            //Coin coin = new Coin(c.super.getCountryCode(), c.super.getDemonination(),
            //    c.super.getCommonName(), c.super.getSpecs());
            System.out.println(c.toString());
        }
    }
}