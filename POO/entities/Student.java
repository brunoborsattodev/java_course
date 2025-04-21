package POO.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    double notaMinima = 60.0;
    double notaTotal = grade1 + grade2 + grade3;
    double missingPoints = notaTotal - notaMinima;

    public String checkStudent(){

            if (notaTotal >= notaMinima) {
                return String.format("FINAL GRADE = %.2f\n PASS", notaTotal);
            } else {
                return String.format("FINAL GRADE = %.2f\n FAILED\n MISSING %.2f POINTS", notaTotal, Math.abs(missingPoints));
            }
    }

}
