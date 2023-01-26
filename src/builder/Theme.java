package builder;

public class Theme {
    private final ThemeType themeType;
    private final String background;
    private final String border;
    private final String icon;
    private final String music;

    public Theme(ThemeType themeType, String background,
                 String border, String icon, String music) {
        this.themeType = themeType;
        this.background = background;
        this.border = border;
        this.icon = icon;
        this.music = music;
    }

    public ThemeType getThemeType() {
        return themeType;
    }
    public String getBackground() {
        return background;
    }
    public String getBorder() {
        return border;
    }
    public String getIcon() {
        return icon;
    }
    public String getMusic() {
        return music;
    }
}

