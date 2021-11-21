
package pattern;

public class memberfactory {
    

    public staff getinfo(String member_info)
    {
//    String s = member_info.toLowerCase();
//        switch (s)
//        {
//          case "doctor" :
//                    return new doctor();
//         case "ta" :
//                    return new TA();
//          default:
//                    return null;
//        
//        }
        
        
    if(member_info.equalsIgnoreCase("doctor"))
    {
        return new doctor();
    }
    
    else
        return new TA();
  
    }
    
}
