package demo.users.model;

import org.livespark.formmodeler.rendering.client.shared.FormModel;
import org.jboss.errai.common.client.api.annotations.Portable;
import org.jboss.errai.databinding.client.api.Bindable;
import javax.inject.Named;
import javax.validation.Valid;
import org.jboss.errai.common.client.api.annotations.MapsTo;

@Portable
@Bindable
@Named("CompanyFormModel")
public class CompanyFormModel extends FormModel
{

   @Valid
   private Company company;

   public CompanyFormModel()
   {
   }

   public CompanyFormModel(@MapsTo("company") Company company)
   {
      this.company = company;
   }

   public Company getCompany()
   {
      return company;
   }

   public void setCompany(Company company)
   {
      this.company = company;
   }
}