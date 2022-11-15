package Gokomodo.FE.Web.Admin.controllers;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;



@Resource.Classpath("ApplicationConfig.properties")
public class AdminApplicationConfigReader
{
	
	public AdminApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}
	
	@Property(value = "BrowserFirefox")
	private String BrowserGlobal;
	
	@Property(value="UrlAdmin")
	private String WebsiteUrlAdmin;
	
	@Property(value="MaxPageLoadTime")
	private int MaxPageLoadTime;
	
	@Property(value="ImplicitlyWait")
	private int ImplicitlyWait;
	
	@Property(value="VideoFeature")
	private String VideoFeature;

	@Property(value = "AdminArum")
	private String userAdmin;

	@Property(value = "AdminDeny")
	private String userAdmin2;

	@Property(value = "Password")
	private String passAdmin;

	@Property(value = "Password2")
	private String passAdmin2;



	public String getBrowserGlobal() {return BrowserGlobal;}

	public String getWebsiteUrlAdmin() {
		return WebsiteUrlAdmin;
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

	public String getUserAdmin() { return userAdmin;}

	public String getPassAdmin() {return passAdmin;}

	public String getUserAdmin2() {return userAdmin2;}
	public String getPassAdmin2() {return passAdmin2;}



}
