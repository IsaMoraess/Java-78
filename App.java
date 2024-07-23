import java.util.Locale;
import java.util.Scanner;
    public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funci.Empregado emp = new funci.Empregado();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();

        System.out.print("Salario Bruto: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + emp);
        System.out.println();

        System.out.print("Percentual de aumento salárial? ");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Dados atualizado: " + emp);

    } 
}
