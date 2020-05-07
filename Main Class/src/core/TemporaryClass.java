/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import org.jacop.constraints.Alldifferent;
import org.jacop.core.*;
import org.jacop.search.*;
import org.jacop.search.InputOrderSelect;
import org.jacop.examples.fd.ExampleFD;
/**
 *
 * @author KUBA i OLA
 */
public class TemporaryClass extends CLP_Class {
    
    /**
     * Here is the implementation of model method
     */
       public void model() {
  
/*
       array = new IntVar[5];
        for (int i = 0; i < array.length; i++) {
           array[i] = new IntVar(store, "n"+i, 0,5);
       
        }
        store.impose(new Alldifferent(array));
   
        */
        
    } 
      /**
       * Here is the implementation of search method
       * @return string information about solution
       */
    public String search()
    {
        /* SelectChoicePoint select = new SimpleSelect(array, new SmallestDomain(), new IndomainMin());
         Search search = new DepthFirstSearch();
          search.labeling(store, select);
          return "";
          */
return "";
    }
    

    
}
