package com.example.firstboot.dao;

import com.example.firstboot.entity.Book;
import com.example.firstboot.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.example.firstboot.dao
 * date:   2018-05-31 13:59
 */
public interface ReaderRepository extends JpaRepository<Reader,Long> {

    Reader findByUsername(String username);
}
