import java.util.Objects;

public class Employee {
    //Переменные с данными сотрудника
    private static int counter;
    private String personFIO;
    private int departament;
    private int salary;
    private int id;

    //Конструктор
    public Employee(String personFIO, int departament, int salary) {
        this.personFIO = personFIO;
        this.departament = departament;
        this.salary = salary;
        id = counter++;
    }

    // Для получения информации сотрудника
    public String getPersonFIO() {
        return personFIO;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    //Для изменения информации сотрудника
    public String setPersonFIO(String personFIO) {
        return this.personFIO;
    }

    public int setDepartament(int departament) {
        return this.departament;
    }

    public int setSalary(int salary) {
        return this.salary;
    }

    //Контракты
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && salary == employee.salary && id == employee.id && Objects.equals(personFIO, employee.personFIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personFIO, departament, salary, id);
    }

    @Override
    public String toString() {
        return "Сотрудник :" +
                " (ФИО)" + personFIO + '\'' +
                ", Департамент №" + departament +
                ", зарпалата сотрудника= " + salary +
                ", ID" + id +
                '.';
    }

}

