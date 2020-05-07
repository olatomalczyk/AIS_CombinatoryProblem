/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import org.jacop.core.*;
import org.jacop.search.*;
import java.util.ArrayList;
import org.jacop.examples.fd.ExampleFD;
/**
 *
 * @author KUBA i OLA
 */
public class CLP_Class {
    /**
     * protected classes
     */
    
    protected Store store=new Store();
    protected DepthFirstSearch search=new DepthFirstSearch();
    //protected IntVar[] array;
    
    protected ArrayList<IntVar> vars;
    protected ArrayList<IntVar> intvar;
    
    public String result_info;
   
    
    /**
     * Body of empty method - method()
     */
    public void method()
    {
        
    };
    
   
     /**
     * Body of search() method
     * This method searches for a solution of problem
     * @return string information about the result
     */
    
    public String search()
    {
    return "";
    };
     /**
     * Body of model () method
     * @return string information about the result
     */
    
     public void model()
    {
        
    };

     
     
}
    
