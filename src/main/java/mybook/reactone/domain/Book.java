package mybook.reactone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookseq;

    private String booktitle;
    private String bookwriter;
    private String bookpub;
    private String bookstory;
    private String bookimgname;
    private String bookimgpath;
    private String bookimgogn;
    private int bookstatus;
}
