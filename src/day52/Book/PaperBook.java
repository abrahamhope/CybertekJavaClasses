package day52.Book;

public class PaperBook extends Book implements Readable{
int weight;

    public PaperBook(String name, String author) {
        super(name, author);
        this.weight=weight;
    }

    public void read(){
    System.out.println("Reading the "+name+" written by "+author);
}


    @Override
    public void displayBookInfo() {
        System.out.println("Paper Book Title : "+ name+ ", and the author is: "+author
        +" and it weigh "+weight+" lb.");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking note from "+name);
    }

    @Override
    public void showTableOfContent() {

    }
}
