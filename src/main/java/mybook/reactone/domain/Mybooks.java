package mybook.reactone.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Mybooks {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mybooksseq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="memberseq")
    private Member member;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="bookseq")
    private Book book;
    
}
