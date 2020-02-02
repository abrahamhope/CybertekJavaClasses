package day52.Book;

public interface KnowledgeBank {
    public abstract void takeNote();
    public default void showTableOfContent(){
        System.out.println("Chapter 1 till Chapter 10 : you do the rest");
    }
}
