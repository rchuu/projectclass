import java.util.ArrayList;

public class PortfolioClass {
    public ArrayList<ProjectClass> Projects;

    public Portfolio() {
        this.Projects = new ArrayList<ProjectClass>();
    }

    public void AddToPortfolio(Project p) {
        Projects.add(p);
    }

    public String getPortfolio() {
        return Projects.toString();
    }

    public void showPortfolio() {
        double total = 0; // total cost of all projects in portfolio
        for (Project p : Projects) {
            total += p.getInitialCost();
            System.out.println(p.elevatorPitch());
        }
        System.out.println(String.format("Total cost of portfolio: %d", total));
    }
}
