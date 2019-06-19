/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restconsume.model;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.xml.bind.annotation.*;
import restconsume.*;

/**
 *
 * @author Muhammad Ridwan
 */
@XmlRootElement(name="Customers")
public class ListProduct {
   private java.util.List<Product> list = new ArrayList<Product>();

   @XmlElement(name= "values")
    public java.util.List<Product> getListproduct() {
        return list;
    }
    
    public void setlistproduct(List<Product> list){
        this.list=list;
    }

 
   
   
}
