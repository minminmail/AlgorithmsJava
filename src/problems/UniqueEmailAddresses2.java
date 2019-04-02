package problems;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses2 {
	
	/*
	 * 
		 Every email consists of a local name and a domain name, separated by the @ sign.
	
	For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
	
	Besides lowercase letters, these emails may contain '.'s or '+'s.
	
	If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
	
	If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
	
	It is possible to use both of these rules at the same time.
	
	Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 
	
	 
	 * 
	 */
	

	    public static int numUniqueEmails(String[] emails) {
	    	//HashSet contains unique elements only.
	       Set<String> newEmails=new HashSet<String>();
	       for(String email:emails) {
	        int numPos = email.indexOf("@");
	        String frontStr= email.substring(0, numPos);
	        String endStr=email.substring(numPos);
	      
	        if( frontStr.contains("+"))
	        {frontStr=frontStr.substring(0, frontStr.indexOf("+"));
	        
	        }
	    
	        frontStr=frontStr.replace(".", "");
	        newEmails.add(frontStr+endStr);
	       }
	        
	       return newEmails.size();
	    }
      public static void main(String args[])
      {
    	  String emails[]= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
    	  int num= numUniqueEmails(emails);
    	  System.out.print("The unique email is :"+num);
    	  
    	  String testEmails2[]= {"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};
    	  int num2= numUniqueEmails(testEmails2);
    	  System.out.print("The unique email is :"+num2);
      }

}
