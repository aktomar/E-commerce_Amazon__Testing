package Testcases;

import org.testng.annotations.Test;

import Base.Base_Class;
import WebPages.Login_Page;
import WebPages.Login_User_Details;
import WebPages.Search_Item_On_Amazon;

public class TC03_SearchItemsOnAmazon extends Base_Class {
	
	
	@Test(description ="Searching items on Amazon...")
	public void Verify_SearchItems_OnAmazon() throws InterruptedException {
		
				//Login Page class Object..
				Login_Page login_page = new Login_Page(driver);
				login_page.AmazonSignIn();
				
				//Login_user_details class Object..
				Login_User_Details user_detail = new Login_User_Details(driver);
				user_detail.Enter_User_Details(Username,Password);
				
				//Search_Item_On_Amazon class Object..
				Search_Item_On_Amazon search_item = new Search_Item_On_Amazon(driver);
				search_item.Enter_item_in_SearchBar(Search_Item);
				search_item.Click_On_SearchButton();
				search_item.Click_On_Searched_Item();
				
				
				
				
		
	}

}
