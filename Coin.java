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

    String get_country_code() {
        return country_code;
    }

    double get_denomination(){
        return denomination;
    }

    String get_common_name(){
        return common_name;
    }

    String get_smelting_specs(){
        return smelting_specs;
    }

    boolean smelt() {
        if (rng.nextFloat() >= chance_of_failure) { /*success*/
            System.out.println("Successfully smelted the " + common_name + "coin");
            return true;
        } else { /*failure*/
            System.out.println("Failed in smelting");
            return false;
        }
    }

    boolean inspect() {
        if (rng.nextFloat() >= chance_of_failure) { /*success*/
            System.out.println("Successfully inspected the " + common_name + "coin");
            return true;
        } else { /*failure*/
            System.out.println("Failed in inpecting");
            return false;
        }
    }

    boolean smooth() {
        if (rng.nextFloat() >= chance_of_failure) { /*success*/
            System.out.println("Successfully smoothed the " + common_name + "coin");
            return true;
        } else { /*failure*/
            System.out.println("Failed in smoothing");
            return false;
        }
    }

    boolean buff() {
        if (rng.nextFloat() >= chance_of_failure) { /*success*/
            System.out.println("Successfully buffed the " + common_name + "coin");
            return true;
        } else { /*failure*/
            System.out.println("Failed in buffing");
            return false;
        }
    }
}