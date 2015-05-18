package demo.users.model;

import org.livespark.formmodeler.rendering.client.view.FormView;
import demo.users.model.UserFormModel;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import com.github.gwtbootstrap.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import com.github.gwtbootstrap.datepicker.client.ui.DateBox;
import com.github.gwtbootstrap.client.ui.CheckBox;
import java.lang.Override;

@Templated
@Named("UserFormView")
public class UserFormView extends FormView<UserFormModel>
{

   @Inject
   @Bound(property = "user.id")
   @DataField
   private TextBox user_id;
   @Bound(property = "user.birthday")
   @DataField
   private DateBox user_birthday = new DateBox();
   @Inject
   @Bound(property = "user.lastName")
   @DataField
   private TextBox user_lastName;
   @Inject
   @Bound(property = "user.married")
   @DataField
   private CheckBox user_married;
   @Inject
   @Bound(property = "user.name")
   @DataField
   private TextBox user_name;

   @Override
   public void initInputNames()
   {
      inputNames.add("user_id");
      inputNames.add("user_birthday");
      inputNames.add("user_lastName");
      inputNames.add("user_married");
      inputNames.add("user_name");
   }

   @Override
   public void setReadOnly(boolean readOnly)
   {
      user_id.setReadOnly(readOnly);
      user_birthday.setReadOnly(readOnly);
      user_lastName.setReadOnly(readOnly);
      user_married.setEnabled(!readOnly);
      user_name.setReadOnly(readOnly);
   }
}