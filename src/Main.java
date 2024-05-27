import java.util.Arrays;

public class Main {
    private static final Employee[] employees = new Employee[10];


    private static Employee[] printEmployees(Employee[] employees) {
        return employees;
    }

    private static int sumSalary(Employee[] employees) {
        int sumSalary = 0;

        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    //3.Найти сотрудника с минимальной ЗП;
    private static int detectMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();

        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;

    }

    //4.Найти сотрудника с максимальной ЗП;
    private static int detectMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();

        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    //5.Подсчитать среднее значение зарплат;
    private static int calculateAverageSalary(Employee[] employees) {
        int sumSalaries = sumSalary(employees);
        return sumSalaries / employees.length;
    }

    private static String[] printFullNamePerson(Employee[] employees) {
        String[] employeeName = new String[employees.length];

        for (int i = 0; i < employees.length; i++) {
            employeeName[i] = employees[i].getPersonFIO();
        }
        return employeeName;
    }


    private static String[] indexSalary(Employee[] employees) {
        double salaryWithIndex;
        double magnificationFactor = 1.1123;

        String[] indexes = new String[employees.length];

        for (int i = 0; i < employees.length; i++) {
            salaryWithIndex = (employees[i].getSalary()) * magnificationFactor;
            indexes[i] = "Сотрудник: " + employees[i].getPersonFIO() + " получил зп с индексацией: " + salaryWithIndex;
        }

        return indexes;
    }

    private static String minSalaryDepartament(int department) {
        int minSalary = 0;
        String worker = null;
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                minSalary = employees[0].getSalary();
                worker = employees[0].getPersonFIO();
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    worker = employee.getPersonFIO();
                }
            }

        }
        return "Сотрудник " + worker + " с минимальной зарплатой " + minSalary;
    }

    private static String maxSalaryDepartament(int department) {
        int maxSalary = 0;
        String worker = null;
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                maxSalary = employees[0].getSalary();
                worker = employees[0].getPersonFIO();
            }
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                worker = employee.getPersonFIO();
            }
        }
        return "Сотрудник " + worker + " с максимальной зарплатой " + maxSalary;
    }

    private static String sumSalaryDepartament(int department) {
        int sumSalary = 0;
        int numberDepartament = 0;

        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                sumSalary += employee.getSalary();
                numberDepartament = employees[0].getDepartament();
            }
        }
        return "Номер департамента № " + numberDepartament + " c суммой зарплат равной " + sumSalary;
    }

    private static int sumSalaryDepartamentForPattern(int department) {
        int sumSalary = 0;

        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                sumSalary += employee.getSalary();
            }
        }
        return sumSalary;
    }

    private static String calculateAverageSalaryDepartament(int department) {
        int numberDepartament = 0;
        int sumSalary = sumSalaryDepartamentForPattern(1);
        int numberEmployees = countingNumberEmployees(1);
        for (Employee employee : employees) {
            if (employee.getDepartament() == department) {
                numberDepartament = employees[0].getDepartament();
//                numberPeople=employees.length;
            }

        }
        return "Номер департамента № " + numberDepartament + " cо средней зарплатой по сотрудникам " + sumSalary / numberEmployees;
    }

    private static int countingNumberEmployees(int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == department ) {
                count++;
            }
        }
        return count;
    }

    private static int countingNumberEmployees2(int[] array) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    private static String[] indexSalaryDepartament(int department, double magnificationFactor) {
        String[] indexes = new String[employees.length];
        int numberDepartament = 0;
        int salaryWithIndex = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == department) {
                numberDepartament = employees[0].getDepartament();
                salaryWithIndex = (int) ((employees[i].getSalary()) * magnificationFactor);
                indexes[i] = "Сотрудник: " + employees[i].getPersonFIO() + " из департамента № " + numberDepartament + " c проиндексированной зарпалтой равной " + salaryWithIndex;
            }


        }
        return indexes;
    }

    private static String[] printFullNamePersonDepartament(int departament) {
        String[] printFullName = new String[employees.length];
        String fio = null;
        int id = 0;
        int salary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament && employees[i] != null) {
                fio = employees[i].getPersonFIO();
                id = employees[i].getId();
                salary = employees[i].getSalary();
                printFullName[i] = "ID = " + id + "," + " Сотрудник: " + fio + " c  зарпалтой равной " + salary;
            }
        }
        return printFullName;
    }

    private static String[] printEmployeeWithSalaryLassNumber(int number) {
        int salary;
        int id;
        String fio;
        String[] printEmployee = new String[employees.length];


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < number && employees[i].getPersonFIO() != null) {
                salary = employees[i].getSalary();
                id = employees[i].getId();
                fio = employees[i].getPersonFIO();
                printEmployee[i] = "ID= " + id + " Сотрудники : " + fio + " с зарпалтой " + salary;
            }
        }
        return printEmployee;
    }

    private static String[] printEmployeeWithSalaryMoreNumber(int number) {
        int salary;
        int id;
        String fio;
        String[] printEmployee = new String[employees.length];
//        String [] aa = Arrays.copyOf(printEmployee, 3);
        for (int i = 0; i < employees.length; i++) {
//            if (printEmployee[i] != null) {
//                continue;
//            }
            if (employees[i].getSalary() > number && printEmployee[i] == null ) {
                salary = employees[i].getSalary();
                id = employees[i].getId();
                fio = employees[i].getPersonFIO();
                printEmployee[i] = "ID= " + id + " Сотрудник : " + fio + " с зарпалтой " + salary;

            }
        }
        return printEmployee;
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

        // Базовый уровень сложности

        System.out.println(Arrays.toString(printEmployees(employees)));
        System.out.println("Сумма зарплат всех сотрудников: " + sumSalary(employees));
        System.out.println("Минимальная зарплата среди всех сотрудников: " + detectMinSalary(employees));
        System.out.println("Максимальная зарплата среди всех сотрудников: " + detectMaxSalary(employees));
        System.out.println("Средняя зарплата всех сотрудников: " + calculateAverageSalary(employees));
        System.out.println(Arrays.toString(printFullNamePerson(employees)));


        // Повышенный уровень сложности

        System.out.println(Arrays.toString(indexSalary(employees)));
        System.out.println(minSalaryDepartament(1));
        System.out.println(maxSalaryDepartament(1));
        System.out.println(sumSalaryDepartament(1));
        System.out.println(calculateAverageSalaryDepartament(1));
//
        System.out.println(Arrays.toString(indexSalaryDepartament(1, 1.111)));
        System.out.println(Arrays.toString(printFullNamePersonDepartament(1)));
        System.out.println(Arrays.toString(printEmployeeWithSalaryLassNumber(80000)));
        System.out.println((Arrays.toString(printEmployeeWithSalaryMoreNumber(130000))));

    }
}