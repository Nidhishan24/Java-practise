class Leap {

    boolean isLeapYear(int year) {
        if(year%100==0){
            if(year%400 ==0){
                return true;
            }
            else {
                return false;
            } }
            else if(year%4 ==0){
                 return true;
            }
        else {
                return false;}
        
    }
       String print(boolean isLeapYear,int year){
           if(isLeapYear==true){
               return year + "is a leap year";
           }
           else
               return year + "is not a leap year";
       }     
    }
        
