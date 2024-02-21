import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hw5_2 implements Executable {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, String> genres = new HashMap<>();


    @Override
    public void execute() {

        genres.clear();
        genres.put("Fiction", "F");
        genres.put("Non-Fiction", "NF");
        genres.put("Science Fiction", "SF");
        genres.put("History", "H");

        System.out.println("*-----*-----*-----Welcome to HW5_P2 QT Library !-----*-----*-----*");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the command as required:\n0. Exit\n1. Book Entry\n2. Import Test Data\n3. List All the Book\n4. Clear All the Data");
            if (scanner.hasNextInt()) {
                int commandNumber = scanner.nextInt();
                if (commandNumber == 0) {
                    System.out.println("*-----*-----*-----Thank you for using HW5_2 Bye!! -----*-----*-----*");
                    break;
                }
                switch (commandNumber) {
                    case 1:
                        BookEntry();
                        break;
                    case 2:
                        ImportTestData();
                        break;
                    case 3:
                        ListAllBook();
                        break;
                    case 4:
                        ClearAllData();
                        break;
                    default:
                        System.out.println("Invalid command number");
                        break;
                }
            } else {
                System.out.println("Invalid command number");
                continue;
            }
        }

    }

    public void BookEntry() {
        HashMap<String, Integer> _genres = new HashMap<>();
        int index = 0;
        for (Map.Entry<String, String> entry : genres.entrySet()) {
            _genres.put(entry.getKey(), index);
            index++;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name of the book: (type 'exit' or '0' to exit)");
            String bookName = scanner.nextLine();
            if (bookName.equals("exit") || bookName.equals("0")) {
                break;
            }

            String genres = "";
            while (true) {
                System.out.println("Please choose the genres of the book: ");
                _genres.forEach((key, value) -> {
                    System.out.println(value + "). " + key);
                });
                if (scanner.hasNextInt()) {
                    int genreIndex = scanner.nextInt();
                    for (Map.Entry<String, Integer> entry : _genres.entrySet()) {
                        if (genreIndex == entry.getValue()) {
                            genres = entry.getKey();
                            break;
                        }
                    }
                    if (genres.length() > 0) {
                        break;
                    }
                }
                System.out.println("Invalid command number");
                scanner.nextLine();
            }

            while (true) {
                System.out.println("Please enter the published of year: ");
                if (scanner.hasNextInt()) {
                    int year = scanner.nextInt();
                    if (year < 1000 || year > 2024) {
                        System.out.println("Please enter a year between 1000 and before 2024");
                        scanner.nextLine();
                        continue;
                    }
                    Book book = new Book(bookName, genres, year);
                    books.add(book);
                    System.out.println("Book [" + book + "] added. Its placement should be:" + Location(book));
                    scanner.nextLine();
                    break;
                }
                System.out.println("Invalid command number");
                scanner.nextLine();
            }
        }
    }

    public void ImportTestData() {
        books.add(new Book("Harry Potter and the Philosopher's Stone", "Fiction", 1988));
        books.add(new Book("Harry Potter and the Chamber of Secrets", "Non-Fiction", 1998));
        books.add(new Book("Harry Potter and the Prisoner of Azkaban", "Fiction", 1999));
        books.add(new Book("Harry Potter and the Goblet of Fire", "History", 2000));
        books.add(new Book("Harry Potter and the Order of the Phoenix", "Fiction", 2003));
        books.add(new Book("Harry Potter and the Half-Blood Prince", "Science Fiction", 2005));
        books.add(new Book("Harry Potter and the Deathly Hallows", "Fiction", 2017));
        System.out.println("Test data imported");
    }

    public void ListAllBook() {
        String w = "";
        for (int i = 0; i < 93; i++) {
            w = w + "-";
        }
        w = "+" + w + "+";
        System.out.println(w);
        System.out.println("|" + String.format("%-50s", "Book Name") + "| " + String.format("%-20s", "Genre") + "| " + String.format("%-8s", "Year") + "|" + String.format("%-10s", "Location") + "|");
        System.out.println(w);
        for (Book b : books) {
            System.out.println("|" + String.format("%-50s", b.name) + "| " + String.format("%-20s", b.type) + "| " + String.format("%-8s", b.year) + "|" + String.format("%-10s", Location(b)) + "|");
            System.out.println(w);
        }
    }

    public void ClearAllData() {
        books.clear();
    }

    public String Location(Book b) {
        String g, y;
        g = "";
        for (Map.Entry<String, String> entry : genres.entrySet()) {
            if (entry.getKey().equals(b.type)) {
                g = entry.getValue();
            }
        }
        y = "C";
        if (b.year > 2010) {
            y = "N";
        }
        if (b.year >= 1990 && b.year <= 2010) {
            y = "M";
        }
        return g + "." + y;
    }
}

