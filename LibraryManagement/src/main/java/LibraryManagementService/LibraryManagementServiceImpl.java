package LibraryManagementService;

import Models.Library;
import Repository.LibraryRepository;
import Repository.impl.LibraryRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibraryManagementServiceImpl implements LibraryManagementService{

    @Autowired
    LibraryRepositoryImpl libraryRepositoryImpl;
    @Override
    public List<Library> getAllBooksService() {
        return libraryRepositoryImpl.getAllBooks();
    }

    @Override
    public void addBook(String book) {
        Library library= new Library();
        library.setBookName(book);
        libraryRepositoryImpl.save(library);
    }

    @Override
    public List<Library> searchBooks(String book) {
        return null;
    }
}
