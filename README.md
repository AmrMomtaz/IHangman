# Ihangman

This is how my game works :

1)The changed the pacakge name to IHangman because the previous name created so many files and made errors

2)If the player wins a boolean win will indicate this win and will be set to true

3)If the user entered a wrong character (not alphabet) or he entered a repeated character the game would handle this and will do nothing and will wait for a next input

4)The user Loses if he exceeds the maximum number of moves and the game would throw an exception (as wanted in the pdf)

5)If the user didn't use the void setMaxWrongGuesses it would be automatically initialized to one mouvment

6)I provided a UI in the project

***In the testing part you should use the void Re_Initialize before you test because the class already initializes once we created an object from it (using constractors and fileds assignment).. So to test the game you should set the Mystery_Word and you sould Re_Initialize the game using the method to get the correct results

![image](https://user-images.githubusercontent.com/61145262/117564301-c40cc700-b0ab-11eb-8e93-3bbc8bda2644.png)
![image](https://user-images.githubusercontent.com/61145262/117564319-cd962f00-b0ab-11eb-98f9-fcbc4c2003ea.png)
![image](https://user-images.githubusercontent.com/61145262/117564333-d555d380-b0ab-11eb-884a-47444aa1363b.png)
