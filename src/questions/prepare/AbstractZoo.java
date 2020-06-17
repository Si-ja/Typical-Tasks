package questions.prepare;

import java.util.ArrayList;

/**
 * Create a program that generates classes of animlas into a variable and make each animal
 * produce two actuins.
 *
 * For this case - a convenient way to approach this problem is to use abstract classes
 * You can learn about them here: https://www.youtube.com/watch?v=52frlN8webg&t=441s
 * Make sure each method is defined for every animal when they will be called. To do that,
 * simply extend the class.
 *
 * Here is an example of such case.
 */

public class AbstractZoo
{
    public static void main(String[] args)
    {
        // Create our small zoo
        ArrayList<Animal> zoo = new ArrayList<>();
        String[] choices = {"Lion", "Hyena", "Fish", "Wolf", "Fox"};
        // We will have 6 animals in our zoo...no particular reason why
        for (int i = 0; i < 6; i++)
        {
            // Generator a random value to pick from
            int random_animal = (int) (Math.random() * ((choices.length-1)+1)+0);
            String random_choice = choices[random_animal];
            switch (random_choice)
            {
                case ("Lion"):
                    Lion lion = new Lion();
                    lion.setName("Lion");
                    zoo.add(lion);
                    break;
                case ("Hyena"):
                    Hyena hyena = new Hyena();
                    hyena.setName("Hyena");
                    zoo.add(hyena);
                    break;
                case ("Fish"):
                    Fish fish = new Fish();
                    fish.setName("Fish");
                    zoo.add(fish);
                    break;
                case ("Wolf"):
                    Wolf wolf = new Wolf();
                    wolf.setName("Wolf");
                    zoo.add(wolf);
                    break;
                case("Fox"):
                    Fox fox = new Fox();
                    fox.setName("Fox");
                    zoo.add(fox);
                    break;
            }
        }

        // Now go through each aniaml twice and make them produce sounds and then sleep.
        System.out.println("-----Time to Play-----");
        for (int i = 0; i < 2; i++)
        {
            for (Animal animal : zoo)
            {
                switch(i)
                {
                    case (0):
                        System.out.print(animal.getName() + " says: ");
                        animal.speak();
                        break;
                    case (1):
                        System.out.print(animal.getName() + " sleeps: ");
                        animal.sleep();
                        break;
                }
            }
            System.out.println("-----Time to Sleep-----");
        }
    }
}

/**
 * An animal class makes sures that the user will have every method required for work
 * as some are not initially pre-defined or not seen to be appropriate to define with
 * prior settings (i.e. lions cannot bark as dogs, or produce sounds like other animals).
 */
abstract class Animal
{
    String name;

    /**
     * Make an animal sleep
     */
    public void sleep()
    {
        System.out.println("Zzz...");
    }

    // Set the name of the animal
    public void setName(String name)
    {
        this.name = name;
    }

    // Get the name of the animal
    public String getName()
    {
        return this.name;
    }

    /**
     * Make an animal produce a sound
     */
    public abstract void speak();
}

/**
 * Create now few classes of animals that we want to work with as a concept
 */
class Lion extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Roar!");
    }
}

class Hyena extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Huahuahua");
    }
}

class Fish extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Bloop...");
    }
}

class Wolf extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("Auuuu...");
    }
}

class Fox extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("..."); // Yeah, I know. The joke is from 2013...
    }
}