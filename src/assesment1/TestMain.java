package assesment1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class TestMain {
	public static void main(String[] args)throws IOException {
		String path="C:\\simplilearn file\\";
   	 Scanner sc=new Scanner(System.in);
  	 ArrayList<String> al=new ArrayList<>();
  	 while(true) {
  		 System.out.println("Welcome to our company:Lockers Pvt. Ltd.");
  		 System.out.println("Developer:Rahul K");
  	 System.out.println("enter the choice: 1.Add file 2. Delete file 3.Display files 4.Search File 5.exit program");
  	 int choice=sc.nextInt();
     	 switch(choice) {

     	 case 1:System.out.println("enter the file name to create");
  	     String filename=sc.next();
  	     String finalfilename=path+filename;
  	     File f=new File(finalfilename);
  	     boolean result=f.createNewFile();
  	     if(result==false) {
 		 System.out.println("file is not created");
  	     }
  	     else {
 		 al.add(filename);
		     System.out.println("file is created at : "+filename);
  	     }
  	     System.out.println(al);
  	     break;
     	 
     	 
     	 case 2:String path1="C:\\simplilearn file\\";
     	 System.out.println("Enter the file name to delete");
   	 String filename2=sc.next();
   	 String finalfilename2=path+filename2;
   	 File fi=new File(finalfilename2);
   	 fi.delete();
   	 break;
     	 
     	 
     	 case 3:String path2="C:\\simplilearn file\\";
   	 File fs=new File(path);
   	 File filename1[]=fs.listFiles();
   	 for(File ff:filename1) {
   		 System.out.println(ff.getName());
   	
      	 }
   	 break;
   	 
     	 case 4:String path3="C:\\simplilearn file\\";
   	 File fd=new File(path3);
   	 Scanner sc1=new Scanner(System.in);
   	 System.out.println("eneter a file to search");
   	 String filenameserach=sc.next();
   	 File filename3[]=fd.listFiles();
   	 int flag=0;
   	 for(File fk:filename3) {
  		 if(fk.getName().equals(filenameserach)){
   			 flag=1;
  			 
   			 break;
   		 }
   		 else {
   		 flag=0;
   			 
   		 }
  		 
     	 }
   	 if(flag==1) {
   		 System.out.println("file is available");
   	 }
   	 else {
   		 System.out.println("file is not available");
   	 }
   	 
     	case 5:
     		
   	     System.exit(0);	

     	 }
   	 
  	 
	}
}
}

	
	

    	 



