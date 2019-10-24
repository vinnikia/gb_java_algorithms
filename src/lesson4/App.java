package lesson4;

public class App {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        ListIterator iterator = new ListIteratorImpl(list);

        iterator.insertAfter("Anton", 33);
        iterator.insertAfter("Garik", 21);
        iterator.insertAfter("Oleg", 17);
        iterator.insertAfter("Denis", 38);
        iterator.insertBefore("Petr", 7);
        iterator.insertBefore("Anna", 12);
        list.display();
        System.out.println("Удаляем Анну");
        iterator.deleteCurrent().print();

        System.out.println("Удаляем Петра");
        iterator.deleteCurrent().print();

        System.out.println("Выводим остальных");
        list.display();

        System.out.println("Удаляем Дениса");
        iterator.deleteCurrent().print();

        System.out.println("Удаляем Антона");
        iterator.deleteCurrent().print();

        System.out.println("Удаляем Гарика");
        iterator.deleteCurrent().print();

        //System.out.println("Текущий элемент:");
        //iterator.getCurrent().print();

        System.out.println("Удаляем Олега");
        iterator.deleteCurrent().print();

        if(list.isEmpty()) {
            System.out.println("Никого не осталось");
        }


    }
}
