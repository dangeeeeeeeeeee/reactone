package mybook.reactone;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import mybook.reactone.domain.Mybooks;

@Service
public class MybooksServiceImpl implements MybooksService{
    
    private final MybooksRepository mybooksRepository;
    
    public MybooksServiceImpl(MybooksRepository mybooksRepository){
        this.mybooksRepository = mybooksRepository;
    }

    @Override
    public List<Mybooks> list() {
        return mybooksRepository.findAll(Sort.by(Sort.Direction.DESC, "mybooksseq"));
    }
    
}
