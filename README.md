# Problem 01 Intro
Suppose you are given an array of ArraySet<Integer> instances. Write a non-member static method called checkDisjoint() which returns true if the intersection of the array is empty. In other words, a collection of N sets are disjointed if and only if they do not have any elements in common.

If the array is empty, the method returns true.

For example, suppose we have a `ArraySet<Integer>[] sets = [S1, S2, S3], where S1 = {1,2,3}, S2 = {4,5} and S3 = {1}`.

A call to checkDisjoint(sets) should return false because the intersection of the array is `{1}`. In other words, `S1`, `S2`, `S3` have one element in common, which is `1`

Hints:

Remember that an intersection is just all of the elements that the Sets have in common. If there are no elements in common, the intersection should be empty!
There is a method that is implemented in the Set ADT called intersection(), use it!


#Problem 02 Intro
Suppose you are given an array of ArraySet<Integer> instances. Write a non-member static method called checkDisjoint() which returns true if the intersection of the array is empty. In other words, a collection of N sets are disjointed if and only if they do not have any elements in common.

If the array is empty, the method returns true.

For example, suppose we have a ArraySet<Integer>[] sets = [S1, S2, S3], where S1 = {1,2,3}, S2 = {4,5} and S3 = {1}.

A call to checkDisjoint(sets) should return false because the intersection of the array is {1}. In other words, S1, S2, S3 have one element in common, which is 1

Hints:

Remember that an intersection is just all of the elements that the Sets have in common. If there are no elements in common, the intersection should be empty!
There is a method that is implemented in the Set ADT called intersection(), use it!


![formula](https://render.githubusercontent.com/render/math?math=S_3 = S_1 \cap S_2 = {x | x  \in  S_1  \wedge x \in S_2 })
