package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author asprin = new Author("Asprin", "Robert");
        Author perumov = new Author("Perumov", "Niсk");
        Author asprin1 = new Author("asprin", "robert");

        System.out.println("asprin.equals(asprin1) = " + asprin.equals(asprin1));
        System.out.println("perumov.hashCode() = " + perumov.hashCode());

        Book book1 = new Book("Thieves' World", asprin, 1979);
        Book book2 = new Book("Ring of Darkness", perumov, 1993);

        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book2.hashCode() = " + book2.hashCode());

        System.out.println("\nEasy level");
        System.out.println("Книга 1 = " + book1);
        System.out.println("Книга 2 = " + book2);

    }
}
