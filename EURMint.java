public class EURMint extends Factory {
    public Coin make_coin(double denomination) {
        Coin coin = get_coin(denomination);
        if (coin.get_country_code() != "EUR") return coin;
        if (!coin.smelt() || !coin.buff() || !coin.smooth() || !coin.inspect()) {
            return new NullCoin();
        }
        return coin;
    }
    public Coin get_coin(double denomination) {
        switch ((int)(denomination * 100)) {
            case 200:   return new TwoEuro();
            case 100:   return new OneEuro();
            case 50:    return new FiftyEuroCent();
            case 20:    return new TwentyEuroCent();
            case 10:    return new TenEuroCent(); 
            case 5:     return new FiveEuroCent();
            case 2:     return new TwoEuroCent();
            case 1:     return new EuroCent();
            default:    return new NullCoin();
        }
    }
}