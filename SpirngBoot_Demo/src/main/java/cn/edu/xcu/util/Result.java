package cn.edu.xcu.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WeiJiang
 * @Description:  前后端数据协议
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    // 标志接口是否成功执行
    private Boolean flag;
    // 调用接口返回数据格式
    private Object data;
    // 返回状态信息
    private String msg;

    public Result(Boolean flag) {
        this.flag = flag;
    }
    public Result(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }

    public Result(Boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public Result(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
