package demo.users.model;

import org.kie.formModeler.rendering.client.view.FormView;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import javax.inject.Named;
import com.github.gwtbootstrap.client.ui.TextBox;
import javax.inject.Inject;
import org.jboss.errai.ui.shared.api.annotations.Bound;
import com.github.gwtbootstrap.client.ui.IntegerBox;
import java.lang.Override;

@Templated
@Named("CompanyFormView")
public class CompanyFormView extends FormView<CompanyFormModel>
{

   @Inject
   @Bound(property = "company.name")
   private TextBox company_name;
   @Inject
   @Bound(property = "company.id")
   private TextBox company_id;
   @Inject
   @Bound(property = "company.employees")
   private IntegerBox company_employees;

   @Override
   public void initInputNames()
   {
      inputNames.add("company_name");
      inputNames.add("company_id");
      inputNames.add("company_employees");
   }

   @Override
   public void setReadOnly(boolean readOnly)
   {
      company_name.setReadOnly(readOnly);
      company_id.setReadOnly(readOnly);
      company_employees.setReadOnly(readOnly);
   }
}