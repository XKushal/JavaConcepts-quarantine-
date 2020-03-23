package kushal.singh.door;

//Example of Anonymous Inner Class

public class AnonymousBox {
	Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return false;
			}else {
				return true;
			}
		}
		
	};

	public Lock getLock() {
		return lock;
	}
}
