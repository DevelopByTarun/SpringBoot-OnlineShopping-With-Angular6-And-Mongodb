package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RefreshingAppController {
				
	@RequestMapping({
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/signin",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/signinsuccess",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/signinerror",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/signup",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/signupsuccess",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/about",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/contact",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menwearpage",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menbelts",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menjeans",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menshirts",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menshoes",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/mentshirts",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menwatches",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menlevis",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menspykar",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menpuma",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menbenetton",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/mencalvinklein",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/menfastrack",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenwearpage",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenhandbags",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenjewellery",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womensalwarsuits",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womensandals",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womensarees",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenwatches",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenprada",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womendeepamsilks",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenpaversengland",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenninewest",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womentagheuer",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/womenbuccellati",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/fiftydiscount",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/fourtydiscount",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/thirtydiscount",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/twentydiscount",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/orders",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/checkout",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/placeorder",
		"/MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb/notfound"
	})
	public String showHomePageAfterRefreshingAppThroughBrowser() {
		return "forward:/index.html";
	}
}
