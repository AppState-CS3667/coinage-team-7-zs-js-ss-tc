public class USDMint extends Factory {
    public Coin make_coin(double denomination) {
        Coin coin = get_coin(denomination);
        if (coin.get_country_code() != "USD") return coin;
        if (!coin.smelt() || !coin.buff() || !coin.smooth() || !coin.inspect()) {
            return new NullCoin();
        }
        return coin;
    }
    public Coin get_coin(double denomination) {
        switch ((int)(denomination * 100)) {
            case 100:   return new DollarCoin();
            case 50:    return new HalfDollar();
            case 25:    return new Quarter();
            case 10:    return new Dime(); 
            case 5:     return new Nickel();
            case 1:     return new Penny();
            default:    return new NullCoin();
        }
    }
}