package cn.edu.xcu.service.impl;

import cn.edu.xcu.mapper.BookMapper;
import cn.edu.xcu.pojo.Book;
import cn.edu.xcu.service.IBookService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class IBookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        bookMapper.selectPage(page,null);
        return page;
    }

    public IPage<Book> getPage(Integer currentPage,Integer pageSize,Book queryBook){
        IPage page = new Page(currentPage,pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(Strings.isNotEmpty(queryBook.getName()),Book::getName,queryBook.getName());
        lqw.like(Strings.isNotEmpty(queryBook.getType()),Book::getType,queryBook.getType());
        lqw.like(Strings.isNotEmpty(queryBook.getDescription()),
                Book::getDescription,queryBook.getDescription());
        return bookMapper.selectPage(page,lqw);
    }
}
