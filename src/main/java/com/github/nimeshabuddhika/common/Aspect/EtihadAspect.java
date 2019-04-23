package com.github.nimeshabuddhika.common.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
public class EtihadAspect {

    @Autowired
    private Environment env;

    private static final Logger logger = LoggerFactory.getLogger(EtihadAspect.class);

    @Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
    public void repositoryClassMethods() {}

    @Around(value = "@annotation(EtihadExecutionTimeLog)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        logger.info( (env.getProperty("spring.application.name")+" Transaction ID : "+request.getHeader("transaction-id")+" "+joinPoint.getSignature().getName()+ " executed in " + executionTime + "ms"));
        return proceed;
    }

    @Around(value = "repositoryClassMethods())")
    public Object controllerLogExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        logger.info(env.getProperty("spring.application.name")+" Transaction ID : "+request.getHeader("transaction-id")+" : HIT: " +request.getRequestURI() + " executed in " + executionTime + "ms");
        return proceed;
    }
}
