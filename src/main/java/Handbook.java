import model.Literature;

/**
 * Created by Lenovo on 18.03.2017.
 */
public class Handbook extends Literature {

    String theme;

    public Handbook(String title, String text, String publisher, int year, String theme) {
        super(title, text, publisher, year);
        this.theme = theme;
    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {

        return "Handbook{" +
                "title=" + title +
                ", text=" + text +
                ", publisher=" + publisher +
                ", year=" + year +
                ", theme=" + theme +
                '}';

    }
}
