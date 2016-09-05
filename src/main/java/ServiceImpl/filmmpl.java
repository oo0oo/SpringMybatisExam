package ServiceImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;

import ServiceInter.IAddress;
import ServiceInter.Ifilm;
import entity.film;
import entity.Customer;

public class filmmpl implements Ifilm{

	@Override
	public int addCustomer(Customer customer) {
		ApplicationContext ctx = null;
		Ifilm mapper = (Ifilm) ctx.getBean("customerMapper");
		int n=mapper.addCustomer(customer);
		if(n>0){
			List<film> list=mapper.getCustomerAddress(customer.getCustomer_id());
			System.out.println("已保存的数据如下:");
			System.out.println("ID: "+list.get(0).getCustomer().getCustomer_id());
			System.out.println("FirstName: "+list.get(0).getCustomer().getFirst_name());
			System.out.println("LastName: "+list.get(0).getCustomer().getLast_name());
			System.out.println("Email: "+list.get(0).getCustomer().getEmail());
			System.out.println("Address: "+list.get(0).getAddress());
		}
		else{
			System.out.println("添加失败");
		}
		return 0;
	}

	@Override
	public List<film> getCustomerAddress(int customer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return 0;
	}



}
