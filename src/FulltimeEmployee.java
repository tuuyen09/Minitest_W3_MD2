import java.util.Comparator;

public class FulltimeEmployee extends Employee implements Comparable<Employee> {
    private double bonus;
    private double fine;
    private double hardSalary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(double bonus, double fine, double hardSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public double salary() {
        return getHardSalary() + getBonus() - getFine();
    }



    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", hardSalary=" + hardSalary +
                '}';
    }



    @Override
    public int compareTo(Employee o) {
        if (salary() > o.salary()) {
            return 1;
        }
        if (salary() < o.salary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
