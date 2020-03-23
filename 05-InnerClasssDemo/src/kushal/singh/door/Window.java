package kushal.singh.door;

//Example of local inner class

public class Window {
	public boolean isLocked(String key) {
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {
					return false;
				}else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}
}
