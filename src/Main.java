import Entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employes = new LinkedList<>();
        employes.add(new Employee(1,"yasin","ermusmula"));
        employes.add(new Employee(1,"yasin","ermusmula"));
        employes.add(new Employee(2,"ali","veli"));
        employes.add(new Employee(2,"ahmet","mehmet"));
        employes.add(new Employee(3,"hasan","huseyin"));
        employes.add(new Employee(3,"mahmut","tarkan"));
        employes.add(new Employee(4,"hande","er"));
        employes.add(new Employee(4,"sevim","dert"));

        List<Employee> removedEmploye = new ArrayList<>();
        Map<Integer,Employee> employeeMap = new HashMap<>();

        Iterator<Employee> iterator = employes.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee == null){
                System.out.println("null data buldum");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())){
                removedEmploye.add(employee);
                iterator.remove();
            }
            else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println("mevcut:");
        System.out.println(employes);
        System.out.println("tekiller: ");
        System.out.println(employeeMap);
        System.out.println("silinenler: ");
        System.out.println(removedEmploye);

    }
}