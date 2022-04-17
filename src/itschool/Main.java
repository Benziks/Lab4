package itschool;



class Book {
    private String author;

    public void setAuthor(String author) {
        author = author.trim();
        char sim = author.charAt(0);
        int simCode = (int) sim;
        if ((simCode >= 65 && simCode <= 90)) {
            this.author = author;
        } else {
            this.author = " ";
        }
    }

    public String getAuthor() {
        if ((int) author.charAt(0) != 32) {
            return author;
        } else {
            System.out.println("У автора должна быть заглавная буква!");
            System.exit(0);
            return "";
        }
    }

    private int pages;

    public void setPages(int pages) {
        if (pages > 1) {
            this.pages = pages;
        } else {
            this.pages = -1;
        }
    }

    public int getPages() {
        if (pages != -1) {
            return pages;
        } else {
            System.out.println("Введите коректное значение страниц!");
            System.exit(0);
            return 0;
        }
    }

    private int circulation;

    public void setCirculation(int circulation) {
        if (circulation > 1) {
            this.circulation = circulation;
        } else {
            this.circulation = -1;
        }
    }

    public int getCirculation() {
        if (circulation != -1) {
            return circulation;
        } else {
            System.out.println("Введите коректное значение тиража!");
            System.exit(0);
            return 0;
        }
    }


    private int year;

    public void setYear(int year) {
        if (year > 868) {
            this.year = year;
        } else {
            this.year = -1;
        }
    }

    public int getYear() {
        if (year != -1) {
            return year;
        } else {
            System.out.println("Введите коректное значение (год)");
            System.exit(0);
            return 0;
        }
    }


    private int data;

    public void setData(int data) {
        if (data > 1) {
            this.data = data;
        } else {
            this.data = 1;
        }
    }

    public int getData() {
        return data;
    }

    public void getInfo() {
        System.out.print("Author: " + getAuthor() + ", ");
        System.out.print("Pages: " + getPages() + ", ");
        System.out.print("Circulation: " + getCirculation() + ", ");
        System.out.print("Year: " + getYear() + ", ");
        System.out.println("Data: " + getData() + ", ");
    }

}
public class Main {

    public static void main(String[] args) {
        String[] author = new String[4];
        author[0] = "Crime and Punishment " ;
        author[1] = "The Master and Margarita" ;
        author[2] = "Eugene Onegin" ;
        author[3] = "Holstomr" ;
        int[] сirculation = new int[4];
        сirculation[0] = 5000;
        сirculation[1] = 5000;
        сirculation[2] = 3000;
        сirculation[3] = 2000;

        Book[] book = new Book[4];
        int data_res = 0;
        for (int i = 0; i < book.length; i++) {
            book[i] = new Book();
            try {
                book[i].setAuthor(author[(int) (Math.random() * 3)]);
                book[i].setPages((int) (Math.random() * 299 + 1));
                book[i].setCirculation((int) (Math.random() * 2500 + 3001));
                book[i].setYear((int) (Math.random() * 901 + 1001));
                book[i].setData((int) (Math.random() * 501 + 1000));

                if (book[i].getPages() > 150){
                    book[i].getInfo();
                }

            } catch (Exception e) {
                System.out.println("Произошла ошибка, проверьте данные: ");
                System.exit(0);
            }
        }
    }
}