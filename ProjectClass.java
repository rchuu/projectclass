public class ProjectClass {
    private String name;
    private String description;
    private double initialCost = 0;
    private static String defaultName = "Default NAME";
    private static String defaultDesc = "DEfault DesC";

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return initialCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String ElevatorPitch() {
        return String.format("%s : %s, %s", name, initialCost, description);
    }

    public ProjectClass(String name, String description, double cost) {
        this.name = name;
        this.initialCost = cost;
        this.description = description;
    }

    public ProjectClass(String name) {
        this.name = name;
        this.description = defaultDesc;
    }

    public ProjectClass() {
        name = defaultName;
        description = defaultDesc;
    }
}