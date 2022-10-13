package come.star;

import com.star.config.JdbcConfig;
import com.star.config.SpringConfig;
import com.star.pojo.Book;
import com.star.service.BookService;
import com.star.service.impl.BookServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Bai {
    @Autowired
    BookService bookService;

    @Test
    public void findAll() {
        List<Book> all = bookService.findAll();
        System.out.println(all);
    }

}
