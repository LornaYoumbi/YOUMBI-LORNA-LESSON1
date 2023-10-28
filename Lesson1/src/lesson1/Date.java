/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1;

/**
 *
 * @author pc
 */
public class Date {
    int  day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public String monthchar (){
        if (getMonth()==1){
        return "January";
        }else if (getMonth()==2){
            return "Febuary";
        }else if (getMonth()==3){   
            return "March";
        }else if (getMonth()==4){   
            return "April";
        }else if (getMonth()==5){   
            return "May";
        }else if (getMonth()==6){   
            return "June";
        }else if (getMonth()==7){   
            return "July";
        }else if (getMonth()==8){   
            return "August";
        }else if (getMonth()==9){   
            return "September";
        }else if (getMonth()==10){   
            return "October";
        }else if (getMonth()==11){   
            return "November";
        }else{ 
            return "December";
        }
        
        
       
    }
}
