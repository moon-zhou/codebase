package com.moonzhou.customException.number;

/**
 * <p>
 * Titlt:自定义异常类DenominatorIsZeroException
 * </p>
 * <p>
 * Description:分母为零的异常
 * </p>
 * 
 * @author moon-zhou
 *
 */
public class DenominatorIsZeroException extends Exception {
    public DenominatorIsZeroException(String msg) {
        super(msg);
    }
}
