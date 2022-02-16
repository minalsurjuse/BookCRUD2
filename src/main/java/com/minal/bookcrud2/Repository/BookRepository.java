package com.minal.bookcrud2.Repository;

import com.minal.bookcrud2.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {

    Books findByBookName(String bookName);
}
