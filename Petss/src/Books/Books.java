package Books;

public class Books {

    private String Title;
    private String Author;
    private String Publisher;
    public Boolean isPrinting = true;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public static void main(String[]args){
        Books book1 = new Books();

        book1.setAuthor("RF Kuang");
        book1.setTitle("The Dragon Republic");
        book1.setPublisher("Harper Collins");
        book1.isPrinting("true");

        System.out.println("This book's title is " + book1.getTitle() +", and the author is " + book1.getAuthor() + ". ");
        System.out.println("This book's publisher is " + book1.getPublisher() +". The book is in print =  " + book1.getisPrinting());

        Books book2 = new Books();

        book2.setAuthor("Brandon Sanderson");
        book2.setTitle("Mistborn: The Final Empire");
        book2.setPublisher("Tor");
        book2.isPrinting("true");

        System.out.println("This book's title is " + book2.getTitle() +", and the author is " + book2.getAuthor() + ". ");
        System.out.println("This book's publisher is " + book2.getPublisher() +". The book is in print =  " + book2.getisPrinting());


    }

    private Boolean getisPrinting() {
        return isPrinting;
    }

    private void isPrinting(String aTrue) {
    }
}


