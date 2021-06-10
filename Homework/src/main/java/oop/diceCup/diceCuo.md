```plantuml

class DiceCup{
	..Attributes..
	- int[] diceValues
	- Dice[] diceList
}
note right: create 6 dices, roll them and print its values


class Dice{
	..Constructer..
	..Attributes..
	- Int MIN
	- Int MAX
	..Methods..
	+ rollAndGetValue()
}
note right: can roll and save value in a variable
DiceCup o-->  Dice : has 1 to n dices

```
