package model;

/**
 * Created by Lenovo on 18.03.2017.
 */
public class Literature {
    public String title;
    public String text;
    public String publisher;
    public int year;

    public Literature(String title, String text, String publisher, int year) {
        this.title = title;
        this.text = text;
        this.publisher = publisher;
        this.year = year;
    }

    public void getInfo() {
        System.out.println(this.toString());
    }

    public boolean isPublishedInThisYear(int year) {
        return this.year == year;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "title=" + title +
                ", text=" + text +
                ", publisher=" + publisher +
                ", year=" + year +
                '}';
    }
}
