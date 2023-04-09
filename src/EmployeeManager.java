import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public double average() {
        double average = 0;
        for (var i : employees) {
            average += i.salary() / employees.size();
        }
        return average;
    }

    public ArrayList<Employee> list() {
        ArrayList<Employee> e = new ArrayList<>();
        for (var i : employees) {
            if (i.salary() < average()) {
                e.add(i);
            }
        }
        return e;
    }

    public double totalPartime() {
        double total = 0;
        for (var i : employees) {
            if (i instanceof ParttimeEmployee ) {
                total += i.salary();
            }
        }
        return total;
    }

    public ArrayList<Employee> sortFulltime() {
        ArrayList<Employee> e = new ArrayList<>();
        for (var i : employees) {
            if (i instanceof FulltimeEmployee ) {
                e.add(i);
            }
        }
        return e;
    }
}


