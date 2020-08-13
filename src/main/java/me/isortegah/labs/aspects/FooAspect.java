package me.isortegah.labs.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
public class FooAspect {
    private final Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

    @Pointcut("execution(* me.isortegah.labs.Foo.foo(..))")
    public void methodFooFromTypeFoo() {}

    @Before("methodFooFromTypeFoo()")
    public void before(JoinPoint joinPoint) {
        logger.log(Level.INFO,"before " + joinPoint.toLongString());
    }

    @After("methodFooFromTypeFoo()")
    public void after(JoinPoint joinPoint) {
        logger.log(Level.INFO,"after " + joinPoint.toLongString());
    }

    @Pointcut("execution(* me.isortegah.labs.Foo.bar(..))")
    public void methodBarFromTypeFoo() {}

    @AfterReturning(pointcut = "methodBarFromTypeFoo()", returning = "result")
    public void afterReturningMethodBar(JoinPoint jp,Object result){
        logger.log(Level.INFO, "afterReturning " + jp.toLongString() +
                " with result: " + result);
    }

    @Pointcut("execution(* me.isortegah.labs.Foo.dao(..))")
    public void methodDao() {}

    @Around("methodDao()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        logger.log(Level.INFO,"around before " + pjp.toLongString());
        Object obj=pjp.proceed();
        logger.log(Level.INFO,"around after " + pjp.toLongString());
    }
}
