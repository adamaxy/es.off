import java.util.Random;

class Employee {
    String name;
    String surname;
    String address;

    // Costruttore
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }

    // Metodo per ottenere i dettagli dell'Employee
    public String getEmployeeDetails() {
        return "Nome: " + name + "\nCognome: " + surname + "\nIndirizzo: " + address;
    }
}

class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    // Metodo statico per tenere traccia del numero di dipendenti
    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    // Metodo privato per generare il codice del badge
    private String generateBadgeIdCode() {
        String randomCode1 = generateRandomString(3);
        String randomCode2 = generateRandomString(3);
        return randomCode1 + employee.name + employee.surname + randomCode2;
    }

    // Metodo pubblico per mostrare i dettagli del badge
    public void showBadgeDetails() {
        System.out.println("Numero totale di dipendenti tracciati dai badge: " + totalNumberOfEmployees);
        System.out.println("Dettagli dipendente:\n" + employee.getEmployeeDetails());
        System.out.println("Codice Badge: " + badgeIdCode);
    }

    // Metodo privato per generare una stringa casuale di lunghezza specificata
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString.toString();
    }

    // Costruttore
    public Badge(Employee employeeThatNeedsBadge) {
        employee = employeeThatNeedsBadge;
        keepTrackOfEmployeesNumber();
        badgeIdCode = generateBadgeIdCode();
    }
}

public class BadgeTester {
    public static void main(String[] args) {
        // Creazione di due nuovi oggetti Employee
        Employee employee1 = new Employee("John", "Doe", "Via Roma 123");
        Employee employee2 = new Employee("Alice", "Smith", "Piazza Italia 7");

        // Creazione di due nuovi oggetti Badge per gli Employee
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        // Mostra i dettagli dei badge degli Employee
        System.out.println("Dettagli Badge Dipendente 1:");
        badge1.showBadgeDetails();

        System.out.println("\nDettagli Badge Dipendente 2:");
        badge2.showBadgeDetails();
    }
}