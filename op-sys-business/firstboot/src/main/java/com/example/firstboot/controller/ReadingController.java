package com.example.firstboot.controller;

import com.example.firstboot.dao.ReadingRepository;
import com.example.firstboot.entity.Book;
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
@RequestMapping("/")
public class ReadingController {

        private ReadingRepository readingRepository;
        @Autowired
        public ReadingController(
                ReadingRepository readingRepository) {
            this.readingRepository = readingRepository;
        }
        @RequestMapping(value="/{reader}", method=RequestMethod.GET)
        public String readersBooks(
                @PathVariable("reader") String reader,
                Model model) {
            List<Book> readingList =
                    readingRepository.findByReader(reader);
            if (readingList != null) {
                model.addAttribute("books", readingList);
            }
            return "readingList";
        }
        @RequestMapping(value="/{reader}", method=RequestMethod.POST)
        public String addToReadingList(
                @PathVariable("reader") String reader, Book book) {
            book.setReader(reader);
            readingRepository.save(book);
            return "redirect:/{reader}";
        }
}
