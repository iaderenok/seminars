/**
 * prog3
 */
public class prog3 {
    public static void main(String[] args){
        String my_str= "4 + 5 - 2 + 3 * 10"; 
        int result =0;
        String zn = "";
        String[] arr = my_str.split(" ");
        for (int i = 0; i < arr.length; i++){
            if (i%2==0){
                if (zn == ""){
                    String a = arr[i];
                    result = Integer.parseInt(a);
                }
                if(zn.equals("+")){
                    String a = arr[i];
                    result = result + Integer.parseInt(a);
                }
                if(zn.equals("-")){
                    String a = arr[i];
                    result = result - Integer.parseInt(a);
                }
                if(zn.equals("*")){
                    String a = arr[i];
                    result = result * Integer.parseInt(a);
                }
                if(zn.equals("/")){
                    String a = arr[i];
                    if (Integer.parseInt(a) == 0){
                        System.out.println(" В примере присутствует деление на нуль");
                        result = 0;  
                    }
                    else{
                    result = result / Integer.parseInt(a);
                    }
                }
                
            }
            if (i%2 != 0){
                zn = arr[i]; 
            }
            
        }
        System.out.println(result);

    }
    
}