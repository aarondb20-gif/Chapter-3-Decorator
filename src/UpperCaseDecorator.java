public class UpperCaseDecorator extends TextDecorator{

    public UpperCaseDecorator (TextComponent textComponent){
        this.textComponent = textComponent;
    }
    @Override
    public String getText() {
        return textComponent.getText().toUpperCase();

    }
}
