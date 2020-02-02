package day52.Book;

public class AudioBook extends Book implements Readable{
    double duration;

    public AudioBook(String name, String author) {
        super(name, author);
    }

    public void listen(){

    }


    @Override
    public void displayBookInfo() {

    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {

    }

    @Override
    public void showTableOfContent() {

    }

    @Override
    public void read() {

    }
}
