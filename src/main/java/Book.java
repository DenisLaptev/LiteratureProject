import model.Literature;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Lenovo on 18.03.2017.
 */
public class Book extends Literature {

    String[] authors;

    public Book(String title, String text, String[] authors, String publisher, int year) {
        super(title, text, publisher, year);
        this.authors = authors;
    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {

        return "Book{" +
                "title=" + title +
                ", text=" + text +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", year=" + year +
                '}';

    }
}
