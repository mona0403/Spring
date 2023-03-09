package CoffeeController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import coffee.entity.Coffee;
@RestController
public class CoffeeController {


		
		private List<Coffee> coffees = new ArrayList<>();
		
		
		//Adding coffee to the list
		public CoffeeController() {
			coffees.addAll(List.of(new Coffee("Cappuccino", 400.00), new Coffee("Brewed coffee", 250.00), new Coffee("Americano", 450.00)));
		}
		
		//To display all the coffee in the list
		@RequestMapping(value = "/coffee", method = RequestMethod.GET)
		Iterable<Coffee> getAllLeds() {
			return coffees;

	}
	}

	