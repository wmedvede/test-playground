package demo.users;

import org.kie.formModeler.rendering.client.shared.FormModel;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import javax.inject.Named;
import javax.validation.Valid;
import org.jboss.errai.common.client.api.annotations.MapsTo;

@Portable
@Bindable
@Named("UserFormModel")
public class UserFormModel extends FormModel
{

   @Valid
   private User user;

   public UserFormModel()
   {
   }

   public UserFormModel(@MapsTo("user") User user)
   {
      this.user = user;
   }

   public User getUser()
   {
      return user;
   }

   public void setUser(User user)
   {
      this.user = user;
   }
}