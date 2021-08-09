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


![equation](http://www.sciweavers.org/tex2img.php?eq=1%2Bsin%28mc%5E2%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=)
![equation](http://www.sciweavers.org/tex2img.php?eq=S_3+%3D+S_1+%5Ccap+S_2+%3D+%7Bx+%7C+x++%5Cin++S_1++%5Cwedge+x+%5Cin+S_2+%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=)
