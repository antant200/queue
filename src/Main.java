import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            if (queue.peek().tickets != 0) {
                System.out.println(queue.peek().toString() + " прокатился на аттракционе!");
                queue.peek().tickets -= 1;
                System.out.println("Билетов осталось: " + queue.peek().tickets);
                queue.offer(queue.poll());
            } else {
                queue.poll();
            }
        }
    }


    public static List<Person> generateClients() {
        List<Person> pers = new LinkedList<>();
        pers.add(new Person("Антон", "Маркелов", 5));
        pers.add(new Person("Юлия", "Иванова", 4));
        pers.add(new Person("Геннадий", "Киров", 3));
        pers.add(new Person("Владимир", "Ленин", 2));
        pers.add(new Person("Лена", "Алехина", 1));
        return pers;
    }
}