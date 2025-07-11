import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public boolean isMemberRegistered(String memberId) {
        for (Member member : members) {
            if (member.getId().equals(memberId)) {
                return true;
            }
        }
        return false;
    }

    public void borrowBook(String memberId, String bookId) {
        if (!isMemberRegistered(memberId)) {
            System.out.println("Member not registered. Kindly register to borrow books.");
            return;
        }

        Book bookToBorrow = null;
        for (Book book : books) {
            if (book.getId().equals(bookId) && book.isAvailable()) {
                bookToBorrow = book;
                break;
            }
        }

        if (bookToBorrow == null) {
            System.out.println("Book not available or not found.");
            return;
        }

        bookToBorrow.setAvailable(false);
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(String memberId, String bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                book.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

