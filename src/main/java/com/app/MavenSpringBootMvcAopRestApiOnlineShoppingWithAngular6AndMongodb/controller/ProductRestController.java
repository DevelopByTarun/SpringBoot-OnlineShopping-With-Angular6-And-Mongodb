package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IProductDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Product;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@Autowired
    private IProductDAO productDAO;
	
	// all methods for new arrival products
	
	@GetMapping("/homePageArrival")
	public ResponseEntity<List<Product>> fetchAllCommonNewArrivalProducts(String arrival) throws Exception {
		List<Product> productListByHomePageArrival = productDAO.getAllProductsByArrival("NewArrival");
		return new ResponseEntity<List<Product>>(productListByHomePageArrival, HttpStatus.OK);
	}
	
	@GetMapping("/menPageArrival")
	public ResponseEntity<List<Product>> fetchAllMenNewArrivalProducts(String arrival) throws Exception {
		List<Product> productListByMenPageArrival = productDAO.getAllProductsByArrival("MenNewArrival");
		return new ResponseEntity<List<Product>>(productListByMenPageArrival, HttpStatus.OK);
	}
	
	@GetMapping("/womenPageArrival")
	public ResponseEntity<List<Product>> fetchAllWomenNewArrivalProducts(String arrival) throws Exception {
		List<Product> productListByWomenPageArrival = productDAO.getAllProductsByArrival("WomenNewArrival");
		return new ResponseEntity<List<Product>>(productListByWomenPageArrival, HttpStatus.OK);
	}
	
	// for men components
	
	@GetMapping("/menJeans")
	public ResponseEntity<List<Product>> fetchAllMenJeans(String category, String arrival) throws Exception {
		List<Product> menJeansList = productDAO.getAllProductsByCategoryAndArrival("MenJeans", "OldArrival");
		return new ResponseEntity<List<Product>>(menJeansList, HttpStatus.OK);
	}
	
	@GetMapping("/menTshirts")
	public ResponseEntity<List<Product>> fetchAllMenTshirts(String category, String arrival) throws Exception {
		List<Product> menTshirtsList = productDAO.getAllProductsByCategoryAndArrival("MenTshirts", "OldArrival");
		return new ResponseEntity<List<Product>>(menTshirtsList, HttpStatus.OK);
	}
	
	@GetMapping("/menShirts")
	public ResponseEntity<List<Product>> fetchAllMenShirts(String category, String arrival) throws Exception {
		List<Product> menShirtsList = productDAO.getAllProductsByCategoryAndArrival("MenShirts", "OldArrival");
		return new ResponseEntity<List<Product>>(menShirtsList, HttpStatus.OK);
	}
	
	@GetMapping("/menShoes")
	public ResponseEntity<List<Product>> fetchAllMenShoes(String category, String arrival) throws Exception {
		List<Product> menShoesList = productDAO.getAllProductsByCategoryAndArrival("MenShoes", "OldArrival");
		return new ResponseEntity<List<Product>>(menShoesList, HttpStatus.OK);
	}
	
	@GetMapping("/menWatches")
	public ResponseEntity<List<Product>> fetchAllMenWatches(String category, String arrival) throws Exception {
		List<Product> menWatchesList = productDAO.getAllProductsByCategoryAndArrival("MenWatches", "OldArrival");
		return new ResponseEntity<List<Product>>(menWatchesList, HttpStatus.OK);
	}
	
	@GetMapping("/menBelts")
	public ResponseEntity<List<Product>> fetchAllMenBelts(String category, String arrival) throws Exception {
		List<Product> menBeltsList = productDAO.getAllProductsByCategoryAndArrival("MenBelts", "OldArrival");
		return new ResponseEntity<List<Product>>(menBeltsList, HttpStatus.OK);
	}
	
	@GetMapping("/levis")
	public ResponseEntity<List<Product>> fetchAllLevisProducts(String brand, String arrival) throws Exception {
		List<Product> levisProductsList = productDAO.getAllProductsByBrandAndArrival("Levis", "OldArrival");
		return new ResponseEntity<List<Product>>(levisProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/spykar")
	public ResponseEntity<List<Product>> fetchAllSpykarProducts(String brand, String arrival) throws Exception {
		List<Product> spykarProductsList = productDAO.getAllProductsByBrandAndArrival("Spykar", "OldArrival");
		return new ResponseEntity<List<Product>>(spykarProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/puma")
	public ResponseEntity<List<Product>> fetchAllPumaProducts(String brand, String arrival) throws Exception {
		List<Product> pumaProductsList = productDAO.getAllProductsByBrandAndArrival("Puma", "OldArrival");
		return new ResponseEntity<List<Product>>(pumaProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/benetton")
	public ResponseEntity<List<Product>> fetchAllBenettonProducts(String brand, String arrival) throws Exception {
		List<Product> benettonProductsList = productDAO.getAllProductsByBrandAndArrival("Benetton", "OldArrival");
		return new ResponseEntity<List<Product>>(benettonProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/fastrack")
	public ResponseEntity<List<Product>> fetchAllFastrackProducts(String brand, String arrival) throws Exception {
		List<Product> fastrackProductsList = productDAO.getAllProductsByBrandAndArrival("Fastrack", "OldArrival");
		return new ResponseEntity<List<Product>>(fastrackProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/calvinKlein")
	public ResponseEntity<List<Product>> fetchAllCalvinKleinProducts(String brand, String arrival) throws Exception {
		List<Product> calvinKleinProductsList = productDAO.getAllProductsByBrandAndArrival("CalvinKlein", "OldArrival");
		return new ResponseEntity<List<Product>>(calvinKleinProductsList, HttpStatus.OK);
	}	
	
	// for women components
	
	@GetMapping("/womenSarees")
	public ResponseEntity<List<Product>> fetchAllWomenSarees(String category, String arrival) throws Exception {
		List<Product> womenSareesList = productDAO.getAllProductsByCategoryAndArrival("WomenSarees", "OldArrival");
		return new ResponseEntity<List<Product>>(womenSareesList, HttpStatus.OK);
	}
	
	@GetMapping("/womenSalwarSuits")
	public ResponseEntity<List<Product>> fetchAllWomenSalwarSuits(String category, String arrival) throws Exception {
		List<Product> womenSalwarSuitsList = productDAO.getAllProductsByCategoryAndArrival("WomenSalwarSuits", "OldArrival");
		return new ResponseEntity<List<Product>>(womenSalwarSuitsList, HttpStatus.OK);
	}
	
	@GetMapping("/womenHandbags")
	public ResponseEntity<List<Product>> fetchAllWomenHandbags(String category, String arrival) throws Exception {
		List<Product> womenHandbagsList = productDAO.getAllProductsByCategoryAndArrival("WomenHandbags", "OldArrival");
		return new ResponseEntity<List<Product>>(womenHandbagsList, HttpStatus.OK);
	}
	
	@GetMapping("/womenSandals")
	public ResponseEntity<List<Product>> fetchAllWomenSandals(String category, String arrival) throws Exception {
		List<Product> womenSandalsList = productDAO.getAllProductsByCategoryAndArrival("WomenSandals", "OldArrival");
		return new ResponseEntity<List<Product>>(womenSandalsList, HttpStatus.OK);
	}
	
	@GetMapping("/womenWatches")
	public ResponseEntity<List<Product>> fetchAllWomenWatches(String category, String arrival) throws Exception {
		List<Product> womenWatchesList = productDAO.getAllProductsByCategoryAndArrival("WomenWatches", "OldArrival");
		return new ResponseEntity<List<Product>>(womenWatchesList, HttpStatus.OK);
	}
	
	@GetMapping("/womenJewellery")
	public ResponseEntity<List<Product>> fetchAllWomenJewellery(String category, String arrival) throws Exception {
		List<Product> womenJewelleryList = productDAO.getAllProductsByCategoryAndArrival("WomenJewellery", "OldArrival");
		return new ResponseEntity<List<Product>>(womenJewelleryList, HttpStatus.OK);
	}
	
	@GetMapping("/prada")
	public ResponseEntity<List<Product>> fetchAllPradaProducts(String brand, String arrival) throws Exception {
		List<Product> pradaProductsList = productDAO.getAllProductsByBrandAndArrival("Prada", "OldArrival");
		return new ResponseEntity<List<Product>>(pradaProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/deepamSilks")
	public ResponseEntity<List<Product>> fetchAllDeepamSilksProducts(String brand, String arrival) throws Exception {
		List<Product> deepamSilksProductsList = productDAO.getAllProductsByBrandAndArrival("DeepamSilks", "OldArrival");
		return new ResponseEntity<List<Product>>(deepamSilksProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/paversEngland")
	public ResponseEntity<List<Product>> fetchAllPaversEnglandProducts(String brand, String arrival) throws Exception {
		List<Product> paversEnglandProductsList = productDAO.getAllProductsByBrandAndArrival("PaversEngland", "OldArrival");
		return new ResponseEntity<List<Product>>(paversEnglandProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/nineWest")
	public ResponseEntity<List<Product>> fetchAllNineWestProducts(String brand, String arrival) throws Exception {
		List<Product> nineWestProductsList = productDAO.getAllProductsByBrandAndArrival("NineWest", "OldArrival");
		return new ResponseEntity<List<Product>>(nineWestProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/tagHeuer")
	public ResponseEntity<List<Product>> fetchAllTagHeuerProducts(String brand, String arrival) throws Exception {
		List<Product> tagHeuerProductsList = productDAO.getAllProductsByBrandAndArrival("TagHeuer", "OldArrival");
		return new ResponseEntity<List<Product>>(tagHeuerProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/buccellati")
	public ResponseEntity<List<Product>> fetchAllBuccellatiProducts(String brand, String arrival) throws Exception {
		List<Product> buccellatiProductsList = productDAO.getAllProductsByBrandAndArrival("Buccellati", "OldArrival");
		return new ResponseEntity<List<Product>>(buccellatiProductsList, HttpStatus.OK);
	}

	// for discount components
	
	@GetMapping("/fiftyPercent")
	public ResponseEntity<List<Product>> fetchAllProductsHaveFiftyPercentDiscount(Integer discount, String arrival) throws Exception {
		List<Product> fiftyPercentProductsList = productDAO.getAllProductsByDiscountAndArrival(50, "OldArrival");
		return new ResponseEntity<List<Product>>(fiftyPercentProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/fourtyPercent")
	public ResponseEntity<List<Product>> fetchAllProductsHaveFourtyPercentDiscount(Integer discount, String arrival) throws Exception {
		List<Product> fourtyPercentProductsList = productDAO.getAllProductsByDiscountAndArrival(40, "OldArrival");
		return new ResponseEntity<List<Product>>(fourtyPercentProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/thirtyPercent")
	public ResponseEntity<List<Product>> fetchAllProductsHaveThirtyPercentDiscount(Integer discount, String arrival) throws Exception {
		List<Product> thirtyPercentProductsList = productDAO.getAllProductsByDiscountAndArrival(30, "OldArrival");
		return new ResponseEntity<List<Product>>(thirtyPercentProductsList, HttpStatus.OK);
	}
	
	@GetMapping("/twentyPercent")
	public ResponseEntity<List<Product>> fetchAllProductsHaveTwentyPercentDiscount(Integer discount, String arrival) throws Exception {
		List<Product> twentyPercentProductsList = productDAO.getAllProductsByDiscountAndArrival(20, "OldArrival");
		return new ResponseEntity<List<Product>>(twentyPercentProductsList, HttpStatus.OK);
	}	
	
	// edit product
	@GetMapping("/editproduct")
	public ResponseEntity<Product> callGetProduct(@RequestParam("id") String id) throws Exception {
		Product proud = productDAO.getProduct(id);
		return new ResponseEntity<Product>(proud, HttpStatus.OK);
	}

}
