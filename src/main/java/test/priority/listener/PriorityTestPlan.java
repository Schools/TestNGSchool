package test.priority.listener;

import org.testng.annotations.Test;

public class PriorityTestPlan   {
  @Test
  public void method1() { System.out.println("M1 Default priority");}

  @Priority(1)
  @Test
  public void method2()  { System.out.println("M2 Priority 1");}
 
  @Priority(3)
  @Test
  public void method3()  { System.out.println("M3 Priority 3");}
 
  @Priority(-1)
  @Test
  public void method4()  { System.out.println("M4 Priority -1");}

  @Priority(2)
  @Test
  public void method5()  { System.out.println("M5 Priority 2");}

  @Priority(2)
  @Test
  public void method6()  { System.out.println("M6 Priority 2");}

}

