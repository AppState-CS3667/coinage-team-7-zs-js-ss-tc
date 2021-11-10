public class DollarCoin extends Coin {
    public DollarCoin() {
        super("USD", 1.00, "Dollar", "88.5% Cu 6% Zi 3.5% Mn 2% Ni");
    }

    public String toString() {
        String str = "coin Information: " + super.getCountryCode() + ", " + super.getDemonination() + ", " 
            + super.getCommonName() + ", " + super.getSpecs() + ".";
        String addOns = "";
        String smelt = super.smelt();
        String inspect = super.inspect();
        String smooth = super.smooth();
        String buff = super.buff();
        if (smelt.equals("Failed in smelting")) {
            addOns = addOns + smelt;
        }
        else if(inspect.equals("Failed in inpecting")) {
            addOns = addOns + smelt + " " + inspect;
        }
        else if(smooth.equals("Failed in smoothing")) {
            addOns = addOns + smelt + " " + inspect + " " + smooth;
        }
        else {
            addOns = addOns + smelt + " " + inspect + " " + smooth + " " + buff;
        }
        
        return str + addOns;
    }
}