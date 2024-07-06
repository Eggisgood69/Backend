/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
實作題：圖書類和圖書館管理系統
建立一個圖書類（Book），包含書名、作者和ISBN碼等屬性，以及相應的方法。
實現一個簡單的圖書館管理系統，可以新增書、刪除書籍和列出所有書籍。
*/
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

// 定義學生類
class Student {
    String name; // 學生姓名
    int id; // 學號
    double grade; // 成績
    
    // 構造方法
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    
    // 設置和取得屬性的方法
    public int getId() {
        return id;
    }
    
    // 印出學生資料的方法
    public void printInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Grade: " + grade);
    }
}

// 定義管理系統類
class StudentManagement {
    HashMap<Integer, Student> students = new HashMap<Integer, Student>();
    
    // 方法：新增學生
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }
    
    // 方法：刪除學生
    public boolean removeStudent(int id) {
        if (students.get(id) != null) {
            students.remove(id);
            return true;
        } else {
            return false;
        }
    }
    
    // 方法：列出所有學生信息
    public void printInfo() {
        for (Student student : students.values()) {
            student.printInfo();
        }
    }
}

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
        
        public Book getFirstBook() {
            return books.get(0);
        }
        
        public Book getBookByIndex(int index) {
            if (index < books.size()) {
                return books.get(index);
            } else {
                return null;
            }
        }
        
        public void listBooksDetail() {
            for (Book book : books) System.out.println(book.toString());
        }
    }
    
    public static void main(String[] args) {
        // Book book1 = new Book("哈利波特一", "JK", "JHH224dhdf");
        // Book book2 = new Book("哈利波特二", "JK", "JHH224dzzz");
        // Library library = new Library();
        // library.addBook(book1);
        // library.addBook(book2);
        // System.out.println(library.getFirstBook());
        // System.out.println(library.getBookByIndex(1));
        // Book getBookByIndex = library.getBookByIndex(10);
        // if (getBookByIndex == null) {
        //     System.out.println("找不到書");
        // }
        // // library.listBooks();
        // // library.listBooksDetail();
        // // 找不到書的刪除
        // System.out.println(library.removeBook("asdasdasd"));
        // library.listBooks();
        // // 找到並刪除
        // System.out.println(library.removeBook("JHH224dzzz"));
        // library.listBooks();
        Student student = new Student("Morris", 1, 100);
        Student student2 = new Student("Alice", 2, 80);
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(student);
        studentManagement.addStudent(student2);
        studentManagement.printInfo();
        // 刪除學生 id 不存在
        System.out.println(studentManagement.removeStudent(3));
        // 刪除學生 id 存在
        System.out.println(studentManagement.removeStudent(2));
    }
}