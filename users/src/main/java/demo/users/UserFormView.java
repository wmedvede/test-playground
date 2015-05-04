package demo.users;

import org.kie.formModeler.rendering.client.view.FormView;
import demo.users.UserFormModel;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import com.github.gwtbootstrap.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import com.github.gwtbootstrap.datepicker.client.ui.DateBox;
import com.github.gwtbootstrap.client.ui.CheckBox;
import java.lang.Override;

@Templated
@Named("UserFormView")
public class UserFormView extends FormView<UserFormModel>
{

   @Inject
   @Bound(property = "user.name")
   private TextBox user_name;
   @Inject
   @Bound(property = "user.lastName")
   private TextBox user_lastName;
   @Bound(property = "user.birthday")
   private DateBox user_birthday = new DateBox();
   @Inject
   @Bound(property = "user.married")
   private CheckBox user_married;

   @Override
   public void initInputNames()
   {
      inputNames.add("user_name");
      inputNames.add("user_lastName");
      inputNames.add("user_birthday");
      inputNames.add("user_married");
   }

   @Override
   public void setReadOnly(boolean readOnly)
   {
      user_name.setReadOnly(readOnly);
      user_lastName.setReadOnly(readOnly);
      user_birthday.setReadOnly(readOnly);
      user_married.setEnabled(!readOnly);
   }
}
