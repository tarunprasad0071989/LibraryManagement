package LibraryManagementService;

import Models.Library;

import java.util.List;

public interface LibraryManagementService {
    List<Library>  getAllBooksService();

    void addBook(String book);

    List<Library> searchBooks(String book);
}
