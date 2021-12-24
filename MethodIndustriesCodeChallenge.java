public class MethodIndustriesCodeChallenge{

     public static void main(String[] args){
        String result1 = mathFunction(1,1,100);
        System.out.println(result1);
        String result2 = mathFunction(1,2,3); 
        System.out.println(result2);
        String result3 = mathFunction(2,2,4);
        System.out.println(result3);
        String result4 = mathFunction(3,-3,-9);
        System.out.println(result4);
        String result5 = mathFunction(1,2,-1);
        System.out.println(result5);
        String result6 = mathFunction(3,3,1);
        System.out.println(result6);
     }
     
     public static String mathFunction(Integer Number1, Integer Number2, Integer Number3) {
         String resultStr = "";
         if (Number1 + Number2 == Number3) {
             resultStr += "+";
         }
         if (Number1 - Number2 == Number3) {
             resultStr += "-";
         }
         if (Number1 * Number2 == Number3) {
             resultStr += "*";
         }
         if (Number1 / Number2 == Number3) {
             resultStr += "/";
         }
         return resultStr != "" ? resultStr : "None";
     }
}