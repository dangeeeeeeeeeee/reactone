package mybook.reactone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberseq;

    private String memberemail;

    private String memberpwd;

    private String membername;

    private String memberphone;

    private int memberbirth;
    private String memberaddr;
    private int memberstatus;
    private int memberoradmin;
}
