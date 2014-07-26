package test.dynamic.plan;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Factory;

public class DynamicTestPlanTest {
    TestPlan1 obj1;
    TestPlan2 obj2;
   
    @Factory
    public Object[] setUp() throws Exception {
       List list=new ArrayList();
       
        int a=30,b=20,c;
       
        if(a>b){
            obj1=new TestPlan1();
            list.add(obj1);
        }else{
            obj2=new TestPlan2();
            list.add(obj2);
        }
       
        Object[] data = list.toArray(); 
        return data;
    }
   
}

