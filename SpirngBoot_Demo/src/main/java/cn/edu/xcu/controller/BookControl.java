package cn.edu.xcu.controller;

import cn.edu.xcu.pojo.Book;
import cn.edu.xcu.service.IBookService;
import cn.edu.xcu.util.Result;
import com.baomidou.mybatisplus.core.metadata.IPage;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControl {

    @Resource
    private IBookService iBookService;

    @GetMapping
    public Result getAll() {
        List<Book> bookList = iBookService.list();
        return new Result(true ,bookList);
    }

    @PostMapping
    public Result save(@RequestBody Book book){
        Boolean flag = iBookService.save(book);
        // 消息统一处理
        return new Result(flag, flag ? "添加成功" : "添加失败");
    }

    @PutMapping
    public Result update(@RequestBody Book book){
        Boolean flag = iBookService.updateById(book);
        return new Result(flag);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id){
        Boolean flag = iBookService.removeById(id);
        return new Result(flag);
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        Book book = iBookService.getById(id);
        return new Result(true,book);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize, Book book) {
        IPage<Book> pageBook = iBookService.getPage(currentPage,pageSize,book);
        return new Result(null != pageBook ,pageBook);
    }
}
