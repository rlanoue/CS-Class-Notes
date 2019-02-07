2/7/2019
Sharing Data Between Classes
Another way to share data is inheritence
-- Extended and Protected

Protected replaces get/set and is then able to be accessed inside the class and classes 
extended from the original class

Subclass and Superclass 

Subclasses get direct access to all of the public and protected data and methods from 
superclass
- May have to implement methods again if we need more specific behavior 
- If there is a chain of subclasses, the last subclass does have access to inherited things 
	from the superclass above it and all the way up to the top of the chain

