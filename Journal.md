# Journal

Phase 1
The plain text class and the text decorator share the same interface , because the plain text
is a text component, and the text component has a text decorator. The text class has to 
implement the text component's methods, and the text decorator has to pass the component interface
to the decorator concrete classes in order to wrap or modify the methods.