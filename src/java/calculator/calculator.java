/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Lida
 */
public class calculator {
    public int input1;
    public int input2;
    public String calculateFlag; 
    public calculator(int a, int b, String calculationtype){
        input1=a;
        input2=b;
        calculateFlag=calculationtype;
    }
    
    public int calculation() throws IllegalArgumentException{
    int output = 0;
    if(calculateFlag.equals("add")) output=input1+input2;
    if(calculateFlag.equals("minus")) output=input1-input2;    
    if(calculateFlag.equals("multiply")) output=input1*input2;
    if(calculateFlag.equals("divide")) {
        if(input2==0) throw new IllegalArgumentException("除数不能为0"); 
        output=input1/input2;
    }
    return output;
    }
}
