public class String_Buffer{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Bhavesh");
// Check the StringBuffer Capacity.
      System.out.println(sb.capacity());

// Check the length.
      System.out.println(sb.length());

    //  append
       sb.append(" Yadav");
       System.out.println(sb);

    // Convert StringBuffer -toString.
      // String str = sb.toString();
      // System.out.println(str);

    //   Delete method.
       sb.deleteCharAt(9);
       System.out.println(sb);

    // Instert data
       sb.insert(12, " Programmer");
       System.out.println(sb);
       
    // Set the length
      sb.setLength(29);
      System.out.println(sb);
      
    }

}