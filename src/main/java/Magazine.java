import model.Literature;

import java.util.Arrays;

/**
 * Created by Lenovo on 18.03.2017.
 */
public class Magazine extends Literature {
    String[] articles;

    public Magazine(String title, String text, String[] articles, String publisher, int year) {
        super(title, text, publisher, year);
        this.articles = articles;
    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {

        return "Magazine{" +
                "title=" + title +
                ", text=" + text +
                ", articles=" + Arrays.toString(articles) +
                ", publisher=" + publisher +
                ", year=" + year +
                '}';

    }


}
