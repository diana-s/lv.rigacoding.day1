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
public class Adrese {
    public String country;
    public String city;
    public String street;
    public String house;
    public String flat;
    
    
    public String fullAdress(){
        /*tā kā, iespējams ne vienmēr visi lauki tiks aizpildīti, tad jāizveido jauns mainīgais
        un tad viņā pārbauda visus parametrus
        */
        //jāpieliek tukšas "", lai mēs rezervētu vietu šim konkrētajam objektam
        String fulladress="";
        //šajā gadījumā pārbaudam, ja sistēma neparāda, ka parametrs ir nulle,tad izvada norādīto parametru
        //ja būtu nulle, tad neko nezivada
        if(country !=null){
            /* '+=' pievieno mainīgajam to, kas seko aiz, tas ir tas pats kā norādīt
            fulladress = fulladress + country + ",";
            */
            fulladress+=country+", ";
        }
        if(city !=null){
            fulladress+=city+", ";
        }
        if(street !=null){
            fulladress+=street+", ";
        }
        if(house !=null){
            fulladress+=house+", ";
        }
        
        //ja ir iespēja, ka sistēma atrod nulli vai tukšumu, tad norādam, ka, ja
        //sistēma atrod nulli vai tukšumu, tad neizvada neko
        if(flat !=null&& flat !=""){
            fulladress+=flat+", ";
        }
        
        /*šobrīd var parādīties adrese "Latvija, Rīga, " - ir divi lieki simboli beigās "," un atstarpe,
        lai izvairītos no šādas situācijas, varam izveidot papildus funkciju
         */
        if(fulladress.length()>0){
            fulladress = fulladress.substring(0,fulladress.length()-2);
        }
       /*substring nozīmē, ka sistēma paņem tikai daļu no izvadāmā teksta, mēs norādam, ka izvada sākot no 0tās pozīcijas
       un visā garumā, bet tā kā mums 2 simboli ir lieki, tad mums ir jāatmet pēdējie divi simboli ar "-2"
        "fulladress.length()-2" nozīmē visa izvadāmā teksta, šajā gadījumā pilnas adreses, garums mīnuss divi pēdējie simboli
        */
        return fulladress;
        
       
    }          
    
}
