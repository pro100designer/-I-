import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];


    private static Employee[] printEmployees(Employee[] employees) {
        return employees;
    }

    public static int sumSalary(Employee[] employees) {
        int sumSalary = 0;

        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    //3.Найти сотрудника с минимальной ЗП;
    public static int detectMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();

        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;

    }

    //4.Найти сотрудника с максимальной ЗП;
    public static int detectMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();

        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    //5.Подсчитать среднее значение зарплат;
    public static int calculateAverageSalary(Employee[] employees) {
        int sumSalaries = sumSalary(employees);
        return sumSalaries / employees.length;
    }


    public static String[] printFullNamePerson(Employee[] employees) {
        String[] employeeName = new String[employees.length];

        for (int i = 0; i < employees.length; i++) {
            employeeName[i] = employees[i].getPersonFIO();
        }
        return employeeName;
    }


    public static void main(String[] args) {
        //Список сотрудников
        employees[0] = new Employee("Козин Александр Алексеевич", 1, 150000);
        employees[1] = new Employee("Иванов Константин Олегович", 2, 123000);
        employees[2] = new Employee("Опарин Константин Александрович", 1, 149000);
        employees[3] = new Employee("Ефимов Дмитрий Александрович", 3, 123400);
        employees[4] = new Employee("Антонюк Эдуард Вячеславович", 5, 80000);
        employees[5] = new Employee("Зайцев Павел Павлович", 4, 123000);
        employees[6] = new Employee("Федоренко Захар Денисович", 4, 111000);
        employees[7] = new Employee("Ложкин Кирилл Алексеевич", 2, 15000);
        employees[8] = new Employee("Медведев Дмитрий Евгеньевич", 3, 13200);
        employees[9] = new Employee("Кукушкин Максим Федорович", 1, 65000);

        //1.Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))
        System.out.println(Arrays.toString(printEmployees(employees)));
        System.out.println("Сумма зарплат всех сотрудников: " + sumSalary(employees));
        System.out.println("Минимальная зарплата среди всех сотрудников: " + detectMinSalary(employees));
        System.out.println("Максимальная зарплата среди всех сотрудников: " + detectMaxSalary(employees));
        System.out.println("Средняя зарплата всех сотрудников: " + calculateAverageSalary(employees));
        System.out.println(Arrays.toString(printFullNamePerson(employees)));
    }
}