public class Tester {
    public static void main(String[] args) {
        // Crea due istanze di Employee
        Employee employee1 = new Employee("John Doe", 1001);
        Employee employee2 = new Employee("Jane Smith", 1002);

        // Crea due istanze di Badge
        Badge badge1 = new Badge(1, "Livello 1");
        Badge badge2 = new Badge(2, "Livello 2");

        // Assegna i badge ai dipendenti
        employee1.assignBadge(badge1);
        employee2.assignBadge(badge2);

        // Mostra i dettagli dei badge dei dipendenti
        System.out.println("Dettagli dei badge dei dipendenti:");
        System.out.println("Employee 1: " + employee1.getName() + ", ID: " + employee1.getEmployeeId());
        System.out.println("ID Badge: " + employee1.getBadge().getBadgeId() + ", Livello di Accesso: " + employee1.getBadge().getAccessLevel());
        System.out.println();
        System.out.println("Employee 2: " + employee2.getName() + ", ID: " + employee2.getEmployeeId());
        System.out.println("ID Badge: " + employee2.getBadge().getBadgeId() + ", Livello di Accesso: " + employee2.getBadge().getLivelloAccesso());
    }
}
