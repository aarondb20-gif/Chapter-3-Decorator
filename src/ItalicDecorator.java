public class ItalicDecorator extends TextDecorator{

    public ItalicDecorator (TextComponent textComponent){
        this.textComponent = textComponent;
    }
    @Override
    public String getText() {
        return "<i>" + textComponent.getText() + "</i>";
    }
}
