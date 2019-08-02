package com.kitapci.book.repo;

import com.kitapci.book.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
