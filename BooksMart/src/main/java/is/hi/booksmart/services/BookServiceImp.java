package is.hi.booksmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import is.hi.booksmart.model.Book;
import is.hi.booksmart.repositories.BookRepository;

public class BookServiceImp implements BookService {

	// Connection to repository of Books.
	@Autowired
	BookRepository bookRep;
	
	@Override
	public List<Book> allBooks() {
		return bookRep.findAll();
	}

	@Override
	public Book save(Book book) {
		return bookRep.save(book);
	}

	@Override
	public List<Book> booksByTitle(String title) {
		return bookRep.findByTitle(title);
	}
	
}
