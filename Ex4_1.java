class Ex4_1 
{ 
 public static void main(String args[]) 
 { 
  String s1 = "JPR"; 
  String s2 = "uid"; 
  String s3 = "  DCN "; 
  System.out.println("String in Lowercase : " + s1.toLowerCase()); 
  System.out.println("String in Uppercase : " + s2.toUpperCase()); 
  String s4 = s2.replace("uid" , "MIC"); 
  System.out.println("String after s2 replacing : " + s4); 
  System.out.println("String before triming :" + s3); 
  System.out.println("String after triming : "+ s4.trim()); 
 
  boolean b,b1; 
  b = s3.equals(s4); 
  if(b == true) 
   System.out.println("Both strings are equal."); 
  else 
   System.out.println("Both strings are not equal."); 
  String s5 = "jpr"; 
  b1 = s1.equalsIgnoreCase(s5); 
  if(b1 == true) 
   System.out.println("Both strings are equal."); 
  else 
   System.out.println("Both strings are not equal."); 
  System.out.println("Length of s3 : " + s3.length()); 
  System.out.println("Character of s1 at index 0 :  " + s1.charAt(0)); 
   
  int c = s1.compareTo(s2); 
  if(c == 0) 
   System.out.println("Both are equal"); 
  else if (c < 0) 
   System.out.println("s1 < s2"); 
  else 
   System.out.println("s1 > s2"); 
 
  System.out.println("Concatenation :: " + s1.concat(s2)); 
            
  
  System.out.println("Substring of s1 : " +s1.substring(1)); 
 } 
} 
