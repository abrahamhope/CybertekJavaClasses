package day52.Book;

public abstract class Book implements KnowledgeBank{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();

/*
-- abstract
Book
	String name
	String author
-- add constructors to set the fields
-- abstract void method
	displayBookInfo()
--- concrete
PaperBook
	int weight
	-- add constructor to set all the fields
	implement abstract method
	instance method
		read()
		toString()
AudioBook
	double duration
	implement abstract method
	instance method
		listen()
		toString()
create an interface KnowledgeBank
	abstract method takeNote();
	default method showTableOfContent(){
	}
create another interface Readable
	 abstract method read()
Book implements KnowledgeBank
AudioBook , PaperBook extends Book
PaperBook implements Readable

AudioBook is a book
PaperBook is a book
Book is a KnowledgeBank
PaperBook is a Readable
AudioBook is a Readable


 */
}
