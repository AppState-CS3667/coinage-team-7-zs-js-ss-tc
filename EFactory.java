public class EFactory {
    public static Coin makeCoin(String type) {
        switch(type) {
            case "two euro":
                return new TwoEuro();
            case "one euro" :
                return new oneEuro();
            case "fifty cent euro":
                return new fiftyEuroCent();
            case "twenty euro cent":
                return new twentyEuroCent();
            case "ten euro cent":
                return new tenEuroCent();
            case "five euro cent":
                return new fiveEuroCent();
            case "two euro cent":
                return new twoEuroCent();
            case "euro cent":
                return new euroCent();
            default :
                return null;
        }
    }  
}