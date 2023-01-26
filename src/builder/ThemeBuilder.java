package builder;

public class ThemeBuilder implements Builder {
    private ThemeType type;
    private String background;
    private String border;
    private String icon;
    private String music;

    public void setThemeType(ThemeType type) {
        this.type = type;
    }

    @Override
    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public void setBorder(String border) {
        this.border = border;
    }

    @Override
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public void setMusic(String music) {
        this.music = music;
    }

    public Theme getResult() {
        return new Theme(type, background, border, icon, music);
    }
}
