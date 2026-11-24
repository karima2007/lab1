package ru.mirea.lab17.Task124;

public class MergeStudents {
    public static void main(String[] args) {

        Student[] firstList = {
                new Student(5, "Анна", 4.5),
                new Student(1, "Борис", 4.2),
                new Student(8, "Виктор", 4.8)
        };

        Student[] secondList = {
                new Student(4, "Галина", 4.0),
                new Student(2, "Дарья", 4.1),
                new Student(3, "Елена", 4.9)
        };

        mergeSort(firstList, 0, firstList.length - 1);
        mergeSort(secondList, 0, secondList.length - 1);

        Student[] result = mergeTwoSortedLists(firstList, secondList);

        for (int i = 0; i < result.length; i++) {
            result[i].display();
        }
    }

    private static void mergeSort(Student[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;

        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, middle, right);
    }

    private static void merge(Student[] array, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        Student[] leftPart = new Student[leftSize];
        Student[] rightPart = new Student[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftPart[i] = array[left + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightPart[i] = array[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftPart[i].compareTo(rightPart[j]) <= 0) {
                array[k] = leftPart[i];
                i++;
            } else {
                array[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftPart[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightPart[j];
            j++;
            k++;
        }
    }

    private static Student[] mergeTwoSortedLists(Student[] first, Student[] second) {
        Student[] result = new Student[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i].compareTo(second[j]) <= 0) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }

        return result;
    }
}
