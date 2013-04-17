package edu.towson.cosc603.coffeemaker;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class InventoryTest extends TestCase{
	@Test
	  public void addInventory1()
	  {
	    int coffee = 2;
	    int milk = 2;
	    int sugar = 2;
	    int chocolate = 2;
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();

	    Assert.assertTrue(testCoffeeMaker.addInventory(coffee, milk, sugar, chocolate));
	  }

	  @Test
	  public void addInventory1E1_2()
	  {
	    int coffee = -2;
	    int milk = -2;
	    int sugar = -2;
	    int chocolate = -2;

	    Inventory testInventory = new Inventory();

	    testInventory.setCoffee(coffee);
	    testInventory.setMilk(milk);
	    testInventory.setSugar(sugar);
	    testInventory.setChocolate(chocolate);

	    Assert.assertEquals(0L, testInventory.getCoffee());
	    Assert.assertEquals(0L, testInventory.getMilk());
	    Assert.assertEquals(0L, testInventory.getSugar());
	    Assert.assertEquals(0L, testInventory.getChocolate());

	    System.out.println(testInventory.toString());
	  }

	  @Test
	  public void checkInventory1()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Inventory testInventory = testCoffeeMaker.checkInventory();
	    int coffee = 15;
	    int milk = 15;
	    int sugar = 15;
	    int chocolate = 15;

	    Assert.assertEquals(chocolate, testInventory.getChocolate());
	    Assert.assertEquals(coffee, testInventory.getCoffee());
	    Assert.assertEquals(milk, testInventory.getMilk());
	    Assert.assertEquals(sugar, testInventory.getSugar());
	  }
}
