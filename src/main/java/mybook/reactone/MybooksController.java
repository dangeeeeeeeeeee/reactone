package mybook.reactone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mybook.reactone.domain.Mybooks;

@RestController
public class MybooksController {
    @Autowired
    private MybooksService mybooksService;

    @GetMapping("mybookslist")
    public List<Mybooks> Mybooks(){
        List<Mybooks> list = mybooksService.list();
        return list;
    }
}
