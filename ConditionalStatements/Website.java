// // find type of website(domain name) and protocol used.

// import java.util.*;
// class Website
// {
//     public static void main(String[] args)
//     {
//         String web;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter url: ");
//         web=sc.nextLine();
//         int i= web.lastIndexOf(".");  //for domain name
//         String domain=web.substring(i,web.length());
        
//         if(domain.equals(".com"))
//             System.out.println("commercial");
        
//         else if (domain.equals(".edu"))
//             System.out.println("education");
        
//         else if( domain.equals(".gov"))
//         System.out.println("goverment");
        
//         else if(domain.equals(".in"))
//             System.out.println("indian");
        

//         //for protocol 
//         String protocol=web.substring(0,web.indexOf(":"));
//         // System.out.println(protocol);
//         if(protocol.equals("http"))
//         System.out.println("Hypertext Transfer Protocol");
//         else if(protocol.equals("https"))
//         System.out.println("Hypertext Transfer Protocol Secure");
//         else if(protocol.equals("ftp")) 
//         System.out.println("File Transfer Protocol");
        
//     }
// }

import java.lang.*;
import java.util.*;
class Website{
    public static void main(String agrs[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter url: ");
        String url;
        url=s.nextLine();
        int i=url.lastIndexOf(".");
        String domain=url.substring(i+1,url.length());
        int p=url.indexOf(":");
        String protocol=url.substring(0,p);

        
          if (domain.equals("com"))
        System.out.println("commercial website");
        else if(domain.equals("edu"))
        System.out.println("educational");
        else if(domain.equals("in"))
        System.out.println("indian");
        
        if (protocol.equals("http"))
        System.out.println("hypertext");
        else if(protocol.equals("ftp"))
        System.out.println("file transfer");
    }
}