package com.example.firstboot.controller;

import com.example.firstboot.dao.ReadingRepositoryDao;
import com.example.firstboot.entity.Book;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.example.firstboot.controller
 * date:   2018-05-31 14:02
 */
@Controller
@RequestMapping("/reading")
public class ReadingController {

        @Autowired
        private ReadingRepositoryDao readingRepositoryDao;
        /*@Autowired
        public ReadingController(
                ReadingRepository readingRepository) {
            this.readingRepository = readingRepository;
        }*/
        @RequestMapping(value="/{reader}", method=RequestMethod.GET)
        public String readersBooks(
                @PathVariable("reader") String reader,
                Model model) {
            List<Book> readingList =
                    readingRepositoryDao.findByReader(reader);
            if (readingList != null) {
                model.addAttribute("books", readingList);
            }
            return "readingList";
        }
        @RequestMapping(value="/{reader}", method=RequestMethod.POST)
        public String addToReadingList(
                @PathVariable("reader") String reader, Book book) {
            book.setReader(reader);
            readingRepositoryDao.save(book);
            return "redirect:/reading/{reader}";
        }
}
