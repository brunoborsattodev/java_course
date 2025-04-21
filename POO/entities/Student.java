package POO.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double notaTotal() {
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (notaTotal() < 60.0) {
            return 60.0 - notaTotal();
        } else {
            return 0;
        }
    }

    public String checkStudent() {

        if (notaTotal() >= 60.0) {
            return String.format("FINAL GRADE = %.2f\n PASS", notaTotal());
        } else {
            return String.format("FINAL GRADE = %.2f\n FAILED\n MISSING %.2f POINTS", notaTotal(), missingPoints());
        }
    }

}


