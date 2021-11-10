public class mintFactory {
    public static Coin makeCoin(String type) {
        switch(type) {
            case "dollar":
                return new DollarCoin();
            case "half dollar" :
                return new halfDollar();
            case "quarter":
                return new quarter();
            case "dime":
                return new dime();
            case "nickel":
                return new nickel();
            case "penny":
                return new penny();
            default :
                return null;
        }
    }  
}