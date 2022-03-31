package Phase1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) throws IOException {
		int operation=0;
		System.out.println("Press 1 for Create File, Press 2 for Delete File,  Press 3 for Delete File, Press 4 for Delete File, 5 for Exit");
		Scanner sc=new Scanner(System.in);
		operation=sc.nextInt();
		
		while(true) {
			switch(operation) {
			
			case 1:
				String path1="D:\\simplilearn\\";
				Scanner sc1=new Scanner(System.in);

				ArrayList<String> al=new ArrayList<>();
				while(true) {
				System.out.println("enter the file name to create");
				String filename=sc.next();
				String finalname=path1+filename;
				System.out.println(finalname);

				//create a file 

				File f=new File(finalname);
				boolean b=f.createNewFile();
				if(b!=true) {
					System.out.println("the file not created");
				}
				else {
					al.add(filename);
					System.out.println("file created");
				}

				System.out.println("the collection of files is "+ al);
				
				}
				
			case 2:
				String path2="D:\\simplilearn\\";
				Scanner sc2=new Scanner(System.in);
				while(true) {
				System.out.println("enter the file name to be deleted");
				String filname=sc2.next();
				String finalfile=path2+filname;
				File file=new File(finalfile);
				file.delete();
				System.out.println("file deleted");
				}
				
			case 3:
				String path="D:\\simplilearn\\";
				File f=new File(path);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
				}
				
			case 4:
				String path3="D:\\simplilearn\\";
				File f1=new File(path3);
				Scanner sc3=new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname=sc.next();
				File filename1[]=f1.listFiles();
				int flag=0;
				for(File ff:filename1) {
					if(ff.getName().equals(filsearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
					
					
					
				}

				if(flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
				
			}
		}
	}
}
