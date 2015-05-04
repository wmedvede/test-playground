package demo.users;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Address implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Street")
   private java.lang.String street;
   @org.kie.api.definition.type.Label(value = "Number")
   private java.lang.Integer number;
   @org.kie.api.definition.type.Label(value = "CP")
   private java.lang.String cp;
   @org.kie.api.definition.type.Label(value = "City")
   private java.lang.String city;

   public Address()
   {
   }

   public java.lang.String getStreet()
   {
      return this.street;
   }

   public void setStreet(java.lang.String street)
   {
      this.street = street;
   }

   public java.lang.Integer getNumber()
   {
      return this.number;
   }

   public void setNumber(java.lang.Integer number)
   {
      this.number = number;
   }

   public java.lang.String getCp()
   {
      return this.cp;
   }

   public void setCp(java.lang.String cp)
   {
      this.cp = cp;
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public Address(java.lang.String street, java.lang.Integer number,
         java.lang.String cp, java.lang.String city)
   {
      this.street = street;
      this.number = number;
      this.cp = cp;
      this.city = city;
   }

}