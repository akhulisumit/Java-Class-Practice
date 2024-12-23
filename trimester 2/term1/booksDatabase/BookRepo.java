package booksDatabase;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookRepo {
    ArrayList<books> bookList;

    public BookRepo(String filepath) throws FileNotFoundException {
        CSVDataLoader ld = new CSVDataLoader(filepath);
        bookList = ld.loadBooksList();
    }

    public void printTitlesofAllBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).title);
        }
    }
}
