package ebaydealsautomation.pageobject;

import ebaydealsautomation.pageobject.components.FeaturedDeals;
import ebaydealsautomation.pageobject.components.SpotlightDeals;
import ebaydealsautomation.pageobject.components.TrendingDeals;

public class HubPage extends BasePageObject {
	
	private FeaturedDeals featuredDeal;
	private TrendingDeals trendingDeal;
	private SpotlightDeals spotlightDeal;
	
	public HubPage(){
		super();
		System.out.println("I am in Hub page constructor.");
	}
	
	public FeaturedDeals getFeaturedDeals(){
		return new FeaturedDeals();
	}
	
	public TrendingDeals getTrendingDeals(){
		return new TrendingDeals();
	}
	
	public SpotlightDeals getSpotlightDeals(){
		return new SpotlightDeals();
	}

}
