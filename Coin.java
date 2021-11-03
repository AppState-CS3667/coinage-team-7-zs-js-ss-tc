public abstract class Coin {
    private String country_code;
    private double demonination;
    private String common_name;
    private String smelting_specs;

    public Coin(String country_code, double demonination, String common_name, String smelting_specs) {
        this.country_code = country_code;
        this.demonination = demonination;
        this. common_name = common_name;
        this.smelting_specs = smelting_specs;
    }
}