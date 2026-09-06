# Journal

Phase 1
The plain text class and the text decorator share the same interface , because the plain text
is a text component, and the text component has a text decorator. The text class has to 
implement the text component's methods, and the text decorator has to pass the component interface
to the decorator concrete classes in order to wrap or modify the methods.

Phase 2
We call the component inside the concrete classes to maintain open closed principle; that classes are open for
extension, but closed for modification. We want to be able to modify the text inside the concrete classes; not make
the component the source of the text by hardcoding it in there. When the BoldDecorator wraps the 
UpperCaseDecorator, the UpperCaseDecorator references the TextComponent first and is applied to the plain text, then
the BoldDecorator is applied to the plain text class.