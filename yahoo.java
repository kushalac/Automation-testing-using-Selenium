import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class yahoo {
	static WebDriver driver;

	@Test(dataProvider="create")
	  public static void  Test(String fname,String lname,String mail,String passwd,String dob,String num)throws InterruptedException {
	
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kusha\\OneDrive\\Desktop\\project\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
			driver.get("https://login.yahoo.com/account/create?lang=en-IN&src=ym&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAFz4lzumyyTw_ImVgPcWOFo68r_UlfmfABB3F6JGoL5t8wwAIcIgfBeZ2sUdQLqw1ROTw_8IJrhBE9LET2FbqNSX7VAgzylOR96hOqYEN6DZFR3-ALLzUMZ5i_zH9Tc7kYdInQOP8A10sK9i3d6db96slyxBImZk4kppSgaFeLjF&specId=yidregsimplified");
	        driver.manage().window().maximize();



driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys(fname);

driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]")).sendKeys(lname);

driver.findElement(By.xpath("//*[@id=\"usernamereg-userId\"]")).sendKeys(mail);

driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys(passwd);

driver.findElement(By.xpath("//*[@id=\"usernamereg-birthYear\"]")).sendKeys(dob);


driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();



try {
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/form/fieldset/input")).sendKeys(num);

	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/form/div[2]/button")).click();
	

}
catch(Exception e)
{
	driver.close();
}

driver.close();
	
}

@DataProvider(name="create")
public static Object[][] getData(){

	return new Object[][] {
		{"Ram","K","Rm028","Ram@123","20002","7890789090"},
		{"","N","krishfeb2002","Krishl@123","2002","9090908790"},
		{"Nayak","","nayak8789","nayak","2000","6767676789"},
		{"Varma","K","Varma90872","Varma@123","2002","9879879890"},
		{"Abhay","@","Abhay9089","543211","2002","9809809009"}
		};
}
 
public static void main(String[] args) throws InterruptedException
   {

   }

}
