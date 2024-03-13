public class MadLibs {
  /*
This program generates a mad libbed story.
Author: Jesse
Date: 3/12/2024
  */
  	public static void main(String[] args){
      String name1 = "Beefy";
      String adjective1 = "strong";
      String adjective2 = "agile";
      String adjective3 = "sweet";
      String verb1 = "jumped";
      String noun1 = "Jesse";
      String noun2 = "Florida";
      String noun3 = "table";
      String noun4 = "tree";
      String noun5 = "Russia";
      String noun6 = "skateboard";
      String name2 = "Lena";
      int number = 22;
      String place1 = "Vegas";
      

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
