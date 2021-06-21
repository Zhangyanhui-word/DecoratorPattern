package decoratorpattern;	 
	/**
	 * 具体构建角色[ConcreteComponent]
	 */
	public abstract class Person {
		private String name;
	 
		public Person() {
		}
		
		public Person(String name) {
			this.name = name;
		}
		
		public abstract void show();
		
	}
