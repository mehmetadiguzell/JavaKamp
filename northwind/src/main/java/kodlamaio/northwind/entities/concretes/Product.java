package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity    //->bir veritabanı tablosu olacağını belirtir
@Table(name="products") //->bu sınıfın veritabınında hangi tabloya karşılık geliyor
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	//->bu tablonun hangi kolonuna karşılık geliyor
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)           //id özelleştirme
	@Column(name="product_id") 
	private int id;
	
	//@Column(name="category_id")
	//private int CategoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
}
