import java.util.ArrayList;

public class PortfolioClass {
    public ArrayList<ProjectClass> Projects;

    public PortfolioClass() {
        this.Projects = new ArrayList<ProjectClass>();
    }

    public void AddToPortfolio(ProjectClass p) {
        Projects.add(p);
    }

    public String getPortfolio() {
        return Projects.toString();
    }

    public void showPortfolio() {
        double total = 0;
        for (ProjectClass p : Projects) {
            total += p.getCost();
            System.out.println(p.ElevatorPitch());
        }
        System.out.println(String.format("Total Cost: %f", total));

    }
}