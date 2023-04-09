package mybook.reactone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mybook.reactone.domain.Mybooks;

@Repository
public interface MybooksRepository extends JpaRepository<Mybooks, Long> {
    
}
