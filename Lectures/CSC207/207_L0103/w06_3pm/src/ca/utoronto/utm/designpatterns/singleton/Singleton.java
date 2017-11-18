package ca.utoronto.utm.designpatterns.singleton;
// http://www.oodesign.com/singleton-pattern.html
public class Singleton {

	private static Singleton instance;

	private Singleton() {
	} // Notice this is private!!

	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();

		return instance;
	}

	public void doSomething() {

	}
}