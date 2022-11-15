package Gokomodo.FE.Web.Seller.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;



@Resource.Classpath("ApplicationConfig.properties")
public class ApplicationConfigReader 
{
	
	public ApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}

	@Property(value = "UsrSeller")
	private String usrSeller;
	@Property(value = "UsrSeller2")
	private String usrSeller2;
	@Property(value= "Password")
	private String pwdSeller;
	@Property(value = "BrowserFirefox")
	private String BrowserSeller;
	
	@Property(value="UrlSeller")
	private String WebsiteUrlSeller;
	
	@Property(value="MaxPageLoadTime")
	private int MaxPageLoadTime;
	
	@Property(value="ImplicitlyWait")
	private int ImplicitlyWait;
	
	@Property(value="VideoFeature")
	private String VideoFeature;

	@Property(value = "SellerProd1")
	private String sellerprod1;

	@Property(value = "passwordProdSeller1")
	private String passwordprodseller1;

	public String getUsrSeller(){return usrSeller;}
	public String getUsrSeller2(){return usrSeller2;}
	public String getPwdSeller(){return pwdSeller;}

	public String getBrowserSeller() {
		return BrowserSeller;
	}

	public String getWebsiteUrlSeller() {
		return WebsiteUrlSeller;
	}

	public int getMaxPageLoadTime() {
		return MaxPageLoadTime;
	}

	public int getImplicitlyWait() {
		return ImplicitlyWait;
	}

	public String getVideoFeature() {
		return VideoFeature;
	}

	public String getSellerprod1(){return sellerprod1;}
	public String getPasswordprodseller1(){return passwordprodseller1;}
}
