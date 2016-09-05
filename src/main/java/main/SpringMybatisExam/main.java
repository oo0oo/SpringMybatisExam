package zyx.SpringMybatisExam;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ServiceInter.IAddress;
import ServiceInter.Ifilm;
import entity.film;
import entity.Customer;

public class main 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
		Ifilm mapper = (Ifilm) ctx.getBean("customerMapper");
		Customer mapper1=(Customer) ctx.getBean("customer");
		Scanner s = new Scanner(System.in);
		System.out.println("请输入FirstName(first_name):");
		String d2=s.nextLine();
		System.out.println("请输入LastName(last_name):");
		String d3=s.nextLine();
		System.out.println("请输入Email(email):");
		String d4=s.nextLine();
		System.out.println("请输入Address ID:");
		int d5=s.nextInt();
		IAddress mapper2 = (IAddress) ctx.getBean("addressMapper");
		while(mapper2.query(d5)==null){
    		System.out.println("输入错误，请重新输入Address_id");
    		d5=s.nextInt();
    	}
		mapper1.setFirst_name(d2);
		mapper1.setLast_name(d3);
		mapper1.setEmail(d4);
		mapper1.setAddress_id(d5);
		Date date=new Date();
		mapper1.setCreate_date(date);
		
		int n=mapper.addCustomer(mapper1);

		
			Scanner s7 = new Scanner(System.in);
			System.out.println("请输入你要删除的Customer的ID:");
			int m=mapper.deleteCustomer(s7.nextInt());
			if(m>0){
				System.out.println("删除成功");
				
			}
			else {
				System.out.println("删除失败");
			}
		}


}
