package me.isortegah.labs.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import java.util.logging.Logger;

@Aspect
public class FooAspect {
    private final Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    @Pointcut("execution(* me.isortegah.labs.Foo.foo(..))")
    public void methodFooFromTypeFoo() {}

    @Before("methodFooFromTypeFoo()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before " + joinPoint.toLongString());
    }
}
