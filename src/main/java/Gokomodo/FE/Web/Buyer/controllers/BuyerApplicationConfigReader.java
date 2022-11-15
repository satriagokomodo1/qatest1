package Gokomodo.FE.Web.Buyer.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;


@Resource.Classpath("ApplicationConfig.properties")
public class BuyerApplicationConfigReader
{
	
	public BuyerApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}
	
	@Property(value = "BrowserFirefox")
	private String BrowserBuyer;
	
	@Property(value="UrlBuyer")
	private String WebsiteUrlBuyer;
	
	@Property(value="MaxPageLoadTime")
	private int MaxPageLoadTime;
	
	@Property(value="ImplicitlyWait")
	private int ImplicitlyWait;
	
	@Property(value="VideoFeature")
	private String VideoFeature;
	@Property(value = "UsrNausee")
	private String usrNauseee1;
	@Property(value = "UsrNausee5")
	private String userNausee5;
	@Property(value = "Usrcommerce1")
	private String userCommerce1;
  
	@Property(value = "Password")
	private String passwordAccount;



	@Property(value = "BuyerIntegration")
	 String BuyerIntegration;

	@Property(value = "BuyerIntegrationBifrost")
	private String BuyerIntegrationBifrost;
	
	@Property(value = "Production1")
	private String production1;

	@Property(value = "PasswordProd")
	private String passwordProd;

  public String getBuyerIntegrationBifrost () {return BuyerIntegrationBifrost;}
	public String getBuyerIntegration() {return BuyerIntegration;}
	public String getPasswordAccount() {return passwordAccount;}
	public String getUsrNauseee1(){return usrNauseee1;}
	public String getUserNausee5(){return userNausee5;}
	public String getUserCommerce1(){return userCommerce1;}

	//Production
	public String getProduction1() {return production1;}
	public String getPasswordProd(){return passwordProd;}
	//

	public String getBrowserBuyer() {

		return BrowserBuyer;
	}

	public String getWebsiteUrlBuyer() {
		return WebsiteUrlBuyer;
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

	//================== attachment ===============//
	//Alam
	@Property(value = "Attachment1Eproc")
	private String AttachemntEproc1;

	@Property(value = "Attachment1Corpcomm")
	private String AttachemntCorpcomm1;

	@Property(value = "Attachment1Foto")
	private String AttachemntFoto1;

	//Iwan
	@Property(value = "Attachment2Eproc")
	private String AttachemntEproc2;

	@Property(value = "Attachment2Corpcomm")
	private String AttachemntCorpcomm2;

	@Property(value = "Attachment2Foto")
	private String AttachemntFoto2;

	//============================================//

	//////////////////////////////////////////////////
	//Alam
	public String getAttachemntEproc1() {return AttachemntEproc1;}
	public String getAttachemntCorpcomm1() {return AttachemntCorpcomm1;}
	public String getAttachemntFoto1() {return AttachemntFoto1;}

	//Iwan
	public String getAttachemntEproc2() {return AttachemntEproc2;}
	public String getAttachemntCorpcomm2() {return AttachemntCorpcomm2;}
	public String getAttachemntFoto2() {return AttachemntFoto2;}

}
