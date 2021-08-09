# Problem 01 Intro
Suppose you are given an array of ArraySet<Integer> instances. Write a non-member static method called checkDisjoint() which returns true if the intersection of the array is empty. In other words, a collection of N sets are disjointed if and only if they do not have any elements in common.

If the array is empty, the method returns true.

For example, suppose we have a `ArraySet<Integer>[] sets = [S1, S2, S3]`, where `S1 = {1,2,3}`, `S2 = {4,5}` and `S3 = {1}`.

A call to checkDisjoint(sets) should return false because the intersection of the array is `{1}`. In other words, `S1`, `S2`, `S3` have one element in common, which is `1`

Hints:

Remember that an intersection is just all of the elements that the Sets have in common. If there are no elements in common, the intersection should be empty!
There is a method that is implemented in the Set ADT called intersection(), use it!

---

# Problem 02 Intro
Suppose you are given an array of ArraySet<Integer> instances. Write a non-member static method called checkDisjoint() which returns true if the intersection of the array is empty. In other words, a collection of N sets are disjointed if and only if they do not have any elements in common.

If the array is empty, the method returns true.

For example, suppose we have a `ArraySet<Integer>[] sets = [S1, S2, S3]`, where `S1 = {1,2,3}`, `S2 = {4,5}` and `S3 = {1}`.

A call to checkDisjoint(sets) should return false because the intersection of the array is `{1}`. In other words, `S1`, `S2`, `S3` have one element in common, which is `1`

Hints:

Remember that an intersection is just all of the elements that the Sets have in common. If there are no elements in common, the intersection should be empty!
There is a method that is implemented in the Set ADT called intersection(), use it!


![equation](http://www.sciweavers.org/tex2img.php?eq=S_3+%3D+S_1+%5Ccap+S_2+%3D+%7Bx+%7C+x++%5Cin++S_1++%5Cwedge+x+%5Cin+S_2+%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=)

---

# Problem 03 Intro
Consider a member method for the LinkedBag implementation of the Bag ADT called `replace()`. This method receives two generic type values, the first is a value that must be searched for within the `Bag (oldValue)`, and the second is the value that will replace the `first (newValue)i`.

The goal of this method is to replace the value of the first occurrence of oldValue in the Bag. If there are no occurrences of oldValue inside the bag or the bag is empty, then nothing should be modified inside the bag.

For example, suppose we have a bag `B = {'A', 'B', 'C', 'D', 'B'}`. If we call `B.replace('B', 'Z')`, then `B` should now be `B = {'A', 'Z', 'C', 'D', 'B'}`

---

# Problem 04 Intro 
Consider a member method for the LinkedBag implementation of the Bag ADT called getFrequencyBag()

The method should return a bag of type integer containing the number of copies of each element inside the target bag. If the target bag is empty, the method should return an empty bag

For example, suppose we have a bag `B = {'A','B','B','D','B','C'}`. Then a call to B.getFrequencyBag() should return `frequencyBag = {1,3,1,1}`

This is because there is one copy of `'A'`, three copies of `'B'`, and one copy of `'C'`, and one copy of `'D'`

Note that bags don't have a notion of order, so these elements in frequencyBag won't have a relative order either

Hint: Read the document provided as to how to iterate and use nodes in a linked structure




