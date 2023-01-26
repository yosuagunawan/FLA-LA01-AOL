package user;

import builder.Theme;
import builder.ThemeBuilder;
import director.Director;

public class PostAdapter {

//====================================================
//======================= THEME ======================
//====================================================
	public Theme themeCreate(String str) {
		Director director = new Director();

	    ThemeBuilder builder = new ThemeBuilder();
	    
	    switch (str) {
		case "Serenity":
			director.constructSerenityTheme(builder);
			break;
		case "Party":
			director.constructPartyTheme(builder);
			break;
		case "Heroes":
			director.constructHeroesTheme(builder);
			break;
		case "Gold":
			director.constructGoldTheme(builder);
			break;
		case "VIP":
			director.constructVIPTheme(builder);
			break;
		}
	    Theme theme = builder.getResult();
	    
	    return theme;
	}
//====================================================
//====================== CONTENT =====================
//====================================================
	
	public Integer wordmax(String str) {
		switch (str) {
		case "Standard":
			return 500;
		case "Gold":
			return 1000;
		case "VIP":
			return 1000;
		}
		return 0;
	}
	
}
