package com.example.ws;

import org.tempuri.*;

public class CalculatorSkeletonImpl extends CalculatorSkeleton {

    @Override
    public DivideResponseDocument divide(DivideDocument divide) {

        int num1 = divide.getDivide().getIntA();
        int num2 = divide.getDivide().getIntB();
        int result = num1/num2;

        DivideResponseDocument response = DivideResponseDocument.Factory.newInstance();
        response.getDivideResponse().setDivideResult(result);
        return response;
    }

    @Override
    public AddResponseDocument add(AddDocument add) {

        int num1 = add.getAdd().getIntA();
        int num2 = add.getAdd().getIntB();
        int result = num1+num2;

        AddResponseDocument response = AddResponseDocument.Factory.newInstance();
        response.getAddResponse().setAddResult(result);
        return response;
    }

    @Override
    public MultiplyResponseDocument multiply(MultiplyDocument multiply) {

        int num1 = multiply.getMultiply().getIntA();
        int num2 = multiply.getMultiply().getIntB();
        int result = num1*num2;

        MultiplyResponseDocument response = MultiplyResponseDocument.Factory.newInstance();
        response.getMultiplyResponse().setMultiplyResult(result);
        return response;
    }

    @Override
    public SubtractResponseDocument subtract(SubtractDocument subtract) {

        int num1 = subtract.getSubtract().getIntA();
        int num2 = subtract.getSubtract().getIntB();
        int result = num1-num2;

        SubtractResponseDocument response = SubtractResponseDocument.Factory.newInstance();
        response.getSubtractResponse().setSubtractResult(result);
        return response;
    }
}
