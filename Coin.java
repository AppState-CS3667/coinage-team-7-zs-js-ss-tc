import java.util.Random;

public abstract class Coin {
    private String country_code;
    private double denomination;
    private String common_name;
    private String smelting_specs;
    private Random rng = new Random(696969);
    private double chance_of_failure = 1/12;

    public Coin(String country_code, double denomination, String common_name, String smelting_specs) {
        this.country_code = country_code;
        this.denomination = denomination;
        this. common_name = common_name;
        this.smelting_specs = smelting_specs;
    }


    public double getDemonination() {
        return demonination;
    }
    public String getCountryCode() {
        return country_code;
    }
    public String getCommonName() {
        return common_name;
    }
    public String getSpecs() {
        return smelting_specs;
    }

    public String smelt() {
        String str;
        if (rng.nextFloat() >= (1/1000)) { /*success*/
            str = ("Successfully smelted the " + common_name + "coin");
        } else { /*failure*/
            str = ("Failed in smelting");

        }
        return str;
    }


    public String inspect() {
        String str;
        if (rng.nextFloat() >= (1/12)) { /*success*/
            str = ("Successfully inspected the " + common_name + "coin");
        } else { /*failure*/
            str = ("Failed in inpecting");

        }
        return str;
    }


    public String smooth() {
        String str;
        if (rng.nextFloat() >= (1/1000)) { /*success*/
            str = ("Successfully smoothed the " + common_name + "coin");
        } else { /*failure*/
            str = ("Failed in smoothing");

        }
        return str;
    }


    public String buff() {
        String str;
        if (rng.nextFloat() >= (1/1000)) { /*success*/
            str = ("Successfully buffed the " + common_name + "coin");
        } else { /*failure*/
            str = ("Failed in buffing");
        }
        return str;
    }

    public String toString() {
        String str = "coin Information: " + getCountryCode() + ", " + getDemonination() + ", " 
            + getCommonName() + ", " + getSpecs() + ".";
        String addOns = "";
        String smelt = smelt();
        String inspect = inspect();
        String smooth = smooth();
        String buff = buff();
        if (smelt.equals("Failed in smelting")) {
            addOns = addOns + " \n" + smelt;
        }
        else if(inspect.equals("Failed in inpecting")) {
            addOns = addOns + " \n" + smelt + " \n" + inspect;
        }
        else if(smooth.equals("Failed in smoothing")) {
            addOns = addOns + " \n" + smelt + " \n" + inspect + " \n" + smooth;
        }
        else {
            addOns = addOns + " \n" + smelt + " \n" + inspect + " \n" + smooth + " \n" + buff;

        }
        
        return str + addOns;
    }
}
