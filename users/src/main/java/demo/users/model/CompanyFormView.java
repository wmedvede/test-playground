package demo.users.model;

import org.livespark.formmodeler.rendering.client.view.FormView;
import demo.users.model.CompanyFormModel;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import com.github.gwtbootstrap.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import com.github.gwtbootstrap.client.ui.IntegerBox;
import java.lang.Override;

@Templated
@Named("CompanyFormView")
public class CompanyFormView extends FormView<CompanyFormModel>
{

   @Inject
   @Bound(property = "company.id")
   @DataField
   private TextBox company_id;
   @Inject
   @Bound(property = "company.name")
   @DataField
   private TextBox company_name;
   @Inject
   @Bound(property = "company.employees")
   @DataField
   private IntegerBox company_employees;

   @Override
   public void initInputNames()
   {
      inputNames.add("company_id");
      inputNames.add("company_name");
      inputNames.add("company_employees");
   }

   @Override
   public void setReadOnly(boolean readOnly)
   {
      company_id.setReadOnly(readOnly);
      company_name.setReadOnly(readOnly);
      company_employees.setReadOnly(readOnly);
   }
}