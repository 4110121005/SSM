package cn.edu.xcu.service;

import cn.edu.xcu.pojo.Book;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage, int pageSize);

    IPage<Book> getPage(Integer currentPage,Integer pageSize,Book queryBook);
}
