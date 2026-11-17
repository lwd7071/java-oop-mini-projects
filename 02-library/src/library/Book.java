package library;

public abstract class Book{
    private String title;
    private String author;
    private int year;
    private boolean available;

    private static int bookCount;

    public Book(){
        bookCount++;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
        bookCount++;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean isAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }


    public static int getBookCount(){
        return bookCount;
    }

    public void printInfo(){
        System.out.println("Ten sach: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("Nam xuat ban: " + year);
        if (available == true ){
            System.out.println("Trang thai con");
        }
        else{
            System.out.println("Da cho muon");
        }
    }

    public abstract String getBookType();
}