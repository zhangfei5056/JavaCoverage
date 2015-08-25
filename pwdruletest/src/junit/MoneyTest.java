package junit;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MoneyTest extends TestCase { //TestCase的子类 
public void testAdd() { //把测试代码放在testAdd中 
Money m12CHF= new Money(12, "CHF"); //本行和下一行进行一些初始化 
Money m14CHF= new Money(14, "CHF"); 
Money expected= new Money(26, "CHF");//预期的结果 
Money result= m12CHF.add(m14CHF); //运行被测试的方法 
Assert.assertTrue(expected.equals(result)); //判断运行结果是否与预期的相同 
} 
} 


