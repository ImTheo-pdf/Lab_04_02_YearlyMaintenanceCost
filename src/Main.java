//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double springMaintenanceCost = 150.00;
        double summerMaintenanceCost = 300.00;
        double fallMaintenanceCost = 125.00;
        double winterMaintenanceCost = 400.00;
        double totalMaintenanceCost;

        totalMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        System.out.println("Spring Maintenance Cost: $" + springMaintenanceCost);
        System.out.println("Summer Maintenance Cost: $" + summerMaintenanceCost);
        System.out.println("Fall Maintenance Cost: $" + fallMaintenanceCost);
        System.out.println("Winter Maintenance Cost: $" + winterMaintenanceCost);
        System.out.println("Total yearly Maintenance Cost: $" + totalMaintenanceCost);
    }
}