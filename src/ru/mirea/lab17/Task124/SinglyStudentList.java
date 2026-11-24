package ru.mirea.lab17.Task124;
public class SinglyStudentList implements StudentList {
    private Student head;

    public SinglyStudentList() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void add(Student student) {
        student.next = null;
        student.previous = null;

        if (head == null) {
            head = student;
        } else {
            Student current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = student;
        }
    }

    @Override
    public boolean removeById(int idNumber) {
        if (head == null) {
            return false;
        }

        if (head.getIdNumber() == idNumber) {
            Student removed = head;
            head = head.next;
            removed.next = null;
            return true;
        }

        Student current = head;

        while (current.next != null) {
            if (current.next.getIdNumber() == idNumber) {
                Student removed = current.next;
                current.next = removed.next;
                removed.next = null;
                return true;
            }
            current = current.next;
        }

        return false;
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
    }
}
