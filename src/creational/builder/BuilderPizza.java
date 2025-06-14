package builder;

import java.util.ArrayList;
import java.util.List;

// Instead of passing all ingredients in constructor, we can assign them 
// one by one and then use build to return the whole object
public class BuilderPizza {
	private final String        cheeseType;
	private final List<String>  extras;
	private final boolean       crusty;

	private BuilderPizza(Builder builder) {
		this.cheeseType = builder.cheeseType;
		this.crusty = builder.crusty;
		this.extras = builder.extras;
	}

	public void showPizza() {
		System.out.println("Cheese: " + this.cheeseType);
		System.out.println("Crusty: " + this.crusty);
		System.out.println("Extras: " + this.extras);
	}

	// the main logic of DP of Builder starts here
	public static class Builder {
		private String          cheeseType;
		private boolean         crusty;
		private List<String>    extras = new ArrayList<>();

		public Builder addCheeseType(String cheeseType) {
			this.cheeseType = cheeseType;
			return this;
		}

		public Builder addExtras(String[] extras) {
			for (String item : extras) {
				this.extras.add(item);
			}
			return this;
		}

		public Builder addCrusty(boolean crusty) {
			this.crusty = crusty;
			return this;
		}

		public BuilderPizza build() {
			return new BuilderPizza(this);
		}
	}
} 