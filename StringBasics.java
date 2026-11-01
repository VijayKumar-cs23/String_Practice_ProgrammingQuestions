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

// // Wap to count the given .
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



// check if the given String is palindrom or not.

// public class StringBasics{
//     public static void main(String[] args) {
//         String str = "malam" ;
//         System.out.println(isPalindrome(str)==true?str+" is palindrome.":str+" is not palindrome.");
//     }
//     public static boolean isPalindrome(String s){
//        int i = 0;
//        int j = s.length()-1;
//        while(i<j){
//         if(s.charAt(i)!=s.charAt(j)) 
//             return false;
//         i++;
//         j--;
//        }
//        return true;
//     }
// }


//**************** */
// // input "JAVA IS EASY" , expected output = "AVAJ SI YSAE"

// public class StringBasics{
//     public static void main(String[] args) {
//         String s = "JAVA IS EASY";
//         System.out.println(reverse(s));
//     }
//     public static String reverse(String s ){
//         int i = 0;
//         int j = 0;
//         String res ="";
//         while(j<s.length()){
//             while(j<s.length() && s.charAt(j)!=' ')j++;
//             int k= j-1;
//             while(k>=i){
//                 res += s.charAt(k);
//                 k--;
//             }
//             res+=" ";
//             j++;
//             i=j;

//         }
//         return res.trim();
//     }
// }


//************** */
// // input "JAVA IS EASY" , expected output = "EASY IS JAVA"
// class StringBasics{
//     public static void main(String[] args) {
//         String s = "JAVA IS EASY";
//         System.out.println(reverse(s));
//     }
//     public static String reverse(String s){
//         int i = s.length()-1;
//         int j =s.length()-1;
//         String newString = "";
//         while(j>=0){
//             while(j>=0&&s.charAt(j)!=' ')j--;
//             int k = j+1;
//             while(k<=i){
//                 newString += s.charAt(k++);
                
//             }
//             newString += " ";
//             j--;
//             i=j;
               
            
//         }
//         return newString.trim();
//     }
// }

// //************* */
// // Remove Duplicate.
// class StringBasics{
//     public static void main(String[] args) {
//         String s = "javadev";
//         char[] ch = s.toCharArray();
//         String res = "";
//         for(int i = 0;i<s.length();i++){
//             if(ch[i]=='\u0000')continue;
//             for(int j=i+1;j<s.length();j++){
//               if(ch[i]==ch[j]){
//                 ch[j]='\u0000';
//               }
               
//             }
//             res += ch[i];   
//         }
//         System.out.println(res);
//     }
// }

//***** */
// // for a given string exchange character upper case to lowercase and lowercase to uppercase without using upper case method.  
// public class StringBasics{
//     public static void main (String [] args){
//         String s = "AcDgEs";
//         char[] ch = s.toCharArray();
//         for(int i = 0;i<s.length();i++){
//             if(ch[i]>='A' && ch[i]<='Z'){
//                 ch[i]+=32;
//             }else if(ch[i]>='a'&&ch[i]<='z'){
//                 ch[i]-=32;
//             }
//         }
//         System.out.println(ch);
//     }
// }


//***************** */
// // No of occurence of each character.
// class StringBasics{
//     public static void main(String[] args) {
//         String s = "javadev";
//         char[] ch = s.toCharArray();
//         for(int i = 0;i<s.length();i++){
//             if(ch[i]=='\u0000')continue;
//             int count = 1;
//             for(int j = i+1; j <s.length(); j++){
//                 if(ch[i]==ch[j]){
//                     count ++;
//                     ch[j]='\u0000';
//                 }
//             }
//             System.out.println(ch[i]+ " count : "+count);
//         }
//     }
// }


// //************** */
// //Wajp to print non repeating char in a given String.

// class StringBasics{
//     public static void main(String[] args) {
//         String s= "javayy";
//         char[] ch = s.toCharArray();
        
//         for(int i=0;i<s.length();i++){
//             if(ch[i]=='\u0000')continue;
//             for(int j=i+1;j<s.length();j++){
//                 if(ch[i]==ch[j]){
//                     ch[i]='\u0000';
//                     ch[j]='\u0000';
//                 }        
//             }    
//         }
//         System.out.println(ch);
//     }
// }



