public class ProjectClass {
    public String name;
    public String description;
    public int initialCost = 0;
    public static String defaultName = "Default Name for Project";
    public static String defaultDescription = "Default Description for Project";

    public String getName() {
        System.out.println("Project name is: " + name);
    }

    public String getDescription() {
        System.out.println("Project description is: " + description);
    }

    public String getInitialCost() {
        System.out.println("Project initial cost is: " + initialCost);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String elevatorPitch() {
        return String.format("%s: %s: %d", name, description, initialCost);
    }

    public ProjectClass(String name, String description, int initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public ProjectClass(String name) {
        this.name = name;
        this.description = defaultDescription;
    }

    public ProjectClass() {
        name = defaultName;
        description = defaultDescription;
    }
}