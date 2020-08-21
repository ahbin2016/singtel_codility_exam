# singtel_codility_exam

1.Can you implement the sing() method for the bird? `Done`
  - How did you unit test it? `Done` 
  - How did you optimize the code for maintainability? `For optimizing code to achive maintainability,
     fly and sing methods can be taken out from Bird and make interface for those methos. In this way, only birds that are supposed
     to fly will implement that interface.`

2.Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
 - A duck says: “Quack, quack” `Duck iS A Bird that can also Fly and Swim`
 - A duck can swim `Duck iS A Bird that can Fly and Swim`
 - A chicken says: “Cluck, cluck” `Chicken iS A Bird`
 - A chicken cannot fly (assumption: its wings are clipped but ignore that) `Chicken iS A Bird that cannot Fly`
 
3.Now how would you model a rooster?
 - A rooster says: “Cock-a-doodle-doo” `A Rooster IS A Chickem`
 - How is the rooster related to the chicken? `A Rooster is a kind of Chicken`
 - Can you think of other ways to model a rooster without using inheritance? `Rooster can be an Animal or a Bird and implements
   all related behaviour of Rooster`

4.Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
 - A parrot living with dogs says: “Woof, woof” `Implemented using a Sound Helper Class`
 - A parrot living with cats says: “Meow” `Implemented using a Sound Helper Class`
 - A parrot living near the rooster says: “Cock-a-doodle-doo” `Implemented using a Sound Helper Class` 
 - How do you keep the parrot maintainable? What if we need another parrot
   lives near a Duck? Or near a phone that rings frequently? `Implemented using a Sound Helper Class`
   
####B. Model fish as well as other swimming animals
1.In addition to the birds, can you model a fish?
 - Fishes don’t sing `Implemented extending Animal`
 - Fishes don’t walk `Implemented extending Animal`
 - Fishes can swim `Implemented extending Animal implementing Swim`
 
2.Can you specialize the fish as a Shark and as a Clownfish?
 - Sharks are large and grey `Implemented extending Fish`
 - Clownfish are small and colourful (orange) `Implemented extending Fish`
 - Clownfish make jokes `Implemented extending Fish`
 - Sharks eat other fish `Implemented extending Fish`
 
3.Dolphins are not exactly fish, yet, they are good swimmers
 - Can you model a dolphin that swims without inheriting from a fish class? `Model implementing Swim and Extending Animals without inheriting Fish`
 - How do you avoid duplicating code or introducing unneeded overhead? `Model implementing Swim and Extending Animals without inheriting Fish`
 
####Model animals that change their behaviour over time
1.Can you model a butterfly? 
 - A butterfly can fly `Model implementing Fly, Walk and Extending Animals`
 - A butterfly does not make a sound `Model implementing Fly, Walk and Extending Animals`
 
2.Can you optimize your model to account for the metamorphosis from caterpillar to
  butterfly?
 - A caterpillar cannot fly `Model optimised by adding Insect and State and introducing tranform() method`
 - A caterpillar can walk (crawl) `Model optimised by adding Insect and State and introducing tranform() method`
 
####Counting animals
 Suppose you have an array of animals, e.g.
 ```
 Animal[] animals = new Animal[]{
 new Bird(),
 new Duck(),
 new Chicken(),
 new Rooster(),
 new Parrot(),
 new Fish(),
 new Shark(),
 new Clownfish(),
 new Dolhpin(),
 new Frog(),
 new Dog(),
 new Butterfly(),
 new Cat()
 };
```

 Note: The above instantiation may be different if you chose to set up your object model
 differently… (hopefully you did)
1. Can you share the code to count: ``Created a util class to count animal``
 - how many of these animals can fly? ``Done``
 - how many of these animals can walk? ``Done``
 - how many of these animals can sing? ``Done``
 - how many of these animals can swim? ``Done``
 
####BONUS
####If you still have time left, please consider the following:
1.Can you add a second language (if you know a language other than English) Use the
 rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
 differently depending on language. Please add the rooster sound in your native
 tongue.
 ```
 • Danish: kykyliky
 • Dutch: kukeleku
 • Finnish: kukko kiekuu
 • French: cocorico
 • German: kikeriki
 • Greek: kikiriki
 • Hebrew: coo-koo-ri-koo
 • Hungarian: kukuriku
 • Italian: chicchirichi
 • Japanese: ko-ke-kok-ko-o
 • Portuguese: cucurucu
 • Russian: kukareku
 • Swedish: kuckeliku
 • Turkish: kuk-kurri-kuuu
 • Urdu: kuklooku
```
 - ``Done - Added Util class for Translation and Enum class for Language``
 
2.Can you design a RESTful API for querying these animals? ``Created a sample GET Endpoint``