public class Main {
    public static void main(String[] args) {

        OldTextFile oldFile = new OldTextFile("Some old text.");

        NewHTMLFile newFile = new NewHTMLFileAdapter(oldFile);

        System.out.println("HTML Content: " + newFile.getHTMLContent());
    }
}
