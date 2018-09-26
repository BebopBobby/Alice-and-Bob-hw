package justiceleague;

public class SuperHero {
    protected String name;
    private String[] powers;

    public SuperHero(String name, String[] powers) {
        this.name = name;
        this.powers = powers;
    }

    public String printSuperPowers(){
        String pah = "";
        for(String bluh : powers) {
            pah += bluh;
        }
        return pah;
    }
}
