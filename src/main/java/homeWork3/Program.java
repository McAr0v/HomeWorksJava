package homeWork3;

public class Program {

    public static void main(String[] args) {

        // Создаем новый связный список сотрудников
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();

        // Добавляем несколько значений
        employeeLinkedList.addFirst(new Employee("Егор", 32));
        employeeLinkedList.addFirst(new Employee("Жанна", 33));
        employeeLinkedList.addFirst(new Employee("Петр", 61));
        employeeLinkedList.addFirst(new Employee("Ольга", 60));

        // Выводим изначальную версию связного списка в консоль
        System.out.println(employeeLinkedList);
        System.out.println();

        // Переворачиваем список
        employeeLinkedList.revert();

        // Выводим перевернутую версию связного списка в консоль
        System.out.println(employeeLinkedList);
        System.out.println();

    }

}
