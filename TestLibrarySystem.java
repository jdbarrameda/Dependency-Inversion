public class TestLibrarySystem {
    public static void main(String[] args) {
        LibraryResource book = new Book("Introduction to Java Programming");
        LibraryResource journal = new Journal("Journal of Computer Science");
     
        Student student = new Student();

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}