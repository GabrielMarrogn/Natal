import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int mes = sc.nextInt();
            int dia = sc.nextInt();

            LocalDate d1 = LocalDate.of(2016, mes, dia);
            LocalDate d2 = LocalDate.of(2016, 12, 25);

            long diferenca = ChronoUnit.DAYS.between(d1, d2);

            if (dia > 25 && mes == 12) {
                System.out.println("Ja passou!");
            } else if (dia == 25 && mes == 12) {
                System.out.println("E natal!");
            } else if (dia == 24 && mes == 12) {
                System.out.println("E vespera de natal!");
            } else {
                System.out.println("Faltam " + diferenca + " dias para o natal!");
            }
        }

        sc.close();
    }
}
