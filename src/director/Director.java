package director;

import builder.Builder;
import builder.ThemeType;

public class Director {
    public void constructSerenityTheme(Builder builder) {
        builder.setThemeType(ThemeType.SERENITY);
        builder.setBackground("#EFEFEF");
        builder.setBorder("solid, warna putih salju dengan bayangan hitam");
        builder.setIcon("rubah putih");
        builder.setMusic("musik yang tenang");
    }

    public void constructPartyTheme(Builder builder) {
        builder.setThemeType(ThemeType.PARTY);
        builder.setBackground("#F9A7B0");
        builder.setBorder("putus-putus, warna merah maroon");
        builder.setIcon("gambar orang berdansa");
        builder.setMusic("musik yang semangat dan menarik");
    }


    public void constructHeroesTheme(Builder builder) {
        builder.setThemeType(ThemeType.HEROES);
        builder.setBackground("#376282");
        builder.setBorder("solid, warna abu-abu gelap metalik");
        builder.setIcon("gambar superhero");
        builder.setMusic("musik orkestra yang tegang dan bersemangat");
    }

    public void constructGoldTheme(Builder builder) {
        builder.setThemeType(ThemeType.GOLD);
        builder.setBackground("#FFD700");
        builder.setBorder("solid, emas gelap");
        builder.setIcon("gambar koin emas");
        builder.setMusic("musik klasik");
    }

    public void constructVIPTheme(Builder builder) {
        builder.setThemeType(ThemeType.VIP);
        builder.setBackground("#E5E4E2");
        builder.setBorder("solid, warna putih bersih");
        builder.setIcon("gambar mahkota");
        builder.setMusic("musik klasik");
    }
}
