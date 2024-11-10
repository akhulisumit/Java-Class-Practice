public static String change_char(String s) {
    // complete the function template
   char firstChar = s.charAt(0);
   StringBuilder result = new StringBuilder();

   result.append(firstChar);

   for(int i = 1; i<s.length();i++){
       char currentChar = s.charAt(i);

       if(currentChar == firstChar){
           result.append('$');
       }
       else{
           result.append(currentChar);
       }
   }
   return result.toString();
}