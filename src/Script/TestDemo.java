package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseeTest;
import generic.Utility;

public class TestDemo extends BaseeTest{
	
	@Test
	public void testA()
	{

String data=Utility.getXLData(INPUT_PATH, "sheet1", 0, 0);
Reporter.log("Data:"+data,true);
int r=Utility.getXLRowCount(INPUT_PATH, "sheet1");
Reporter.log("Row:"+r,true);
//Assert.fail();

//String p=Utility.getPhoto(driver,PHOTO_PATH);
//Reporter.log("Photo:"+p,true);

}
}
