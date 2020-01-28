package mapper;

import org.mapstruct.Mapper;

import model.Customer;
import model.CustomerDto;
@Mapper
public interface CustomerDTOImpl {

		public Customer customerDtoToCustomer(CustomerDto dto);
	}


