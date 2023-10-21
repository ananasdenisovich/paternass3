class NewHTMLFileAdapter implements NewHTMLFile {
    private OldTextFile oldTextFile;

    public NewHTMLFileAdapter(OldTextFile oldTextFile) {
        this.oldTextFile = oldTextFile;
    }

    @Override
    public String getHTMLContent() {

        String plainText = oldTextFile.getContent();

        String htmlContent = "<p>" + plainText + "</p>";
        return htmlContent;
    }
}
