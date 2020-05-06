package Encapsulation3;

public class Student {
   
   private String name, subj; 
   private int age; 
   private double cgpa;
   
   public void setName (String newName){
      name = newName;
   }
 
   public String getName(){
      return name;
   }
   
   public void setAge(int newAge){
      age = newAge;
   }
   
   public int getAge(){
      return age;
   }
   
    public void setCgpa(double cgpa){
      this.cgpa = cgpa;
   }
   
   public double getCgpa(){
      return cgpa;
   }
   
   public String getSubj (){
      return subj;
   }
   
}