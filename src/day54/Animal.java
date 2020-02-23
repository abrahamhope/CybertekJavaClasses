package day54;
    //we can refer an object with it's own type or it's super type

    public abstract class Animal{
        public abstract void speak ();
    }


      class Dog extends Animal implements IndoorPet {
        @Override
        public void speak() {
            System.out.println("BARK!");
        }

          @Override
          public void play() {

          }
      }




