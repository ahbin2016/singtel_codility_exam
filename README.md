# singtel_codility_exam

1. Can you implement the sing() method for the bird? `Done`
    - How did you unit test it? `Done` 
    - How did you optimize the code for maintainability? `For optimizing code to achive maintainability,
     fly and sing methods can be taken out from Bird and make interface for those methos. In this way, only birds that are supposed
     to fly will implement that interface.`

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
 - A duck says: “Quack, quack” `Duck iS A Bird that can also Fly and Swim`
 - A duck can swim `Duck iS A Bird that can Fly and Swim`
 - A chicken says: “Cluck, cluck” `Chicken iS A Bird`
 - A chicken cannot fly (assumption: its wings are clipped but ignore that) `Chicken iS A Bird that cannot Fly`