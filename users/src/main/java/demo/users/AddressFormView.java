package demo.users;

import org.kie.formModeler.rendering.client.view.FormView;
import demo.users.AddressFormModel;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import com.github.gwtbootstrap.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import com.github.gwtbootstrap.client.ui.IntegerBox;
import java.lang.Override;

@Templated
@Named("AddressFormView")
public class AddressFormView extends FormView<AddressFormModel>
{

   @Inject
   @Bound(property = "address.street")
   private TextBox address_street;
   @Inject
   @Bound(property = "address.number")
   private IntegerBox address_number;
   @Inject
   @Bound(property = "address.cp")
   private TextBox address_cp;
   @Inject
   @Bound(property = "address.city")
   private TextBox address_city;

   @Override
   public void initInputNames()
   {
      inputNames.add("address_street");
      inputNames.add("address_number");
      inputNames.add("address_cp");
      inputNames.add("address_city");
   }

   @Override
   public void setReadOnly(boolean readOnly)
   {
      address_street.setReadOnly(readOnly);
      address_number.setReadOnly(readOnly);
      address_cp.setReadOnly(readOnly);
      address_city.setReadOnly(readOnly);
   }
}