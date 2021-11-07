import java.util.Random;

public abstract class Coin {
    private String country_code;
    private double demonination;
    private String common_name;
    private String smelting_specs;
    private Random rng = new Random(696969);

    public Coin(String country_code, double demonination, String common_name, String smelting_specs) {
        this.country_code = country_code;
        this.demonination = demonination;
        this. common_name = common_name;
        this.smelting_specs = smelting_specs;
    }

    void smelt() {
        if (rng.nextFloat() >= (1/12)) { /*success*/
            System.out.println("Successfully smelted the " + common_name + "coin");
        } else { /*failure*/
            System.out.println("Failed in smelting");
        }
    }

    void inspect() {
        if (rng.nextFloat() >= (1/12)) { /*success*/
            System.out.println("Successfully inspected the " + common_name + "coin");
        } else { /*failure*/
            System.out.println("Failed in inpecting");
        }
    }

    void smooth() {
        if (rng.nextFloat() >= (1/12)) { /*success*/
            System.out.println("Successfully smoothed the " + common_name + "coin");
        } else { /*failure*/
            System.out.println("Failed in smoothing");
        }
    }

    void buff() {
        if (rng.nextFloat() >= (1/12)) { /*success*/
            System.out.println("Successfully buffed the " + common_name + "coin");
        } else { /*failure*/
            System.out.println("Failed in buffing");
        }
    }
}