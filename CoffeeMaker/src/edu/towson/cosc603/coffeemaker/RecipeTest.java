package edu.towson.cosc603.coffeemaker;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class RecipeTest extends TestCase{
	@Test
	  public void addRecipe1()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe = new Recipe();

	    testRecipe.setName("Coffee");
	    testRecipe.setPrice(5);
	    testRecipe.setAmtCoffee(2);
	    testRecipe.setAmtMilk(2);
	    testRecipe.setAmtSugar(2);
	    testRecipe.setAmtChocolate(2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe));
	  }

	  @Test
	  public void addRecipe1E1()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();
	    Recipe testRecipe2 = new Recipe();
	    Recipe testRecipe3 = new Recipe();
	    Recipe testRecipe4 = new Recipe();
	    Recipe testRecipe5 = new Recipe();

	    testRecipe1.setName("Coffee1");
	    testRecipe1.setPrice(5);
	    testRecipe1.setAmtCoffee(2);
	    testRecipe1.setAmtMilk(2);
	    testRecipe1.setAmtSugar(2);
	    testRecipe1.setAmtChocolate(2);
	    testRecipe2.setName("Coffee2");
	    testRecipe2.setPrice(5);
	    testRecipe2.setAmtCoffee(2);
	    testRecipe2.setAmtMilk(2);
	    testRecipe2.setAmtSugar(2);
	    testRecipe2.setAmtChocolate(2);
	    testRecipe3.setName("Coffee3");
	    testRecipe3.setPrice(5);
	    testRecipe3.setAmtCoffee(2);
	    testRecipe3.setAmtMilk(2);
	    testRecipe3.setAmtSugar(2);
	    testRecipe3.setAmtChocolate(2);
	    testRecipe4.setName("Coffee4");
	    testRecipe4.setPrice(5);
	    testRecipe4.setAmtCoffee(2);
	    testRecipe4.setAmtMilk(2);
	    testRecipe4.setAmtSugar(2);
	    testRecipe4.setAmtChocolate(2);
	    testRecipe5.setName("Coffee5");
	    testRecipe5.setPrice(5);
	    testRecipe5.setAmtCoffee(2);
	    testRecipe5.setAmtMilk(2);
	    testRecipe5.setAmtSugar(2);
	    testRecipe5.setAmtChocolate(2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe2));
	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe3));
	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe4));
	    Assert.assertFalse(testCoffeeMaker.addRecipe(testRecipe5));
	  }

	  @Test
	  public void addRecipe1E2()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();
	    Main testMain = new Main();

	    Assert.assertEquals(-1L, Main.stringToInt("$%"));
	  }

	  @Test
	  public void addRecipe1E3()
	  {
	    Assert.assertEquals(-1L, Main.stringToInt("$%"));
	  }

	  @Test
	  public void addRecipe1E4()
	  {
	    Assert.assertEquals(-1L, Main.stringToInt("-1"));
	  }

	  @Test
	  public void addRecipe1E5()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();
	    Recipe testRecipe2 = new Recipe();

	    testRecipe1.setName("Coffee1");
	    testRecipe1.setPrice(5);
	    testRecipe1.setAmtCoffee(2);
	    testRecipe1.setAmtMilk(2);
	    testRecipe1.setAmtSugar(2);
	    testRecipe1.setAmtChocolate(2);
	    testRecipe2.setName("Coffee1");
	    testRecipe2.setPrice(5);
	    testRecipe2.setAmtCoffee(2);
	    testRecipe2.setAmtMilk(2);
	    testRecipe2.setAmtSugar(2);
	    testRecipe2.setAmtChocolate(2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
	    Assert.assertFalse(testCoffeeMaker.addRecipe(testRecipe2));
	  }

	  @Test
	  public void deleteRecipe1()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();

	    testRecipe1.setName("Coffee1");
	    testRecipe1.setPrice(5);
	    testRecipe1.setAmtCoffee(2);
	    testRecipe1.setAmtMilk(2);
	    testRecipe1.setAmtSugar(2);
	    testRecipe1.setAmtChocolate(2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
	    Assert.assertTrue(testCoffeeMaker.deleteRecipe(testRecipe1));
	  }

	  @Test
	  public void deleteRecipe1E1()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();

	    testRecipe1.setName("Coffee1");
	    testRecipe1.setPrice(5);
	    testRecipe1.setAmtCoffee(2);
	    testRecipe1.setAmtMilk(2);
	    testRecipe1.setAmtSugar(2);
	    testRecipe1.setAmtChocolate(2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
	    Assert.assertTrue(testCoffeeMaker.deleteRecipe(testRecipe1));
	  }

	  @Test
	  public void editRecipe1()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();
	    Recipe testRecipe2 = new Recipe();

	    testRecipe1.setName("Coffee1");
	    testRecipe1.setPrice(5);
	    testRecipe1.setAmtCoffee(2);
	    testRecipe1.setAmtMilk(2);
	    testRecipe1.setAmtSugar(2);
	    testRecipe1.setAmtChocolate(2);

	    testRecipe2.setName("Coffee1");
	    testRecipe2.setPrice(5);
	    testRecipe2.setAmtCoffee(2);
	    testRecipe2.setAmtMilk(2);
	    testRecipe2.setAmtSugar(2);
	    testRecipe2.setAmtChocolate(2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
	    Assert.assertTrue(testCoffeeMaker.editRecipe(testRecipe1, testRecipe2));
	    Assert.assertEquals(testRecipe2, testCoffeeMaker.getRecipeForName(testRecipe2.getName()));
	  }

	  @Test
	  public void editRecipe1E4()
	  {
	    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
	    Recipe testRecipe1 = new Recipe();
	    Recipe testRecipe2 = new Recipe();

	    testRecipe1.setName("Coffee1");
	    testRecipe1.setPrice(5);
	    testRecipe1.setAmtCoffee(2);
	    testRecipe1.setAmtMilk(2);
	    testRecipe1.setAmtSugar(2);
	    testRecipe1.setAmtChocolate(2);

	    testRecipe2.setName("Coffee1");
	    testRecipe2.setPrice(-5);
	    testRecipe2.setAmtCoffee(-2);
	    testRecipe2.setAmtMilk(-2);
	    testRecipe2.setAmtSugar(-2);
	    testRecipe2.setAmtChocolate(-2);

	    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
	    Assert.assertTrue(testCoffeeMaker.editRecipe(testRecipe1, testRecipe2));
	  }
}
