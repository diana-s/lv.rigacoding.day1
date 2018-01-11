/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author Diana
 */
public class LvRigacodingDay1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Square s1 = new Square(5, "zaļš");
      Square s2 = new Square(20, "zils");
      
      System.out.println("Kravdrāta 1 krāsa ir " + s1.getColor());
      
      System.out.println("Kvadrāta 2 laukums ir " + s2.getArea());
      
      System.out.println("Kvadrāta 1 perimetrs ir " + s1.getPerimeter());
      
      
      //Jaunais uzdevums!!!
        
      Darbinieks nr1 = new Darbinieks();
      Darbinieks nr2 = new Darbinieks();
      nr1.name="Jānis";
      nr1.surname="Stabs";
      nr2.name = "Pēteris";
      
      Adrese darb1 = new Adrese();
      Adrese exadrese = new Adrese();
      darb1.country="Latvijā";
      darb1.city="Siguldā";
      darb1.street="Brivības ielā";
      darb1.house="6";
      darb1.flat="55";
      //pilna adrese konkrētajam darbiniekam (fullAdress)
      nr1.adrese = darb1;
      //jaunās adreses parametri
     
      exadrese.city = "Rīgā";
           
      
      Department number1 = new Department();
      Department exnumber1 = new Department();
      number1.departmentname ="IT";
      number1.workers = 8;
      //iepriekšējais departaments
      exnumber1.departmentname = " Servisa nodaļas ";
      //iepriekšējā departamenta adrese (otra nodefinētā adrese)
      exnumber1.adrese = exadrese;
      
     
      System.out.println("Mani sauc " + nr1.name + ",es dzīvoju " + darb1.fullAdress());
      
      System.out.println("Mani sauc " + nr2.name +",un es pārgāju uz "+number1.departmentname
      +" no"+exnumber1.departmentname+", kurā bija "+number1.workers+" darbinieki"+" un tā atradās "+exadrese.fullAdress());
   }
     
       
    }
    
    

