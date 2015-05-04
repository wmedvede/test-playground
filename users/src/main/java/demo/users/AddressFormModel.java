package demo.users;

import org.kie.formModeler.rendering.client.shared.FormModel;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import javax.inject.Named;
import javax.validation.Valid;
import org.jboss.errai.common.client.api.annotations.MapsTo;

@Portable
@Bindable
@Named("AddressFormModel")
public class AddressFormModel extends FormModel
{

   @Valid
   private Address address;

   public AddressFormModel()
   {
   }

   public AddressFormModel(@MapsTo("address") Address address)
   {
      this.address = address;
   }

   public Address getAddress()
   {
      return address;
   }

   public void setAddress(Address address)
   {
      this.address = address;
   }
}