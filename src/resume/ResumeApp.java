package resume;

import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {

	public static void main(String[] args) {
		
		String userChoice = "";
		int count  = 0;
		
		//Prompt and Record name.
		print("Enter your name.");
		Scanner name = new Scanner(System.in);
		String userName = name.nextLine();
		
		//Prompt and Record email.
		print("Enter your email.");
		Scanner email = new Scanner(System.in);
		String userEmail = email.nextLine();
		
		
		
		
		//Prompt and Record Skills and Ratings
	
		SkillsRating skill = new SkillsRating();
		ArrayList<String> SkillsList = new ArrayList<String>();
		 do{
		print(skill.skill());
		//Intakes user skill input and adds to Array
		Scanner scan = new Scanner(System.in);
		String userSkill = scan.nextLine();
		SkillsList.add(userSkill);
		//Prompt for more information, if applicable
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 20 && count >= 1);
		 
		//Prompt and Record School Achievements
		Education e = new Education();
		ArrayList<String> userAchievements = new ArrayList<String>();
		ArrayList<String> userAcademicLevel = new ArrayList<String>();
		 
		do{	 
		print(e.level());
		Scanner level = new Scanner(System.in);
		String userlevel = level.nextLine();
		userAcademicLevel.add(userlevel);
		
		print(e.school());
		Scanner school = new Scanner(System.in);
		String userSchool = school.nextLine();
		userAchievements.add(userSchool);
		
		print("Would you like to add more?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 10 && count >= 1);
		
		
		//Prompt and Record work.
		Work w = new Work();
		ArrayList<String> jobList = new ArrayList<String>();
		ArrayList<String> dutyList = new ArrayList<String>();
		
		do{	
		print(w.jobTitle());
		Scanner title = new Scanner(System.in);
		String userTitle = title.nextLine();
		dutyList.add(userTitle);
		
		do{	
		print(w.jobDuty());
		Scanner job = new Scanner(System.in);
		String userJob = job.nextLine();
		jobList.add(userJob);
		
		print("Would you like to add more Job Duties?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		} while (userChoice.equals("Y"));
		
		print("Would you like to add more Job Titles?");
		Scanner choice = new Scanner(System.in);
		userChoice = choice.nextLine();
		count++;
		} while (userChoice.equals("Y") && count <= 10);
			
		//Prints resume
		print("NAME:");
		print(userName);
		print("");
		
		print("EMAIL:");
		print(userEmail);
		print("");
		
		print("ACHIEVEMENTS:");
		userAchievements.forEach(System.out::println);
		userAcademicLevel.forEach(System.out::println);
		print("");
		
		print("JOBS:");
		dutyList.forEach(System.out::println);
		jobList.forEach(System.out::println);
		print("");
		
		print("SKILLS:");
		SkillsList.forEach(System.out::println);
	}

	private static void print(String p){
		System.out.println(p);
	}
	
	/*private static void printArray(ArrayList a){
		System.out.println(a);
	}*/
}