// class StringBasics{
//     public static void main(String[] args) {
//         String s = "bosssssssscccc";
//         char[] ch = s.toCharArray();
        
//         for(int i = 0; i<s.length(); i++){
//             for(int j=i+1; j<s.length();j++){
//                 if(ch[i]==ch[j]){
//                     ch[j]='$';
//                     i++;
//                     j++;
//                 }
//             }
//         }
//         System.out.println(ch);
//     }
// }


// // input s = 'javadev' replace all the vowels to '_' present in the String output s = 'j_v_d_v'.
// class StringBasics{
//     public static void main(String[] args) {
//         String s = "javadev";
//         char[] ch = s.toCharArray();
//         int count = 0;
//         for(int i = 0;i<s.length();i++){
//             if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
//                 count++;     
//             }     
//         }
//         for(int i = 0;i<s.length();i++){
//              if((ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')&&(count>=3)){     
//                 ch[i]='_';     
//             }      
//         }   
//         System.out.println(ch);
//     }
// }



// input- java, output- aa 
// public class StringBasics{
//    public static void main(String[] args) {
//     String s = "javadeveloper";
//     String newString = "";
//     char[] ch = s.toCharArray();
//     for(int i=0;i<=s.length();i++){
//         for(int j=i+1;j<s.length();j++){
//             if(ch[i]==ch[j]){
//                newString+=ch[j];
//             }
//         }
//     }
//     System.out.println(newString);
//    }
// }



//************** */
// //wajp to occurance repeated char. 

// class StringBasics{
//     public static void main(String[] args) {
//         String s = "Ramana kumar";
//         char[] ch = s.toCharArray();
        
//         for(int i = 0;i<s.length();i++){
//             if(ch[i]>='0'&&ch[i]<='9') continue;
//             char count = '1';
//             for(int j= i+1;j<s.length();j++){
//                 if(ch[i]==ch[j]){
                  
//                   ch[j]= ++count;
//                 }
//                 if(count >'1'){
//                     ch[i]='1';
//                 }    
//             }            
//         }       
//       System.out.println(ch);              
//     }    
// }


//******************** */
// //Wajp to make a String as initCap Formate. input- "java is easy" , output- "Java Is Easy"; 

// class StringBasics{
//     public static void main(String[] args) {
//         String s = "Java is Easy";
//         char[] ch = s.toCharArray();
//         for(int i = 0;i<s.length();i++){
//             if(ch[i]>='a'&&ch[i]<='z'){
//                if(i==0||ch[i-1]==' '){
//                 ch[i]-=32;
//             }
//             }
            
//         }
//         System.out.println(ch);
//     }
// }


//************ */
// // WAJP to encode and decode for a given String.
// class StringBasics{
//     public static void main(String[] args) {
//        System.out.println(encode("abc",2)); //cde
//        System.out.println(decode("cde",2)); //abc
//     }
//     public static String encode(String s,int n){
//         char[] ch = s.toCharArray();
//         for(int i=0;i<s.length();i++){
//            if(ch[i]>='a'&& ch[i]<='z')
//             ch[i] = (char)(((((ch[i]+n-'a')%26)+26)%26)+'a');
//            else if(ch[i]>= 'A' && ch[i] <= 'Z')
//             ch[i] = (char)(((((ch[i]+n-'A')%26)+26)%26)+'A');
//         }
//         return new String(ch);
//     }
//      public static String decode(String s,int n){
//         return encode(s,-n);
//      }
// }




// // Arrange the characters in ascending order for a given String.
// public class StringBasics{
//    public static void main(String[] args) {
//     String s = "azamu";
//     char[] ch =  s.toCharArray();
//     for(int i=0;i<=s.length();i++){
//         for(int j=i+1;j<s.length();j++){
//             if(ch[i]>ch[j]){
//                 char temp = ch[i];
//                 ch[i] = ch[j];
//                 ch[j] = temp;
//             }
//         }
//    }
//    System.out.println(ch);
// }
// }


