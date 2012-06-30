/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.interceptorexample;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author tsegorah
 */
public class SimpleLogger {
    
    @AroundInvoke
    public Object logAction(InvocationContext context) throws Exception {
        System.out.println("object  - " + context.getTarget().getClass());
        System.out.println( "method - " + context.getMethod());       
        
        return context.proceed();
    }
    
}
