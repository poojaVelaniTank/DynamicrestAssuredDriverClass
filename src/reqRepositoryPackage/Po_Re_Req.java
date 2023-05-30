package reqRepositoryPackage;
import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.BeforeTest;

import commonFunctionPackage.UtilComFunct;
public class Po_Re_Req {
	@BeforeTest
	public static String base_URI()
	{   
		String baseURI="https://reqres.in/";
		return baseURI;
		}
public static String post_resource()
{
	String resource="/api/users";
	return resource;
}
	
public static String post_req_tc1() throws IOException 
{
	ArrayList<String> data=UtilComFunct.readdataexcel("Post_Test_Data","Post_TC1");//"post_data","Post_TC1"
	String  req_name=data.get(1);
	String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;
}
public static String post_req_tc2() throws IOException 
{
	ArrayList<String> data=UtilComFunct.readdataexcel("Post_Test_Data","Post_TC2");//"post_data","Post_TC2"
	String  req_name=data.get(1);
	String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;}


public static String post_req_tc3() throws IOException
{
	ArrayList<String> data=UtilComFunct.readdataexcel("Post_Test_Data","Post_TC3");//"post_data","Post_TC3"
	String  req_name=data.get(1);
	String req_job=data.get(2);
	String requestBody="{\r\n"
			+ "    \"name\": \""+req_name+"\",\r\n"
			+ "    \"job\": \""+req_job+"\"\r\n"
			+ "}";
	return requestBody;
}
}
	

 
