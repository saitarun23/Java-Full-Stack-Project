package backend.com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="orderdetails")
public class Orderdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="totalamount")
	private float totalamount;
	
	@OneToMany(mappedBy = "orderDetails", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Medicineorderdetails> medicineorderdetails;
}