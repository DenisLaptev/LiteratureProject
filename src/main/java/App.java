import model.Literature;

/**
 * Created by Lenovo on 18.03.2017.
 */
public class App {
    public static void main(String[] args) {
        Literature[] literatureItems;

        literatureItems = generate();

        getInfoAboutAllLiteratureItems(literatureItems);

        System.out.println("----------------------------------------");

        int year = 2000;
        System.out.println("Literature items published in " + year + " year: ");
        getInfoAboutLiteratureItemsPublishedInThisYear(literatureItems, year);

    }

    private static void getInfoAboutAllLiteratureItems(Literature[] literatureItems) {
        for (int i = 0; i < literatureItems.length; i++) {
            literatureItems[i].getInfo();
        }
    }

    private static void getInfoAboutLiteratureItemsPublishedInThisYear(Literature[] literatureItems, int year) {
        for (int i = 0; i < literatureItems.length; i++) {
            if (literatureItems[i].isPublishedInThisYear(year)) {
                literatureItems[i].getInfo();
            }
        }
    }

    private static Literature[] generate() {
        Literature[] literatureItems = new Literature[5];
        literatureItems[0] = new Book(
                "Book0",
                "text0",
                new String[]{"Auth0", "Auth1"},
                "Publisher0",
                2000);
        literatureItems[1] = new Book(
                "Book1",
                "text1",
                new String[]{"Auth1", "Auth2"},
                "Publisher1",
                2002);
        literatureItems[2] = new Magazine(
                "Book1",
                "text1",
                new String[]{"article1", "article2", "article3"},
                "Publisher1",
                2000);
        literatureItems[3] = new Handbook(
                "HandBook about Nature",
                "text10",
                "Publisher2",
                2001,
                "Nature");
        literatureItems[4] = new Handbook(
                "HandBook about Computers",
                "text1001",
                "Publisher2",
                2017,
                "Computers");

        return literatureItems;
    }
}
