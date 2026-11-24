package ru.mirea.lab17.Task124;
public class DoublyStudentList implements StudentList {
    private Student head;
    private Student tail;

    public DoublyStudentList() {
        head = null;
        tail = null;
    }
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public void add(Student student) {
        student.next = null;
        student.previous = tail;

        if (head == null) {
            head = student;
            tail = student;
        } else {
            tail.next = student;
            tail = student;
        }
    }
    @Override
    public boolean removeById(int idNumber) {
        Student current = head;

        while (current != null && current.getIdNumber() != idNumber) {
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current.previous != null) {
            current.previous.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
        }

        current.next = null;
        current.previous = null;
        return true;
    }
    @Override
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        Student current = head;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
    @Override
    public void clear() {
        head = null;
        tail = null;
    }
}
