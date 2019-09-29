package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories =new ArrayList<>();
	
	static{
		Category category = new Category();
		//adding first category 
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Nice TVs for sale");
		category.setImageURL("CAT_1.png");

		categories.add(category);
	
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("phones and shit");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		
		//third category
				category = new Category();
				category.setId(3);
				category.setName("computers");
				category.setDescription("laptops and shit");
				category.setImageURL("CAT_3.png");

				categories.add(category);
		
		
	
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {

		//for each loop to return all the stuff
		for(Category category : categories){
			if(category.getId()==id){
				return category;
			}
		}
		return null;

	}

}
