// CALCULA EL SALARIO DE UN TRABAJADOR

public class CalculoSalario {

    public static void main(String[] args) {

        int horasTrabajadas = 48;
        double tarifa = 30;
        double salario;

        //calculo del sueldo
        if (horasTrabajadas > 40) {
            int horasExtra = horasTrabajadas - 40; //cantidad de horas extra
            double tarifaExtra = tarifa * 1.5; //aumento un 50% el precio/hora
            salario = (40 * tarifa) + (horasExtra * tarifaExtra);
        } else {
            salario = horasTrabajadas * tarifa; // si las horas son 40 o menos, se calcula normal el sueldo
        }
        System.out.println("Sueldo del trabajador: " + salario);
    }
}
