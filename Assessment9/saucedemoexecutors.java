package saucedemo;

public class saucedemoexecutors {
	saucedemo_key k = new saucedemo_key();
	public void executors(String keyword) {
		if(keyword.equals("LAUNCH_BROWSER")) {
			k.launchBrowser();
		}
		else if(keyword.equals("OPEN_URL")) {
			k.openurl();
		}
		else if(keyword.equals("USERNAME")) {
			k.username();
		}
		else if(keyword.equals("PASSWORD")) {
			k.password();
		}
		else if(keyword.equals("LOGIN_BUTTON")) {
			k.loginbutton();
		}
		else if(keyword.equals("CLOSE_BROWSER")) {
			k.closebrowser();
		
	}

}
}
