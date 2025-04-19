package project.project;

import java.util.Random;

public class TestData {

	String [] TextInput = {"Lubab", "Rujad", "Antary"};
	String [] Email = {"Lubab@gmail.com", "Rujad@gmail.com", "Antary@gmail.com"};
	String [] Date = {"5/3/2002", "10/1/2000", "7/4/2002"};
	String [] Password = {"Lubab!@#$%^&", "P@$$w0rd", "Ant@ry352002"};
	String [] Number = {"962785533879", "962785533987", "962785533789"};
	String FilePath = "C:\\Users\\Owner\\OneDrive\\Desktop\\MidExam_LubabAlkhaldi.docx";
	String [] Gender = {"Male", "Female"};
			
	Random random = new Random();
	int RandomIndex = random.nextInt(3);
	int RandomIndexGender = random.nextInt(Gender.length); // (NameOfString.length)
	
	String RandomText = TextInput[RandomIndex];
	String RandomEmail = Email[RandomIndex];
	String RandomDate = Date[RandomIndex];
	String RandomPassword = Password[RandomIndex];
	String RandomNumber = Number[RandomIndex];
	String RandomGender = Gender[RandomIndexGender];
	

}