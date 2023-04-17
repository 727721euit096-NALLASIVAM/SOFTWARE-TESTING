package DAY7;

import org.testng.Assert;

import org.testng.annotations.Test;

public class NewTest_2{

public class Calculator { int a=10,b=2, c=0; @Test(priority=4) public void add() {

c=a+b;

System.out.println("Addition : "+c); Assert.assertEquals(12,c);

}

@Test(priority=3)

public void sub() {

c=(a-b);

System.out.println("Subtraction : "+c); Assert.assertEquals(8,c);

}

@Test(priority=2)

public void multiply() {
	c=(a*b);
	System.out.println("Multiplication :"+c);Assert.assertEquals(20,c);
}
@Test(priority=1)

public void divide() {
	c=(a/b);
	System.out.println("Division :"+c);Assert.assertEquals(5,c);
}
}
}