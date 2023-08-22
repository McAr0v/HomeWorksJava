package homeWork3;

/**
 * Связный список
 * @param <T>
 */

public class LinkedList<T> {

    // Указатель на первый элемент
    private Node head;

    // Указатель на последний элемент
    private Node tail;

    /**
     * Узел связного списка
     */
    public class Node{

        // Ссылка на следующий узел
        public Node next;

        // Ссылка на предыдущий узел
        public Node previous;

        // Фактическое значение узла
        public T value;

    }

    // Функция разворота связного списка
    public void revert(){
        // Создаем переменную текущей ноды и присваиваем начало - head
        Node currentNode = head;

        // Пока не дойдем до конца списка
        while (currentNode != null){
            // Создаем переменную со ссылкой на следующую ноду
            Node next = currentNode.next;

            // Создаем переменную со ссылкой на предыдущую ноду
            Node previous = currentNode.previous;

            // Меняем местами ссылки
            currentNode.next = previous;
            currentNode.previous = next;

            // Если предыдущая нода нал - то теперь это будет хвост
            if (previous == null){
                tail = currentNode;
            }

            // Если следующая нода нал - то теперь это будет голова
            if (next == null){
                head = currentNode;
            }

            // Переходим к следующей ноде
            currentNode = next;
        }
    }

    /**
     * Добавление нового элемента в начало списка
     * @param value
     */
    public void addFirst(T value){
        // Создаем новую ноду
        Node node = new Node();
        // присваиваем наше значение
        node.value = value;

        // Проверяем, есть ли уже элементы в списке
        // Если в head ничего нет, то делаем и head и tail нашей нодой
        if (head == null){
            head = node;
            tail = node;
        } else {
            // Если элементы есть, то:
            head.previous= node; // вставляем значение до головы и указываем, что теперь там есть наша новая нода
            node.next = head; // Присваиваем ссылку нашей новой ноде на следующий элемент
            head = node; // указываем нашу новую ноду как head
        }
    }

    @Override
    public String toString(){
        // Создаем стрингбилдер, который будет склеивать наши значения
        StringBuilder stringBuilder = new StringBuilder();

        // В самом начале ставим квадратную скобку для красоты)
        stringBuilder.append('[');
        stringBuilder.append('\n');

        // Указываем первую ноду - Head
        Node node = head;

        // Пробегаемся по списку до тех пор, пока ноды не кончатся
        while (node != null){
            // Вставляем значение ноды
            stringBuilder.append(node.value);
            // Переходим на следующую строку
            stringBuilder.append('\n');
            node = node.next;
        }

        // Ставим закрывающую скобку
        stringBuilder.append(']');

        // Возвращаем склеенную строку
        return stringBuilder.toString();

    }

}
