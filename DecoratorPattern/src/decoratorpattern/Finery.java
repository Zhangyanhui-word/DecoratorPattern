package decoratorpattern;
	 
	/**
	 * ∑˛ Œ¿‡[Decorator]
	 */
	public class Finery extends Person {
		private Person person;
		
		public Person getPerson() {
			return person;
		}
	 
		public void setPerson(Person person) {
			this.person = person;
		}
	 
		//¥Ú∞Á
		public void Decorate(Person person) {
			this.person = person;
		}
	 
		@Override
		public void show() {
			if (person != null) {
				person.show();
			}
		}
	 
	}
