public class EFactory {
    public static Coin makeCoin(String type) {
        switch(type) {
            case "two euro":
                return new TwoEuro();
            case "one euro" :
                return new oneEuro();
            case "fifty cent euro":
                return new fiftyEuroCent();
            case "twenty cent euro":
                return new twentyEuroCent();
            case "ten cent euro":
                return new tenEuroCent();
            case "five cent euro":
                return new fiveEuroCent();
            case "two cent euro":
                return new twoEuroCent();
            case "euro cent":
                return new euroCent();
            default :
                return null;
        }
    }  
}