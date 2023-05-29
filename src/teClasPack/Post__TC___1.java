package teClasPack;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.time.LocalDateTime;
import org.testng.Assert;
import org.testng.annotations.Test;

import comFunPack.APIComFun;
import comFunPack.UtilComFunct;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import reqRepoPack.Po_Re_Req;
public class Post__TC___1
{  @Test
	public static void execute() throws IOException 
	{       
	    for(int i=0;i<5;i++)
		{
		int res_statuscode=APIComFun.res_statusCode(Po_Re_Req.base_URI(),
				Po_Re_Req.post_req_tc1(),Po_Re_Req.post_resource());
	    if( res_statuscode == 201 ) 
	    {
    	String res_responseBody=APIComFun.res_responseBody(Po_Re_Req.base_URI(),
    			Po_Re_Req.post_req_tc1(),Po_Re_Req.post_resource());	
	    Post__TC___1.validator(res_responseBody, res_statuscode);
	    UtilComFunct.evidencecreator("Post_TC1",Po_Re_Req.post_req_tc1(),res_responseBody);
	    break;
	    }
	    else
	    {
	    	System.out.println("Correct status code is not found hence retrying the API");
	    }
		}
		}		
		public static void validator(String res_responseBody,int res_statuscode) throws IOException 
	{
		//parse	the response body
		JsonPath jsp=new JsonPath(res_responseBody);
		String res_name=jsp.getString("name");
		String res_job=jsp.getString("job");
	//	String res_id=jsp.getString("id");
	//	String res_createdAt=jsp.getString("createdAt");
		//System.out.println(res_name);
		System.out.println(res_name);
		System.out.println(res_job);
	//	System.out.println(res_id);
	//	System.out.println(res_createdAt);

		//request body
		JsonPath jspreq=new JsonPath(Po_Re_Req.post_req_tc1());
		String req_name=jspreq.getString("name");
		String req_job=jspreq.getString("job");
		
				//validate response body 
		Assert.assertEquals(res_statuscode,201);
		Assert.assertEquals(res_name,req_name);
		Assert.assertEquals(res_job,req_job);
//		Assert.assertNotNull(res_id,"15");
//		Assert.assertNotNull(res_createdAt,"2023-05-05T08:28:13.425Z");

	}
}







