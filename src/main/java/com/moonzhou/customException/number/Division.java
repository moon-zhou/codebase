package com.moonzhou.customException.number;

public class Division {
    
    public int divide(int iNum1, int iNum2) throws DenominatorIsZeroException {
        
        if (0 == iNum2) {
            throw new DenominatorIsZeroException("分母不能为零。");
        }

        return (iNum1 / iNum2);
    }

}
