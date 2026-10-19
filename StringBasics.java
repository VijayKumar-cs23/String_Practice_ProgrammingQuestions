// //WAP to reverse a String
// class StringBasics{

//     public static void main(String[] args) {

//         String s = "vijay";
//         String rev ="";
//         for(int i =s.length()-1;i>=0;i--){
//             rev += s.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }


//WAP to Count the vowels in a Given String
// class StringBasics{

//     public static void main(String[] args) {

//         String s = "vijay";
//         int count = 0;
//         for(int i =0;i<s.length();i++){
//             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//             count++;
//         }
//          System.out.println("String length"+s.length());
//         System.out.println("Total vowels :"+count);
        
//         System.out.println("Total consonats : "+(s.length()-count));
//     }
// }

//**************** */
// // Wap to count the lower case , upper case, number case and special case.
// public class StringBasics{
// public static void main(String[] args) {
//     String s = "Vijay_cs23@Kumar";
//     int lc = 0, UC = 0, NC = 0, SpC = 0;
    
//     for(int i = 0;i<s.length();i++){
//         char ch = s.charAt(i);
//         if(ch>='a'&&ch<='z') lc++;
//         else if(ch>='A'&&ch<='Z') UC++;
//         else if(ch>='0'&&ch<='9') NC++;
//         else
//         SpC++;
    
//     }
     
//     System.out.println("LowerCase Count :"+lc);
//     System.out.println("UpperCase Count :"+UC);
//     System.out.println("NumberCase Count :"+NC);
//     System.out.println("SpecialCase Count :"+SpC);
// }
// }


//************* */
// Wap to arrange in order the lower case , upper case, number case and special case for a given String.
// public class StringBasics{
// public static void main(String[] args) {
//     String s = "Vijay_cs23@Kumar";
//     String newStr = "";
//     String lc = "", UC = "", NC = "", SpC = "";
    
//     for(int i = 0;i<s.length();i++){
//         char ch = s.charAt(i);
//         if(ch>='a'&&ch<='z') lc+=ch;
//         else if(ch>='A'&&ch<='Z') UC+=ch;
//         else if(ch>='0'&&ch<='9') NC+=ch;
//         else
//         SpC+=ch;
    
//     }
//     newStr=lc+UC+NC+SpC;
     
//     System.out.println("LowerCase  :"+lc);
//     System.out.println("UpperCase  :"+UC);
//     System.out.println("NumberCase  :"+NC);
//     System.out.println("SpecialCase  :"+SpC);
//     System.out.println(newStr);
// }
// }


//**************** */

// Wap to count the given .
public class StringBasics{
public static void main(String[] args) {
    String s = "Vijay_cs23@Kumar";
    int lc = 0, UC = 0, NC = 0, SpC = 0;
    
    for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch>='a'&&ch<='z') lc++;
        else if(ch>='A'&&ch<='Z') UC++;
        else if(ch>='0'&&ch<='9') NC++;
        else
        SpC++;
    
    }
     
    System.out.println("LowerCase Count :"+lc);
    System.out.println("UpperCase Count :"+UC);
    System.out.println("NumberCase Count :"+NC);
    System.out.println("SpecialCase Count :"+SpC);
}
}
