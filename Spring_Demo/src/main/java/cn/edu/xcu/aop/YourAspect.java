package cn.edu.xcu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 自定义切面类，使用注解方式配置 AOP
 *
 * @author JiangWei
 */
@Component
@Aspect
public class YourAspect {

    /**
     * 定义切点表达式，匹配 PeopleService 接口的所有方法
     */
    @Pointcut(value = "execution(* cn.edu.xcu.aop.PeopleService.*())")
    private void pointcut() {
    }

    /**
     * 前置通知：在目标方法执行之前执行
     *
     * @param joinPoint 连接点对象，可以获取目标方法的信息
     */
    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.print("这是前置通知!");
        System.out.print("目标类是：" + joinPoint.getTarget());
        System.out.println("，被织入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知：围绕着目标方法执行，可以控制目标方法是否执行、何时执行、如何执行
     *
     * @param point 连接点对象，可以获取目标方法的信息，以及控制目标方法的执行
     * @return 目标方法的返回值
     * @throws Throwable 异常
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("这是环绕通知之前的部分!");
        //调用目标方法
        Object object = point.proceed();
        System.out.println("这是环绕通知之后的部分!");
        return object;
    }
}
