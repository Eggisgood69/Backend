
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
實作題：圖書類和圖書館管理系統
建立一個圖書類（Book），包含書名、作者和ISBN碼等屬性，以及相應的方法。
實現一個簡單的圖書館管理系統，可以新增書、刪除書籍和列出所有書籍。
*/
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static class Book {
        private String bookName;
        private String author;
        private String ISBN;
        
        public Book(String bookName, String author, String ISBN) {
            this.bookName = bookName;
            this.author = author;
            this.ISBN = ISBN;
        }
        
        public String getISBN() {
            return ISBN;
        }
        
        @Override
        public String toString() {
            return String.format("Book name: %s, author: %s, ISBN: %s", bookName, author, ISBN);
        }
        
    }
    
    public static class Library {
        private List<Book> books;
        
        public Library() {
            this.books = new ArrayList<>();
        }
        
        // 增加書籍
        public void addBook(Book book) {
            books.add(book);
        }
        
        // 刪除書
        public boolean removeBook(String ISBN) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getISBN().equals(ISBN)) {
                    books.remove(i);
                    return true;
                }
            }
            return false;
        }
        
        public void listBooks() {
            System.out.println(books);
        }
        
        public void listBooksDetail() {
            for (Book book : books) System.out.println(book.toString());
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("哈利波特一", "JK", "JHH224dhdf");
        Book book2 = new Book("哈利波特二", "JK", "JHH224dzzz");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        // library.listBooks();
        // library.listBooksDetail();
        // 找不到書的刪除
        System.out.println(library.removeBook("asdasdasd"));
        library.listBooks();
        // 找到並刪除
        System.out.println(library.removeBook("JHH224dzzz"));
        library.listBooks();
    }
}