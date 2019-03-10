package Functioninterface.fuctionInterfacce;

import java.util.Arrays;
import java.util.List;

public interface Util {
    static List<Employee> populate() {
        Employee e1 = new Employee("Arun", 1000);
        Employee e2 = new Employee("Brun", 2000);
        Employee e3 = new Employee("Crun", 3000);
        Employee e4 = new Employee("Drun", 4000);
        return Arrays.asList(e1, e2, e3, e4);
    }
}
