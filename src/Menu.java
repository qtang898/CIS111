public class Menu {
    
    private int _id;
    private String _menu;
    private Executable _executable;

    public Menu(int id, String menu, Executable executable) {
        _id = id;
        _menu = menu;
        _executable = executable;
    }

    public int getId() {
        return _id;
    }
    public  String getMenu() {
        return _menu;
    }
    public Executable getExecutable() {
        return _executable;
    }
}
