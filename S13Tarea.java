package s13tarea;

import java.util.Scanner;

public class S13Tarea {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Calculadora de salario por semana");
        double horasT;
        System.out.println("Ingrese sus horas trabajadas:");
        horasT = tc.nextDouble();
        double pago;
        System.out.println("ingrese el pago por cada hora");
        pago = tc.nextDouble();
        double salarioTotal = (calcularSalario (horasT, pago));
        System.out.println("El pago total es: $" + salarioTotal);
         tc.close();
    }
public static double calcularSalario(double horasT, double pago){
double total= (horasT * pago);
return total;
}
}
