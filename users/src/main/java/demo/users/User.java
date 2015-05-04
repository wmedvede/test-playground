package demo.users;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class User implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "User Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "User Last Name")
   private java.lang.String lastName;
   @org.kie.api.definition.type.Label(value = "Birthday")
   private java.util.Date birthday;
   @org.kie.api.definition.type.Label(value = "Married")
   private java.lang.Boolean married;

   public User()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(java.lang.String lastName)
   {
      this.lastName = lastName;
   }

   public java.util.Date getBirthday()
   {
      return this.birthday;
   }

   public void setBirthday(java.util.Date birthday)
   {
      this.birthday = birthday;
   }

   public java.lang.Boolean getMarried()
   {
      return this.married;
   }

   public void setMarried(java.lang.Boolean married)
   {
      this.married = married;
   }

   public User(java.lang.String name, java.lang.String lastName,
         java.util.Date birthday, java.lang.Boolean married)
   {
      this.name = name;
      this.lastName = lastName;
      this.birthday = birthday;
      this.married = married;
   }

}