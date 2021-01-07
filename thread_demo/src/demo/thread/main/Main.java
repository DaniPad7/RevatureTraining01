package demo.thread.main;

import demo.thread.classes.Pages;
import demo.thread.run.RunOverride;

public class Main {

	public static void main(String[] args) {
		//remember to use thread class
		System.out.println(Thread.currentThread().getState()); //ok we get runnable
		
		System.out.println(Thread.currentThread());// we get [5,main.5]
		
		//let's create some some methods to implement in the thread shall we
		
		//ok now we have our methods in printer, let say there are 5 threads asking to do setPrint() and printTime()
		
		
		//our pages
		Pages page1 = new Pages();
		Pages page2 = new Pages();//great we have our pages now let's give special content
		page1.pageContent("This is page 1"); //the content is set
		page2.pageContent("This is page 2");
		
		System.out.println(page1.getContent());
		System.out.println(page2.getContent());
		
		RunOverride r1 = new RunOverride(page1, page2, 1); //great now that these guys are initialized they should appear in run()
		Thread t1 = new Thread(r1, "user 1");
		RunOverride r2 = new RunOverride(page1, page2, 2);
		Thread t2 = new Thread(r2,"user 2");
		
		RunOverride r3 = new RunOverride(page1, page2, 3);
		Thread t3 = new Thread(r3, "user 3");
		
		RunOverride r4 = new RunOverride(page1, page2, 4);
		Thread t4 = new Thread(r4, "user 4");
		
		RunOverride r5 = new RunOverride(page1, page2, 5);
		Thread t5 = new Thread(r5, "user 5");
		
		//what properties does t1 have, ok they are initialized 
		//remember that each thread represent a different user for this scenario so lets add more info in run()
		//will this have race condition behaviour let's see, no we must make RunOverride to Thread for sure, yes as written above
		// now start() will this have thread behaviour, yes
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
