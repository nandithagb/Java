package javaaa;
public class String_buffer
{
	public static void main(String[] args) {
		String s="World Wide Web";
		System.out.println(worldwide(s));
	}
	static int worldwide(String s){
	    String[] sp=s.split(" ");
	    StringBuilder ans= new StringBuilder();
	    for(String se:sp){
	        ans.append(String.valueOf(helper(se.toLowerCase())));
	    }
	    String t=ans.toString();
	    return Integer.valueOf(t);
	}
	static int helper(String s){
	    int i=0,l;
	    int j=s.length()-1;
	    int sum=0;
	    if(s.length()%2==0){
	        l=s.length()/2;
	    }
	    else{
	        l=s.length()/2+1;
	    }
	    for( i=0;i<l;i++,j--){
	        if(i==j){
	            sum+=s.charAt(i)-'a'+1;
	        }
	        int t=Math.abs((s.charAt(i)-'a'+1)-(s.charAt(j)-'a'+1));
	        sum+=t;
	    }
	    return sum;
	}
}

