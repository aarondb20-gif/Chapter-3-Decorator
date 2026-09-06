public class Main {
    public static void main(String[] args) {
        TextComponent text1 = new PlainText();
        TextComponent text2 = new BoldDecorator(new PlainText());
        TextComponent text3 = new BoldDecorator(new ItalicDecorator(new PlainText()));
        TextComponent text4 = new BoldDecorator(new ItalicDecorator(new UpperCaseDecorator(new PlainText())));

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
    }
}
