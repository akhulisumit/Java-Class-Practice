package booksDatabase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVDataLoader {
    String filepath;

    public CSVDataLoader(String filepath) {
        this.filepath = filepath;
    }

    public ArrayList<books> loadBooksList() throws FileNotFoundException {
        ArrayList<books> bookList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] values = line.split(",");
                    if (values.length != 7) {
                        System.out.println("Skipping malformed line: " + line);
                        continue;
                    }
                    String title = values[0].trim();
                    String author = values[1].trim();
                    double userRating = Double.parseDouble(values[2].trim());
                    int reviews = Integer.parseInt(values[3].trim());
                    int price = Integer.parseInt(values[4].trim());
                    int year = Integer.parseInt(values[5].trim());
                    String genre = values[6].trim();
                    books book = new books(title, author, userRating, reviews, price, year, genre);
                    bookList.add(book);
                } catch (NumberFormatException e) {
                    System.out.println("Skipping line with parsing error: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
