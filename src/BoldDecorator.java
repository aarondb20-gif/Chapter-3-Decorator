public class BoldDecorator extends TextDecorator{

    public BoldDecorator (TextComponent textComponent){
        this.textComponent = textComponent;
    }

    @Override
    public String getText() {
        return "<b>" + textComponent.getText() + "</b>";
    }
}
