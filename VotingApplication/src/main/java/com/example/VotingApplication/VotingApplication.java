package com.example.VotingApplication;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class VotingApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(VotingApplication.class, args);
		try(AnnotationConfigApplicationContext bean = new AnnotationConfigApplicationContext("com.example.VotingApplication");
			Scanner in=new Scanner(System.in))
		{
			int ch = 0;
			Authority obj4=(Authority) bean.getBean("authoritycounter");
			UserList obj3=(UserList) bean.getBean("simpleuserlist");
			do
			{
				System.out.println("\n\nEnter Your Choice \nEnter 1 to Vote (User) \nEnter 2 to See Votes (Admin) "
						+ "\nEnter 0 to Exit");
				ch = in.nextInt();
				String beanId = "";
				switch(ch)
				{
					case 1 ->
					{
						int ch2;
						String name;
						in.nextLine();
						System.out.println("Enter Your Name");
							name = in.nextLine();
						System.out.println("\nChoose The Political Party \nEnter 1 for BJP \nEnter 2 for INC "
								+ "\nEnter 3 for AAP");
						ch2 = in.nextInt();
						switch(ch2)
						{
							case 1 -> beanId ="bjp";
							case 2 -> beanId = "inc";
							case 3 -> beanId = "aap";
						}
						PoliticalParty obj1 = (PoliticalParty) bean.getBean(beanId);
						User obj2 = (User) bean.getBean("simpleuser");
						obj2.setUserName(name);
						obj2.setPoliticalParty(obj1);
						obj3.addUser(obj2);
						obj4.setUserList(obj3);
					}
					case 2 ->
					{
						obj4.getUserList().getUsersList().
						forEach(
								obj -> 
								System.out.println(obj.getUserName() + " Voted For :  " + 
											obj.getPoliticalParty().getPartyName()));
					}
					case 0 ->
					{
						bean.close();
					}
					default ->
					{
						System.out.println("Invalid Choice, choose Again");
					}
				}
			}while(ch!=0);
		}
	}
}
