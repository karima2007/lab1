package ru.mirea.lab13;

//Task3
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String apartment;

    // Метод А: разделитель - только запятая (используем split)
    public void parseWithSplit(String addressStr) {
        String[] parts = addressStr.split("\\s*,\\s*");
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.apartment = parts[5].trim();
    }

    // Метод Б: разделитель - любой из символов , ; : - (используем StringTokenizer)
    public void parseWithTokenizer(String addressStr) {
        StringTokenizer st = new StringTokenizer(addressStr, ",;:-");
        this.country = st.nextToken().trim();
        this.region = st.nextToken().trim();
        this.city = st.nextToken().trim();
        this.street = st.nextToken().trim();
        this.house = st.nextToken().trim();
        this.apartment = st.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Страна: " + country + " | Регион: " + region +
                " | Город: " + city + " | Улица: " + street +
                " | Дом: " + house + " | Кв: " + apartment;
    }

    public static void main(String[] args) {
        Address addr = new Address();

        System.out.println("Метод split()");
        addr.parseWithSplit("Россия, Московская область, Москва, Тверская, 10, 55");
        System.out.println(addr);

        System.out.println("\nМетод StringTokenizer");
        addr.parseWithTokenizer("Таджикистан; Душанбинская область: Душанбе - Айни; 7 - 12");
        System.out.println(addr);
    }
}