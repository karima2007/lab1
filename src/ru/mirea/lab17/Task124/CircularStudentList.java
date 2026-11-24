package ru.mirea.lab17.Task124;
public class CircularStudentList implements StudentList {
    private Student head;
    private Student tail;

    public CircularStudentList() {
        head = null;
        tail = null;
    }
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public void add(Student student) {
        student.previous = null;

        if (head == null) {
            head = student;
            tail = student;
            student.next = head;
        } else {
            tail.next = student;
            tail = student;
            tail.next = head;
        }
    }
    @Override
    public boolean removeById(int idNumber) {
        if (head == null) {
            return false;
        }

        Student current = head;
        Student previous = tail;

        do {
            if (current.getIdNumber() == idNumber) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else {
                    previous.next = current.next;

                    if (current == head) {
                        head = current.next;
                    }

                    if (current == tail) {
                        tail = previous;
                    }

                    tail.next = head;
                }

                current.next = null;
                return true;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        return false;
    }
    @Override
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        Student current = head;
        do {
            current.display();
            current = current.next;
        } while (current != head);
    }
    @Override
    public void clear() {
        head = null;
        tail = null;
    }
}
