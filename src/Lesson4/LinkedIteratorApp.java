package Lesson4;

public class LinkedIteratorApp {
    public static void main(String[] args) {
    //Создаем список и добавляем в него три элемента
    LinkedList list = new LinkedList();
        list.insert("Max", 25);
        list.insert("Viktor", 24);
        list.insert("Alex", 30);
        LinkIterator iterator = new LinkIterator(list);
        System.out.println("Созданный список:");
        iterator.display();
    //Выводим текущий элемент списка
        System.out.println("Текущий элемент: " + "name" + " " + iterator.getCurrent().name + " " + "age" + " " + iterator.getCurrent().age);
        System.out.println("Передвигаем итератор на следующий элемент:");
        iterator.nextLink();
        System.out.println("Текущий элемент: " + "name" + " " + iterator.getCurrent().name + " " + "age" + " " + iterator.getCurrent().age);

    //Добавляем элемент перед текущим
        System.out.println("Добавляем элементы до и после текущего элемента. Результат:");
        iterator.insertBefore("Vadim", 22);
    //Добавляем элемент после текущего
        iterator.insertAfter("Vlad", 27);
    //Выводим полученный список
        iterator.display();
        System.out.println("Удаляем текущий элемент:");
        iterator.deleteCurrent();
        iterator.display();
}
}
