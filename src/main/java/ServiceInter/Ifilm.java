package ServiceInter;

import java.util.List;

import entity.film;
import entity.Customer;

public interface Ifilm {
	//插入客户信息
	public int addCustomer(Customer customer);
	//根据顾客id查询
	public List<film> getCustomerAddress(int customer_id);
	//根据顾客id删除
	public int deleteCustomer(int customer_id);

}
