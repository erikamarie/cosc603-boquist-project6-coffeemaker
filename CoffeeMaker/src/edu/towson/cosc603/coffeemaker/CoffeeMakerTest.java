package edu.towson.cosc603.coffeemaker;

//import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class CoffeeMakerTest extends TestCase
{
  @Test
  public void checkOptions()
  {
    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
  }

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

  @Test
  public void purchaseBeverage1()
  {
    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
    Recipe testRecipe1 = new Recipe();
    int amountPaid = 20;

    testRecipe1.setName("Coffee1");
    testRecipe1.setPrice(5);
    testRecipe1.setAmtCoffee(2);
    testRecipe1.setAmtMilk(2);
    testRecipe1.setAmtSugar(2);
    testRecipe1.setAmtChocolate(2);

    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
    Assert.assertEquals(15L, testCoffeeMaker.makeCoffee(testRecipe1, amountPaid));
  }

  @Test
  public void purchaseBeverage1S1()
  {
    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
    Recipe testRecipe1 = new Recipe();
    int amountPaid = 6;

    testRecipe1.setName("Coffee1");
    testRecipe1.setPrice(5);
    testRecipe1.setAmtCoffee(1);
    testRecipe1.setAmtMilk(2);
    testRecipe1.setAmtSugar(2);
    testRecipe1.setAmtChocolate(2);

    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
    Assert.assertEquals(1L, testCoffeeMaker.makeCoffee(testRecipe1, amountPaid));
  }

  @Test
  public void purchaseBeverage1S2()
  {
    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
    Recipe testRecipe1 = new Recipe();
    int amountPaid = 6;

    testRecipe1.setName("Coffee1");
    testRecipe1.setPrice(5);
    testRecipe1.setAmtCoffee(1);
    testRecipe1.setAmtMilk(2);
    testRecipe1.setAmtSugar(2);
    testRecipe1.setAmtChocolate(2);

    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
    Assert.assertEquals(1L, testCoffeeMaker.makeCoffee(testRecipe1, amountPaid));
  }

  @Test
  public void purchaseBeverage1E1()
  {
    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
    Recipe testRecipe1 = new Recipe();
    int amountPaid = 10;

    testRecipe1.setName("Coffee1");
    testRecipe1.setPrice(5);
    testRecipe1.setAmtCoffee(20);
    testRecipe1.setAmtMilk(2);
    testRecipe1.setAmtSugar(2);
    testRecipe1.setAmtChocolate(2);

    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
    Assert.assertEquals(10L, testCoffeeMaker.makeCoffee(testRecipe1, amountPaid));
  }

  @Test
  public void purchaseBeverage1E2()
  {
    CoffeeMaker testCoffeeMaker = new CoffeeMaker();
    Recipe testRecipe1 = new Recipe();
    int amountPaid = 3;

    testRecipe1.setName("Coffee1");
    testRecipe1.setPrice(5);
    testRecipe1.setAmtCoffee(2);
    testRecipe1.setAmtMilk(2);
    testRecipe1.setAmtSugar(2);
    testRecipe1.setAmtChocolate(2);

    Assert.assertTrue(testCoffeeMaker.addRecipe(testRecipe1));
    Assert.assertEquals(3L, testCoffeeMaker.makeCoffee(testRecipe1, amountPaid));
  }
}
